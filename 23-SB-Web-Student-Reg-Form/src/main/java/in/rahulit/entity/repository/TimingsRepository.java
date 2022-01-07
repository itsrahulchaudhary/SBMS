package in.rahulit.entity.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.rahulit.entity.Time;

public interface TimingsRepository extends JpaRepository<Time, Serializable> {
	
	@Query("select timingName from Time")
	public List<String> getTimingNames();

}
