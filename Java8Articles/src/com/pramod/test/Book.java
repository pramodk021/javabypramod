package com.pramod.test;

import java.util.Objects;

public final class Book {
	private final String title;
	private final String author;
	private final String isbn;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title);
	}

	
}