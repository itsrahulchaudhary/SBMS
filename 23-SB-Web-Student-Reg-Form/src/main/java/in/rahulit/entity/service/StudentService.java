package in.rahulit.entity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rahulit.binding.Student;
import in.rahulit.entity.Gender;
import in.rahulit.entity.StudentEntity;
import in.rahulit.entity.repository.CoursesRepository;
import in.rahulit.entity.repository.GendersRepository;
import in.rahulit.entity.repository.StudentRepository;
import in.rahulit.entity.repository.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private GendersRepository gendersRepo;

	@Autowired
	private CoursesRepository coursesRepo;

	@Autowired
	private TimingsRepository timingsRepo;
	
	@Autowired
	private StudentRepository studentRepo;

	public List<String> getGenders() {
		/*
		 * List<Gender> findAll = gendersRepo.findAll();
		 * List<String> genders = new ArrayList<String>(); 
		 * for(Gender gender : findAll)
		 * { 
		 *    genders.add(gender.getGenderName()); 
		 * }
		 */
		
		/*List<String> genders = findAll.stream()
				                   .map(gender -> gender.getGenderName())
		                           .collect(Collectors.toList());*/
		List<String> genderNames = gendersRepo.getGenderNames();
		return genderNames;
	}
	
	public List<String> getCourses() {
		List<String> courseNames = coursesRepo.getCourseNames();
		return courseNames;	
	}
	
	public List<String> getTimings() {
		List<String> timingNames = timingsRepo.getTimingNames();
		return timingNames;
	}
	
	public boolean saveStudent(Student student) {
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		StudentEntity save = studentRepo.save(entity);
		
		return save !=null && save.getStudentId() !=null;
	}

}
