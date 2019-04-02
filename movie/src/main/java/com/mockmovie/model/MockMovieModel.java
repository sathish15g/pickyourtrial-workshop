package com.mockmovie.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MockMovieModel {
	
	@JsonProperty("page")
	private int page;
	
	@JsonProperty("per_page")
	private int perPage;
	
	@JsonProperty("total")
	private int total;
	
	@JsonProperty("total_pages")
	private int totalPages;
	
	@JsonProperty("data")
	private List<MockMovieData> mockMovieData;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<MockMovieData> getMockMovieData() {
		return mockMovieData;
	}

	public void setMockMovieData(List<MockMovieData> mockMovieData) {
		this.mockMovieData = mockMovieData;
	}
	
	
	
}
