package ReflectionAPI;

import java.lang.reflect.Field;
public class Test_1 
{

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		
		Student s = new Student();
		Class<?> c = s.getClass();
		
		Field f = c.getDeclaredField("name");
		
		f.setAccessible(true);
		
		System.out.println(f.get(s));
		

	}

}

class Student
{
	private String name = "Anushka";
}