import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;

public class LocalTests {
	public void test01()
	{
		AbstractEntityManagerFactoryBean f = null;
		org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean f2 = null;
		f2.getObject();
		FactoryBean<EntityManagerFactory> emf = null;
	
	}
}
