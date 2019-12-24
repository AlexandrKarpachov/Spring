package ru.job4j.music;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
	@SuppressWarnings("serial")
	private List<String> songs = new ArrayList<String>() {
		{
			add("La - la - la");
			add("U nas na rayone");
			add("Chandelier");
		}
	};
	
	@Override
	public List<String> getMusic() {
		return songs;
	}

}
