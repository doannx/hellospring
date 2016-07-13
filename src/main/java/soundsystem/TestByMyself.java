package soundsystem;

import org.springframework.context.annotation.Bean;

public class TestByMyself {
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
}
