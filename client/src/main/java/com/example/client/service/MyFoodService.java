package com.example.client.service;

import com.example.client.component.NaverApis;
import com.example.client.dto.MyFoodDto;
import com.example.client.dto.naver.ReqImageDto;
import com.example.client.dto.naver.ReqLocalDto;
import com.example.client.dto.naver.ResImageDto;
import com.example.client.dto.naver.ResLocalDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MyFoodService {

    private final NaverApis naverApis;


    // local 검색해서 image 검색을 해야 한다.
    public MyFoodDto search(String query) {
        var localReq = ReqLocalDto.builder()
                .query(query).build();

        var localRes = naverApis.searchLocal(localReq);
        if(localRes.getItems().size() > 0) {

        }
        var localItem = localRes.getItems().get(0);
        var title = localItem.getTitle();
        title = title.strip().replaceAll("<[^>]*>", "");

        var imageReq = ReqImageDto.builder()
                .query(title).build();
        var imageRes = naverApis.searchImage(imageReq);
        var imageItem = imageRes.getItems().get(0);

        return MyFoodDto.builder()
                .imgUrl(imageItem.getLink())
                .title(title)
                .addr(localItem.getAddress())
                .roadAddr(localItem.getRoadAddress())
                .homepage(localItem.getLink())
                .category(localItem.getCategory())
                .build();
    }
}
