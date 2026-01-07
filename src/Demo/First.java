package Demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class First 
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Student st=new Student();
		
	      Class<?> cl=st.getClass();
	      Class<?>cl2=Class.forName("Demo.Student");
//	      Class<?> cl3=Student.class;
	      
	      
	      Constructor<?>[] cons=cl2.getDeclaredConstructors();
	  
	      for(Constructor c:cons)
	      {
	    	  System.out.println(c);
		  
	    	  System.out.println(c.getModifiers());
	    	  System.out.println(c.getParameterCount());
	    	  Class<?>[] cl4= c.getParameterTypes();
		 
	    	  for(Class<?> p:cl4)
	    	  {
	    		  System.out.println(p.getName());
	    		  //System.out.println(p);
	    	  }
		 
	    	  System.out.println("**********");
		  
		  
	      }
	  
	      System.out.println(cons.length);

	}

}

class Student
{
	
	int id;
	String name;
	double marks;
	
	public Student()
	{
		
	}
	
	private Student(int i)
	{
		
	}
	
	public Student(int i,int j)
	{
		
	}
}