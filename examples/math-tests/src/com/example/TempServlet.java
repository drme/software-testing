package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TempServlet extends HttpServlet
{
	/**
	 * 
	 */
    private static final long serialVersionUID = 1672445211478539394L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String str_f = req.getParameter("Fahrenheit");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		try
		{
			ffdsfgasdgasdg
	
			out.println("Fahrenheit: " + temp_f + " Celsius: " + temp_c);
		}
		catch (NumberFormatException e)
		{
			out.println("Invalid temperature: " + str_f);
		}
	}
}
