import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import conferenceJava.com.learn.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//SpeakerService service=new SpeakerServiceImpl();
		
		SpeakerService service1=appContext.getBean("speakerService",SpeakerService.class);
		System.out.println(service1.findAll().get(0).getFirstName());
		
		SpeakerService service2=appContext.getBean("speakerServiceArg",SpeakerService.class);
	//	System.out.println(service);
		
		System.out.println(service2.findAll().get(0).getFirstName());
		
		

	}

}
