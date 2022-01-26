package in.rahulit.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.rahulit.binding.Person;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {

		File file = new File("person.json");

		ObjectMapper mapper = new ObjectMapper();

		Person person = mapper.readValue(file, Person.class);

		System.out.println(person);

	}

}
