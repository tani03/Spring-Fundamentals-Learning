import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import conferenceJava.com.learn.repository.HibernateSpeakerRepositoryImpl;
import conferenceJava.com.learn.repository.SpeakerRepository;
import conferenceJava.com.learn.service.SpeakerService;
import conferenceJava.com.learn.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

		@Bean(name="speakerService")
		public SpeakerService getSpeakerService() {
			SpeakerServiceImpl service=new SpeakerServiceImpl(getSpeakerRepository());
			
			
			return service;
		}
		
		@Bean(name="speakerRepository")
		public SpeakerRepository getSpeakerRepository() {
			return new HibernateSpeakerRepositoryImpl();
		}
}
 