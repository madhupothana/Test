package com.example.madhu.daos;

import java.awt.print.Book;
import java.sql.Date;

import com.example.madhu.contracts.HimsDao;
import com.example.madhu.models.Books;
import com.example.madhu.models.Publisher;
import com.example.madhu.rowmappers.BooksRowMapper;
import com.example.madhu.rowmappers.PubsRowMapper;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class HimsDaoImpl implements HimsDao {

	
	JdbcTemplate jdbcTemplate;
	
	
	private String SQL_GET_PUBS = "select * from  madhu_publishers";
	private String SQL_GET_BOOKS = "select * from  madhu_books";
	private String SQL_DELETE_BOOK = "delete from madhu_books where id=?";
	private String SQL_UPDATE_BOOK = "update madhu_books set name=?,author=?,price=? where id=?";
	private String SQL_ADD_BOOK = "insert into madhu_books(p_id,name,author,price) values(?,?,?,?)";
	
	@Autowired
	public HimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Books> getBooks() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_BOOKS, new BooksRowMapper());
	}


	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_BOOK,id)>0;

	}


	@Override
	public boolean updateBook(Books book) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_UPDATE_BOOK,book.getName(),book.getAuthor(),book.getPrice(),book.getId())>0;
	}


	@Override
	public boolean addBook(Books book) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_ADD_BOOK,book.getP_id(),book.getName(),book.getAuthor(),book.getPrice())>0;
	}


	@Override
	public List<Publisher> getPubs() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_PUBS, new PubsRowMapper());
	}

//	@Override
//	public List<NetworkHospitals> getHospitals() {
//
//		return jdbcTemplate.query(SQL_GET_HOSPITALS, new NetworkHospitalsMapper());
//	}
//
//	@Override
//	public void createUser(User user) {
//		jdbcTemplate.update(SQL_CREATE_USER, user.getUser_name(),Date.valueOf(currentDate), user.getUser_pwd(),user.getUser_type());
//
//	}
//
//	@Override
//	public List<Insurance> getInsurances() {
//		return jdbcTemplate.query(SQL_GET_INSURANCES, new InsuranceMapper());
//	}
//
//	@Override
//	public void updateInsurance(Insurance ins) {
//		jdbcTemplate.update(SQL_UPDATE_INSURANCES,ins.getInsr_sum_assured(),ins.getInsr_yrly_prem_amount(),ins.getInsr_id());
//		
//	}
	

}
