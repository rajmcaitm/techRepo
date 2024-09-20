package com.example.springbootcrudwithsplunkintegration.repo;

import com.example.springbootcrudwithsplunkintegration.entity.VideoStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoStatsRepository extends JpaRepository<VideoStats, Long> {

}