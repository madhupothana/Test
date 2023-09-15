package com.example.madhu.rowmappers;

import java.sql.ResultSet;

import com.example.madhu.models.Books;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksRowMapper implements RowMapper<Books>  {


	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		Books dd = new  Books();
		dd.setId(rs.getInt(1));
		dd.setP_id(rs.getInt(2));
		dd.setName(rs.getString(3));
		dd.setAuthor(rs.getString(4));
		dd.setPrice(rs.getDouble(5));
		
		return dd;
		
	}
	
	

}