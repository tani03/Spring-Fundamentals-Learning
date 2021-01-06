import conference.com.learn.service.SpeakerService;
import conference.com.learn.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		SpeakerService service=new SpeakerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
