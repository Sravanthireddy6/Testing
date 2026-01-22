package com.testing;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HobbyServlet
 */
@WebServlet("/HobbyServlet")
public class HobbyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 String[] hobbies=request.getParameterValues("hobby");
		 
		 for(String st:hobbies) {
			 out.println(st+" :hobby");
			 
		 }
	}

}