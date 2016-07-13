package soundsystem;

import org.springframework.context.annotation.Import;

@Import({ CDPlayerConfig.class, CDConfig.class })
public class SoundSystemConfig {

}
