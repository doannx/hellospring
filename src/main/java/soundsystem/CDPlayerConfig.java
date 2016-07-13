package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ImportResource("bean-config.xml")
public class CDPlayerConfig {

	@Bean
	public TestByMyself getTestByMyself() {
		return new TestByMyself();
	}
}
