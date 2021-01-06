package conferenceJava.com.learn.service;

import java.util.List;

import conferenceJava.com.learn.model.Speaker;
import conferenceJava.com.learn.repository.HibernateSpeakerRepositoryImpl;
import conferenceJava.com.learn.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;//=new HibernateSpeakerRepositoryImpl();
	
	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}
	
	public List<Speaker> findAll(){
		return repository.findAll();		
	}

	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

	
}
