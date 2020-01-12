package com.crawler.service;

import com.crawler.dto.CrawlerReqDto;

public interface ICrawlerService {

	Boolean crawlSiteAndStoreData(CrawlerReqDto crawlDto);
	
}
