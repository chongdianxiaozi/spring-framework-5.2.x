package com.cdxz.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.jupiter.api.Test
	public void test() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-book.xml");
		Book book = (Book) ac.getBean("book");
		People people = (People) ac.getBean("people");
		book.setId(1);
		book.setName("中国上下五千年");
		people.setId(2);
		people.setName("炎黄子孙");
		people.setBook(book);
		System.out.println(people);
	}

}
