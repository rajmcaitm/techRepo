package com.example.springbootcrudwithsplunkintegration.service;

import com.example.springbootcrudwithsplunkintegration.entity.VideoStats;
import com.example.springbootcrudwithsplunkintegration.repo.VideoStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoStatsService {

    @Autowired
    private VideoStatsRepository videoStatsRepository;

    public void thumbsUp() {
        VideoStats videoStats = videoStatsRepository.findById(1L).orElse(new VideoStats());
        videoStats.setThumbsUpCount(videoStats.getThumbsUpCount() + 1);
        videoStatsRepository.save(videoStats);
    }

    public int getThumbsUpCount() {
        VideoStats videoStats = videoStatsRepository.findById(1L).orElse(new VideoStats());
        return videoStats.getThumbsUpCount();
    }
}