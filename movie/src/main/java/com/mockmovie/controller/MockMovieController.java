package com.mockmovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mockmovie.service.MockMovieService;

@RestController
@RequestMapping("/mockservice")
public class MockMovieController {
	

	@Autowired
	private MockMovieService mockMovieService;
	
	@RequestMapping(value = "/getTitles")
	private ResponseEntity<List<String>> getMovieListByTitleOrderByAsc(@RequestParam( value="Title",required=true) String title) throws Exception {
		List<String> titleList = mockMovieService.getMovieTitleList(title);
		return new ResponseEntity<List<String>>(titleList, HttpStatus.ACCEPTED);
	}

}
