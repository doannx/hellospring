package soundsystem;

import org.springframework.stereotype.Component;

@Component(value = "doanPeppers")
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + "by" + artist);
	}
}
