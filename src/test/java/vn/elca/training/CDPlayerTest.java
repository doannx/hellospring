package vn.elca.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import soundsystem.CDPlayer;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;
import soundsystem.TestByMyself;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	@Qualifier("compactDisc_From_CdConfig_JavaConfig")
	private SgtPeppers doanPeppers;

	@Autowired(required = false)
	private TestByMyself test;

	@Autowired
	private CDPlayer player;

	@Autowired
	@Qualifier("doanPeppers")
	private CompactDisc blank;

	@Test
	public void cdShouldNotBeNull() {
		doanPeppers.play();
		player.play();
		test.sgtPeppers().play();
		blank.play();
	}
}
