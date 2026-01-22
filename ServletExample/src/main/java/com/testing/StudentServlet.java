package com.testing;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static ArrayList<Student> slist = new ArrayList<>();
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id1 = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		
		Student st = new Student(id1, name, dept);
		slist.add(st);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("details are added successfully");
	}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("Student Details");
	for(Student st:slist)
	{
		out.println("id="+st.getId());
		out.println("name="+st.getName());
		out.println("department="+st.getDept());
	}
}
protected void doPut(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String dept = request.getParameter("dept");

    boolean found = false;

    for (Student st : slist) {
        if (id == st.getId()) {
            st.setName(name);
            st.setDept(dept);
            found = true;
            break;
        }
    }

    if (found) {
        out.println("details updated successfully");
    } else {
        out.println("details not updated");
    }
}
}

