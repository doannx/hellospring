package lifecycletest;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private Long id;

	private String position;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		System.out.println("setId...");
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		System.out.println("setPosition...");
		this.position = position;
	}

	@Override
	public String toString() {
		return "id " + id + " and position " + position;
	}

	public void destroy() throws Exception {
		System.out.println("I am in destroy... ");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("I am in afterPropertiesSet... ");

	}

	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + id + " "
				+ position);
	}

	public void cleanUp() throws Exception {
		System.out.println("Spring Clean Up! Employee is cleaned up now.");
	}
}
