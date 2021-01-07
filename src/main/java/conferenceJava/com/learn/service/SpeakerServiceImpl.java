package conferenceJava.com.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import conferenceJava.com.learn.model.Speaker;
import conferenceJava.com.learn.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;//=new HibernateSpeakerRepositoryImpl();
	
	public SpeakerServiceImpl(SpeakerRepository repository) {
		this.repository = repository;
	}
	
	public SpeakerServiceImpl() {
		System.out.println("In no arg speakerService impl");
	}

	public List<Speaker> findAll(){
		return repository.findAll();		
	}

	@Autowired
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

	
}
