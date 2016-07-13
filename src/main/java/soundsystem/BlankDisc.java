package soundsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "doanPeppers")
public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> list;

	public BlankDisc(@Value("doannxTitle") String title,
			@Value("doannx_artist") String artist,
			@Value("null") List<String> list) {
		this.title = title;
		this.artist = artist;
		this.list = list;
	}

	public void play() {
		System.out.println("Playing " + title + "by" + artist + "size: "
				+ list.size());
	}
}
