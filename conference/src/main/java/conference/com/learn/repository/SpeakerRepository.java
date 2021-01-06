package conference.com.learn.repository;

import java.util.List;

import conference.com.learn.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}