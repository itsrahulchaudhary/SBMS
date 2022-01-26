package in.rahulit.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
 
import javax.xml.bind.Unmarshaller;

import in.rahulit.binding.Student;

public class UnMarshalling {
	
	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Student unmarshal = (Student)unmarshaller.unmarshal(new File("student.xml"));
		
		System.out.println(unmarshal);
		
	}

}
