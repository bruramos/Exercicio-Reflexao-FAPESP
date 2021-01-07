package br.inatel.cdg.annotation.reading;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//Nessa classe você deverá implementar a sua solução
//Adicionalmente você também deverá criar
//a anotação NumberToSum como parte da solução

public class AnnotationReader<T> {

	private final Class<?> clazz;
	private final List<Integer> numbers;

	int sum = 0;

	public AnnotationReader(Class<?> clazz) {
		this.clazz = clazz;
		numbers = new ArrayList<>();
	}

	public void readAnnotations(){
		Field[] fields = clazz.getDeclaredFields(); //recebe os atributos dentro da classe
		for(Field f : fields) {
			if(f.isAnnotationPresent(NumberToSum.class)) {
				numbers.add(f.getAnnotation(NumberToSum.class).value());
			}
		}
		Method[] methods = clazz.getDeclaredMethods(); //recebe os metodos dentro da classe
		for(Method m : methods){
			if (m.isAnnotationPresent(NumberToSum.class)) {
				numbers.add(m.getAnnotation(NumberToSum.class).value());
			}
		}
		//System.out.println(numbers);
	}

	public int getTotalSum() {

		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
	}

}