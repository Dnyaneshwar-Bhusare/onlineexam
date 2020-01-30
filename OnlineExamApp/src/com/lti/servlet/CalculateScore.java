package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.online.exam.Option;
import com.lti.online.exam.Question;

@WebServlet("/calculateScoreServlet")
public class CalculateScore extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		Question q = (Question) session.getAttribute("currentQs");
		int opNo = Integer.parseInt(request.getParameter("option"));
		Option selectedOption = q.getOption().get(opNo);
		Integer score = (Integer) session.getAttribute("score");
		if(score==null)
			score=0;
		if(selectedOption.isRightAnswer())
			score++;
		session.setAttribute("score", score);
//		int qNo = (int) session.getAttribute("currentQno");
		response.sendRedirect("LoadQuestionServlet");
		
		
	}

}
