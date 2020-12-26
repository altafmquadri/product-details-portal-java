package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addproduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		double price = Double.valueOf(request.getParameter("price"));
		PrintWriter out = response.getWriter();

		out.println("<html><head>");
		out.println("<title>Product Detail</title>");
		out.println("<table border='1' width='60%'>");
		out.println("<tr>");
		out.println("<th>Model Id</th> <th>Product Name</th> <th>Category</th> <th>Price</th> </tr>");
		out.println("<tr style='text-align:center'>");
		out.println("<td>1</td> <td>" + name + "</td> <td>" + category + "</td> <td>" + price + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<a href='add_product.jsp'>Go Back to Add product Page</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
