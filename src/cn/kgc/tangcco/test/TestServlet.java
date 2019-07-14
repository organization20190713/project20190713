package cn.kgc.tangcco.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test.action")
public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestClass tc = new TestClass();
		String retString = tc.testMethod();
		request.setAttribute("retString", retString);
		request.getRequestDispatcher("WEB-INF/jsp/test.jsp").forward(request, response);
	}
}
