package com.william.study01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		 SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date d=new Date(1474298000000L);
		System.out.println(myFmt2.format(d));
	}

}
