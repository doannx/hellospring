package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> list;

	public BlankDisc(String title, String artist, List<String> list) {
		this.title = title;
		this.artist = artist;
		this.list = list;
	}

	public void play() {
		System.out.println("Playing " + title + "by" + artist + "size: "
				+ list.size());
	}
}
