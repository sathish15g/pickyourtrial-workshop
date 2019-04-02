package com.mockmovie.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MockMovieData {
	
	@JsonProperty("Poster")
	private String poster;

	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Type")
	private String type;
	
	@JsonProperty("Year")
	private String year;
	
	@JsonProperty("imdbID")
	private String imdbID;

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	
}
