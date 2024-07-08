package colisiones2;
import java.applet.Applet;

import java.applet.AudioClip;
import java.io.File;
import java.net.URL;

public class SoundTest {
	public static void main(String[] args) throws Exception {

		
		
		
		System.out.println("1");
		
		URL url = SoundTest.class.getResource("back.wav");
		
		System.out.println("2");
		AudioClip clip = Applet.newAudioClip(url);
		System.out.println("3");
		clip.loop();
		System.out.println("4");
		Thread.sleep(22000);
		clip.stop();
/*
		URL url2 = new URL(
			"file:/C:/eclipseClasic/workspace/minitennis/src/com/edu4java/minitennis7/back.wav");

		URL url2 = SoundTest.class.getResource("back.wav");
		AudioClip clip = Applet.newAudioClip(url);
		AudioClip clip2 = Applet.newAudioClip(url);
		clip.play();
		Thread.sleep(1000);
		clip2.loop();
		Thread.sleep(20000);
		clip2.stop();
		*/
		System.out.println("end");
	}
}
