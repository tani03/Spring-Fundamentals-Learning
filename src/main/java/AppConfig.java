import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import conferenceJava.com.learn.repository.HibernateSpeakerRepositoryImpl;
import conferenceJava.com.learn.repository.SpeakerRepository;
import conferenceJava.com.learn.service.SpeakerService;
import conferenceJava.com.learn.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

		@Bean(name="speakerService")
		@Scope(value=BeanDefinition.SCOPE_SINGLETON)
		public SpeakerService getSpeakerServiceNoArgConstructor() {
			
			SpeakerServiceImpl service=new SpeakerServiceImpl();
			
			return service;
		}
		
		@Bean(name="speakerServiceArg")
		@Scope(value=BeanDefinition.SCOPE_SINGLETON)
		public SpeakerService getSpeakerServiceArgConstructor() {
			SpeakerServiceImpl service=new SpeakerServiceImpl(getSpeakerRepository());
			
			
			return service;
		}
		
	
		@Bean(name="speakerRepository")
		public SpeakerRepository getSpeakerRepository() {
			return new HibernateSpeakerRepositoryImpl();
		}
}
 