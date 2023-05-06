package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Traindao;
import dto.Train;

@WebServlet("/fetchalltrain")
public class FetchAllTrain  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Traindao dao=new Traindao();
		List<Train> list=dao.fetchAll();
		
		if(list.isEmpty()) {
			resp.getWriter().print("<h1>No Railway Information is Available</h1>");
			req.getRequestDispatcher("ManagementHome.html").include(req, resp);
		}
		else {
			req.setAttribute("list", list);
			req.getRequestDispatcher("FetchRailwayInfo.jsp").include(req, resp);
		}
	}
}
