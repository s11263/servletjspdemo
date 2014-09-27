package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Demo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public int ile = 0;
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		   									throws ServletException, IOException {
		
	   String param = request.getParameter("name");
	   
	   PrintWriter out = response.getWriter();
	   
	   HttpSession session = request.getSession();
	   
	   ServletContext ctx = request.getServletContext();
	   ile++;
	   if (param != null && param != "") {
		   
		  
		   session.setAttribute("name", param);
		   
	   } // else out.println("<h1>Hello from servlet</h1>");
	   ctx.setAttribute("name", ile);
	   out.println("<h1>Wejsc na strone bylo: " +ctx.getAttribute("name")+"</h1>"); //zapamiętuje parametr nawet po wyłączeniu przeglądarki
	   out.println("<h1>Hello from session " +session.getAttribute("name")+"</h1>"); //sesja zapamiętuje parametr przy braku parametru w URL
	   out.println("<h1>Hello from request " +param +"</h1>"); //request nie zapamiętuje
   
   }

}
