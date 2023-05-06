package controller;

import java.io.IOException;
import java.util.List;

import dao.Traindao;
import dto.Train;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletetrain")
public class DeleteTrain extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int number=Integer.parseInt(req.getParameter("number"));
		
		Traindao dao=new Traindao();
		dao.delete(number);  
		
		List<Train> list=dao.fetchAll();
		
		if(list.isEmpty()) {
			resp.getWriter().print("<h1 style='color:red'>No Railway Info Exists </h1> ");
			req.getRequestDispatcher("ManagementHome.html").include(req, resp);
		}
		else {
		resp.getWriter().print("<h1 style='color:blue' >Railway Info Deleted Successfully</h1>");
		
		req.setAttribute("list", dao.fetchAll());
		req.getRequestDispatcher("FetchRailwayInfo.jsp").include(req, resp);
		}
		
	
	}
}
