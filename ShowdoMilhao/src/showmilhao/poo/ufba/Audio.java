package showmilhao.poo.ufba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Audio {

	public static void tocarSom(File nomeDoSom) throws IOException, InterruptedException {
		InputStream som;
		
		try {
			
			som = new FileInputStream(nomeDoSom);
			AudioStream audio = new AudioStream(som);
			
			AudioPlayer.player.start(audio);
			
			Thread.sleep(3000);
			
			AudioPlayer.player.stop(audio);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		 File errou = new File("errou.wav");
		 tocarSom(errou);
		  

	}

}
