package com.bookstore.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

	public static void out(final String ClassName, final Object...params){
		String datetime =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String message = "";
		if(params != null){
			for(int i = 0;i<params.length;i++){
				message = message + "["+params[i]+"]";
			}
		}
		System.out.println(datetime+"["+ClassName+"]" + message); 
	}
	
}
