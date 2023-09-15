package com.example.madhu.controllers;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.madhu.contracts.IRepository;
import com.example.madhu.models.Books;
import com.example.madhu.models.Publisher;

@RestController
public class HimsController {

	@Autowired
	IRepository irip; 
	@GetMapping(value = "/getpublishers")
	public List<Publisher> getPublishers() {
		System.out.println("madh");
		List<Publisher> li =irip.getPublishers();
		return li;
	}


	@GetMapping(value = "/getbooks")
	public ArrayList<Books> getBooks() {
		System.out.println("madh");
		ArrayList<Books> li = (ArrayList<Books>) irip.getBooks();
		return li;
	}

	@RequestMapping(value = "/deletebook/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") int id) {
		if (irip.deleteBook(id))
			return new ResponseEntity<>("Book is deleted successsfully", HttpStatus.OK);
		return new ResponseEntity<>("Book is Not deleted", HttpStatus.OK);

	}

	@RequestMapping(value = "/updatebook/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateBook(@PathVariable("id") int id, @RequestBody Books book) {
		System.out.println(book.toString());
		irip.updateBook(book);
		return new ResponseEntity<>("Employee is updated successsfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
	public ResponseEntity<Object> createBook(@RequestBody Books book) {
		irip.addBook(book);
		return new ResponseEntity<>("Book is created successfully", HttpStatus.CREATED);
	}
}
