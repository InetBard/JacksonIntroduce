package telran.reader.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.reader.object.Reader;

public class ReaderRestoreAppl {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
//		Reader[] readers = mapper.readValue(new File("readers.json"), Reader[].class);
//		Arrays.stream(readers).forEach(System.out::println);
//		String json = ""
		
		List<Reader> readers = mapper.readValue(new File("readers.json"), 
				new TypeReference<List<Reader>>() {
				});
		readers.stream().forEach(System.out::println);
	}

}
