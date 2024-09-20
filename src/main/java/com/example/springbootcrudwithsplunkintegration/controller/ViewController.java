package com.example.springbootcrudwithsplunkintegration.controller;

import com.example.springbootcrudwithsplunkintegration.service.VideoStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @Autowired
    private VideoStatsService videoStatsService;

    @PostMapping("/thumbsUp")
    public String thumbsUp() {
        videoStatsService.thumbsUp();
        return "Thumbs up count: " + videoStatsService.getThumbsUpCount();
    }

    @GetMapping("/thumbsUpCount")
    public String getThumbsUpCount() {
        return "Thumbs up count: " + videoStatsService.getThumbsUpCount();
    }
}