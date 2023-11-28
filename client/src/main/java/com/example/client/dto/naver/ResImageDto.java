package com.example.client.dto.naver;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResImageDto {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<ItemList> items;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class ItemList {
        private String title;
        private String link;
        private String thumbnail;
        private String sizeheight;
        private String sizewidth;
    }
}
