package telran.car.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.car.model.Car;

public class CarAppl {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		long t1 = System.currentTimeMillis();
		Car car = mapper.readValue(new File("car.json"), Car.class);
		System.out.println(car);
		long t2 = System.currentTimeMillis();
		System.out.println("mills" + (t2-t1));
		Car car2 = Car.builder()
				.manufacturer("Renault")
				.year(2015)
				.models(Arrays.asList("Megane","Clio"))
				.build();
		Car car3 = Car.builder()
				.manufacturer("VW")
				.year(2017)
				.model("Polo")
				.model("Jetta")
				.model("Passat")
				.build();
		System.out.println("car2 " +car2);
		System.out.println("car3 " + car3);
	}

}
