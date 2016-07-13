package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CDConfig {
	@Primary
	@Bean(name = "compactDisc_From_CdConfig_JavaConfig")
	public CompactDisc compactDisc() {
		System.out.println("compactDisc_From_CdConfig_JavaConfig");
		return new SgtPeppers();
	}
}
