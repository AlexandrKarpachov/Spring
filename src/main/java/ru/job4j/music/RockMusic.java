package ru.job4j.music;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@SuppressWarnings("serial")
	private List<String> songs = new ArrayList<String>() {
		{
			add("Du, Du Hust!");
			add("Lonely day");
			add("Numb");
		}
	};
	
	@Override
	public List<String> getMusic() {
		return songs;
	}
}
