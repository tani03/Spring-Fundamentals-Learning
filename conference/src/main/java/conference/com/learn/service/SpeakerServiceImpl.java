package conference.com.learn.service;

import java.util.List;

import conference.com.learn.model.Speaker;
import conference.com.learn.repository.HibernateSpeakerRepositoryImpl;
import conference.com.learn.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository=new HibernateSpeakerRepositoryImpl();
	
	public List<Speaker> findAll(){
		return repository.findAll();		
	}

}
