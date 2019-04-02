package com.mockmovie.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.mockmovie.model.MockMovieData;
import com.mockmovie.model.MockMovieModel;

@Service
public class MockMovieService {
	
	@Value("${jsonmock.hackerrank.base.url}")
	private String jsonmockHackerRankBaseUrl;


	@Autowired
	private RestTemplate restTemplate;

	public List<String> getMovieTitleList(String title) throws Exception {
		
		if(title.isEmpty() || title == null) {
			throw new Exception("Title cannot be null or Empty");
		}
		
		int i = 1;
		List<MockMovieModel> mockMovieModels = new ArrayList<>();
		int totalPages = 1;

		do {
			UriComponentsBuilder builder = UriComponentsBuilder
					.fromUriString(jsonmockHackerRankBaseUrl.concat("/movies/search/")).queryParam("Title", title)
					.queryParam("page", i);
			MockMovieModel mockMovieModel = restTemplate.getForObject(builder.build().toUri(), MockMovieModel.class);
			totalPages = mockMovieModel.getTotalPages();
			mockMovieModels.add(mockMovieModel);
		} while (i++ < totalPages);

		List<String> titleList = new ArrayList<>();
		for (MockMovieModel mockMovieModel : mockMovieModels) {
			List<MockMovieData> mockMovieDatas = mockMovieModel.getMockMovieData();
			for (MockMovieData mockMovieData : mockMovieDatas) {
				titleList.add(mockMovieData.getTitle());
			}

		}

		Collections.sort(titleList);

		return titleList;
	}

}
