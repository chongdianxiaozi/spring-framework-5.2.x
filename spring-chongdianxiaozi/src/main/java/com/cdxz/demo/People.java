package com.cdxz.demo;

public class People {

	private Integer id;
	private String name;
	private Book book;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "People{" +
				"id=" + id +
				", name='" + name + '\'' +
				", book=" + book +
				'}';
	}
}
