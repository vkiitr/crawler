package com.crawler.dto;

public class CrawlerReqDto {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CrawlerReqDto [url=" + url + "]";
	}

}
