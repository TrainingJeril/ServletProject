package com.training.jeril;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Subraction extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
	    if(request.getParameter("number1")!= null && request.getParameter("number2")!= null && request.getParameter("number3")!= null) {
		Long numb1 = Long.parseLong(request.getParameter("number1"));
		Long numb2 = Long.parseLong(request.getParameter("number2"));
		Long numb3 = Long.parseLong(request.getParameter("number3"));

		
		out.println("The result of multiplication is" + (numb1 - numb2 - numb3));
		
	    } else {
	    	out.println("Enter the valid input");

	    }
		
		}
	}


