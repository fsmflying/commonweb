package test;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTests {
	
	ApplicationContext ctx = null; 
	
	@Before
	public void before()
	{
		ctx = new ClassPathXmlApplicationContext(new String[]{});
	}
}
