package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
	@Bean(name="compactDisc_From_CdConfig_JavaConfig")
	public CompactDisc compactDisc(){
		return new SgtPeppers();
	}
}
