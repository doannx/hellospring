package lifecycletest;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Main");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Employee em = (Employee) context.getBean("employeeBean");

		System.out.println(em.toString());

		context.close();
	}
}
