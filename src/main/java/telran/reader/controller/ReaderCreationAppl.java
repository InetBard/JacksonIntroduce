package telran.reader.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.reader.object.Reader;

public class ReaderCreationAppl {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		String[] lib1 = { "Book1", "Book2" };
		String[] lib2 = { "Book3", "Book4" };
		Reader[] readers = { 
				new Reader(100, "Peter", 1988, Arrays.asList(lib1)), 
				new Reader(100, "Tigran", 1986, Arrays.asList(lib2))};
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("readers.json"), readers);
	}
}
