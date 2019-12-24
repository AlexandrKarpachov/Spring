package ru.job4j.music;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {
			

	        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

	        musicPlayer.playMusic(Style.CLASSICAL);
	        musicPlayer.playMusic(Style.ROCK);
	        musicPlayer.playMusic(Style.POP);
			
			
		
	 }
		
		
	}
}
