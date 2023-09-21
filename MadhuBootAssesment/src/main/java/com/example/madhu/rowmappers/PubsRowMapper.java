package com.example.madhu.rowmappers;

import java.sql.ResultSet;

import com.example.madhu.models.Books;
import com.example.madhu.models.Publisher;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PubsRowMapper implements RowMapper<Publisher>  {


	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publisher dd = new  Publisher();
		dd.setId(rs.getInt(1));
		dd.setName(rs.getString(2));
		return dd;
		
	}
	
	

}