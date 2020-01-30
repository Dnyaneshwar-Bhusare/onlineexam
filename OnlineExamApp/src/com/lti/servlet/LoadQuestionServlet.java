package com.lti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.online.exam.Question;
import com.lti.online.exam.QuestionBankLoader;

@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		QuestionBankLoader dqLoader=new QuestionBankLoader();
		List<Question> questions= dqLoader.loadQuestionOnJava();
		
		Integer qNo = (Integer) session.getAttribute("currentQno");
		System.out.println(qNo);
		if(qNo==null) {
			qNo=0;
		}
		if(qNo < questions.size())
		{
			Question q = questions.get(qNo++);
			session.setAttribute("currentQs",q);
			session.setAttribute("currentQno", qNo);
			session.setAttribute("PreviousQno", qNo--);
			response.sendRedirect("showQuestion.jsp");
		}
//		else if() {
//			session.getAttribute("PreviousQno");
//		}
		else {
			response.sendRedirect("Result.jsp");
		}
	}
	public void previousAction() {
		
	}
}