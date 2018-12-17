package org.rajavardhan.spring.tutorial.springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ApplicationContext contextt = new
		// FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beansfile.xml");

		// BeanFactory beanFactory = new XmlBeanFactory(new
		// FileSystemResource("beans.xml"));
		// Person person = (Person) beanFactory.getBean("person");

		Person person = (Person) context.getBean("person");
		Person person1 = (Person) context.getBean("person1");

		// Address address1 = (Address) context.getBean("address1");

		System.out.println(person);

		System.out.println(person1);
		person.speak();

		((ClassPathXmlApplicationContext) context).close();
	}
}
