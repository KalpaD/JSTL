package kds.web.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kds.web.modle.Customer;

public class CustomerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setfName("Jhon");
		customer.setlName("Doe");
		List<Customer> customers = Arrays.asList(customer);
	
		request.setAttribute("customers", customers);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");
		requestDispatcher.forward(request, response);
	}

}
