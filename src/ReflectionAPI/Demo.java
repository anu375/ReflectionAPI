package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo 
{	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 

	{
		
		Class<?> c = Test.class;
		
		Object obj = c.getDeclaredConstructor().newInstance();
		
		Method m = c.getMethod("show");
		m.invoke(obj);

	}

}

class Test
{
	public void show()
	{
		System.out.println("Hello Reflection");
	}
}