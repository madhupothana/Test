package com.example.madhu.contracts;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.example.madhu.models.Books;
import com.example.madhu.models.Publisher;

public interface HimsDao {

	List<Books> getBooks();

	boolean deleteBook(int id);

	boolean updateBook(Books book);

	boolean addBook(Books book);


	List<Publisher> getPubs();

//	List<NetworkHospitals> getHospitals();
//
//	void createUser(User user);
//
//	List<Insurance> getInsurances();
//
//	void updateInsurance(Insurance ins);

}
