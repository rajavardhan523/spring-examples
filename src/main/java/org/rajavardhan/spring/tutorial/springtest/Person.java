package org.rajavardhan.spring.tutorial.springtest;

import java.util.List;
import java.util.Properties;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	@Inject
	private List<Address> addresses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	// @PostConstruct
	public void init() {
		System.out.println("Bean created" + this);
	}
	//@PreDestroy
	public void destroy() {
		System.out.println("Bean destroyed");
	}

	public void speak() {
		System.out.println("Person Speaking-Hello World!");
	}
}
