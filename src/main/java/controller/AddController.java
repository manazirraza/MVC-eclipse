package controller;
import jakarta.servlet.RequestDispatcher;
//Controller in MVC
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Add;

import java.io.IOException;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Add a=new Add();
		int result = a.add(num1, num2);
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
		rd.forward(request, response);
		
	}

}
