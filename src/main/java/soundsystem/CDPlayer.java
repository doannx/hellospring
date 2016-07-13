package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	private CompactDisc cd;

	@Autowired
	public CDPlayer(
			@Qualifier("compactDisc_From_CdConfig_JavaConfig") CompactDisc cd) {
		this.cd = cd;
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
}
