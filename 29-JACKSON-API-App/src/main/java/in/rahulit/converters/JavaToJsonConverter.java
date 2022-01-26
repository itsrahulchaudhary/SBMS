package in.rahulit.converters;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.rahulit.binding.Person;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person(101, "Raju", 34);

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(p);
		System.out.println(json);

	}

}
