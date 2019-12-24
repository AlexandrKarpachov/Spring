package ru.job4j.music;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicPlayerTest {

	private final PrintStream stdOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    @Before
    public void before() {
        System.setOut(new PrintStream(this.out));
    }
    
    @After
    public void backOutput() {
        System.setOut(stdOut);
    }
    
	@Test
	public void whenPlayMusicThanAllSongWrites() {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {
			
			MusicPlayer player = context.getBean(MusicPlayer.class);
			String expecting = "Playing: Hungarian Rhapsody" + System.lineSeparator()
					+ "Playing: Du, Du Hust!" + System.lineSeparator()
					+ "Playing: La - la - la" + System.lineSeparator();
					
			player.playMusic();
			
			assertThat(out.toString(), is(expecting));
		}
	}
	
	@Test
	public void whenGetParametersThanReturnParametersFromPropertyFile() {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {
			
			MusicPlayer player = context.getBean(MusicPlayer.class);
			
			assertThat(player.getName(), is("player"));
			assertThat(player.getVolume(), is(50));
		}
	}
	

}
