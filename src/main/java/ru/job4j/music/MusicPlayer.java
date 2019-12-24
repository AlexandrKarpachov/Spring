package ru.job4j.music;

import java.util.List;
import java.util.Objects;

public class MusicPlayer {
	private List<Music> music;
	private String name;
	private int volume;
    
	public MusicPlayer() {
    }

	public void playMusic() {
    	for (Music song : music) {
    		System.out.println("Playing: " + song.getSong());
    	}
    }
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<Music> getMusic() {
		return music;
	}

	public void setMusic(List<Music> music) {
		this.music = music;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(music, name, volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MusicPlayer other = (MusicPlayer) obj;
		return Objects.equals(music, other.music) && Objects.equals(name, other.name) && volume == other.volume;
	}

	@Override
	public String toString() {
		return String.format("MusicPlayer [music=%s, name=%s, volume=%s]", music, name, volume);
	}

	
}
