package soundsystem;


public class CDPlayer {
	
	private CompactDisc cd;

//	@Autowired(required=false)
//	public CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
}
