package conference.com.learn.repository;

import java.util.ArrayList;
import java.util.List;

import conference.com.learn.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	public List<Speaker> findAll(){
		List<Speaker> speakers=new ArrayList<Speaker>();
		Speaker speaker=new Speaker();
		speaker.setFirstName("Bryan");
		speaker.setLastName("Hansen");
		speakers.add(speaker);
		return speakers;
	
	}

}
