package ru.job4j.music;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @SuppressWarnings("serial")
	private List<String> songs = new ArrayList<String>() {
		{
			add("Hungarian Rhapsody");
			add("Flight Of The Bumblebee");
			add("The Four Seasons");
		}
	};
	
	@Override
	public List<String> getMusic() {
		return songs;
	}
}