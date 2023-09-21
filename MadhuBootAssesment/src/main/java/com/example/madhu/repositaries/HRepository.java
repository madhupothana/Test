package com.example.madhu.repositaries;
import com.example.madhu.contracts.HimsDao;
import com.example.madhu.contracts.IRepository;
import com.example.madhu.models.Books;
import com.example.madhu.models.Publisher;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HRepository implements IRepository {
	@Autowired
	HimsDao hdao;
	
	//to return all books to client side in arraylist
	@Override
	public ArrayList<Books> getBooks() {
		List<Books> lis = hdao.getBooks();
		return (ArrayList<Books>)lis;
	}
	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return hdao.deleteBook(id);	
	}
	@Override
	public boolean updateBook(Books book) {
		// TODO Auto-generated method stub
		return hdao.updateBook(book);
	}
	@Override
	public boolean addBook(Books book) {
		// TODO Auto-generated method stub
		return hdao.addBook(book);
	}
	@Override
	public List<Publisher> getPublishers() {
		// TODO Auto-generated method stub
		return hdao.getPubs();
	}

	


}
