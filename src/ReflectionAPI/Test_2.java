package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test_2 
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		
		Class<?> c = Person.class;
		Constructor<?> cons = c.getDeclaredConstructor();
		
		cons.setAccessible(true);
		
		cons.newInstance();

	}

}

class Person
{
	private Person()
	{
		System.out.println("Person object created");
	}
}