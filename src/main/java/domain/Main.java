package domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
		Robot robot = (Robot) factory.getBean("robot");
		robot.move();

	}

}
