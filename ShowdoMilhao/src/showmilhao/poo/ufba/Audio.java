package showmilhao.poo.ufba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Audio implements Runnable {

	public static void tocarSom(File nomeDoSom) throws IOException, InterruptedException {
		InputStream som;
		
		try {
			
			som = new FileInputStream(nomeDoSom);
			AudioStream audio = new AudioStream(som);
			
			AudioPlayer.player.start(audio);
			
			Thread.sleep(1800);
			
			AudioPlayer.player.stop(audio);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void tocarSom2(File nomeDoSom) throws IOException, InterruptedException {
		InputStream som;
		
		try {
			
			som = new FileInputStream(nomeDoSom);
			AudioStream audio = new AudioStream(som);
			
			AudioPlayer.player.start(audio);
			
			Thread.sleep(21000);
			
			AudioPlayer.player.stop(audio);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		 /*File errou = new File("errou.wav");
		 File perdeu = new File("SoundofSilence.wav");
		 File acertou = new File ("acertou.wav");
		 tocarSom2(perdeu);
		 //tocarSom(acertou);
		 tocarSom(errou);
		 */ 

	}

	@Override
	public void run() {
		File perdeu = new File("SoundofSilence.wav");
		try {
			tocarSom2(perdeu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
