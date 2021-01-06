import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import conferenceJava.com.learn.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext appContext1=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//SpeakerService service=new SpeakerServiceImpl();
		
		SpeakerService service=appContext.getBean("speakerService",SpeakerService.class);
		
		//SpeakerService service1=appContext.getBean("speakerService",SpeakerService.class);
		
		//SpeakerService service2=appContext1.getBean("speakerService",SpeakerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	//	System.out.println(service1);
	//	System.out.println(service2);
		

	}

}
