package telran.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = { "manufacturer", "year" })
@ToString
@Builder //паттерн билдер сущ для создания инстансов
public class Car {
	String manufacturer;
	int year;
	@Setter
	@Singular
	Iterable<String> models;

}
