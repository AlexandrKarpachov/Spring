package ru.job4j.music;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {
			
			MusicPlayer player = context.getBean(MusicPlayer.class);
			String expecting = "Playing: Hungarian Rhapsody" + System.lineSeparator()
					+ "Playing: Du, Du Hust!" + System.lineSeparator()
					+ "Playing: La - la - la" + System.lineSeparator();
					
			player.playMusic();
			
		
	 }
		
		
	}
}
