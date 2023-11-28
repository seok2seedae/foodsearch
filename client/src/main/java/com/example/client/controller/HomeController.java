package com.example.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequestMapping("/home")
@Controller
public class HomeController {

    @GetMapping("/search")
    public void search(){
        log.info("search in....");
    }

//    @ResponseBody
//    @GetMapping(path="/search")
//    public MyFoodDto get(@RequestParam String query, Model m) {
//        var result = myFoodService.search(query);
//        m.addAttribute("test", myFoodService.search(query));
//        return result;
//    }
}
