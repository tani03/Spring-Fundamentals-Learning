package conferenceJava.com.learn.repository;

import java.util.List;

import conferenceJava.com.learn.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}