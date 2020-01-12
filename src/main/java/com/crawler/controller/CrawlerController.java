package com.crawler.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crawler.dto.CrawlerReqDto;
import com.crawler.service.ICrawlerService;

@RestController
public class CrawlerController {

	@Autowired
	private ICrawlerService crawlerService;
	
	@GetMapping(value = "/test")
	public @ResponseBody Map<String, Long> testConnection() {
		Map<String, Long> map = new HashMap<>();
	    map.put("response", 0L);
	    map.put("currentTime", System.currentTimeMillis());
	    return map;
	}
	
	@PostMapping(value = "/crawls", consumes = "application/json", produces = "application/json")
	public @ResponseBody CrawlerReqDto crawlSite(@RequestBody CrawlerReqDto crawlDto) {
		System.out.println(crawlDto);
		crawlerService.crawlSiteAndStoreData(crawlDto);
		return crawlDto;
	}
}