package com.LibraryBookLogic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.LibraryBookDao.LibraryBookDao;
import com.LibraryBookDto.LibraryBookDto;

public class LibraryBookLogic {

	
	public LibraryBookDao insertData(LibraryBookDto dto) {
LibraryBookDao dao=new LibraryBookDao();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Calendar cl=Calendar.getInstance();
		cl.setTime(new Date());
		cl.add(Calendar.DATE, 5);
		String currentdate=sdf.format(dto.getIssue_date());
		
		String output =sdf.format(cl.getTime());
		//Random randNum=new Random();
		
		dao.setName(dto.getName());
		dao.setAuthor(dto.getAuthor());
		dao.setCategory(dto.getCategory());
		dao.setIssue_date(currentdate);
		dao.setReturn_date(output);
		dao.setBorrow_no(dto.getBorrow_no());
		
		
		return dao;
		
	}
}
