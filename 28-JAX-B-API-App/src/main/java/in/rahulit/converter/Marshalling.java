package in.rahulit.converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.rahulit.binding.Address;
import in.rahulit.binding.Student;

public class Marshalling {

	public static void main(String[] args) throws Exception {
		
		Address address = new Address("Noida", "UP", "India");
		
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Rahul");
		student.setStudentAge(20);
		student.setStudentRank(5);
		student.setAddress(address);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(student, System.out);
	}

}
