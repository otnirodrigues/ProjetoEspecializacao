package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.*;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {"/Controller", "/main", "/main0" , "/main1" , "/main2"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    DAO dao = new DAO();
    Complaint queixa = new Complaint();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			fazerReclamacao(request, response);
			response.sendRedirect("novaReclacao.jsp");
		} else if (action.equals("/main0")) {
			inserirReclamacaoAnimal(request, response);
		} else if (action.equals("/main1")) {
			inserirReclamacaoFood(request, response);
		} else if (action.equals("/main2")) {
			inserirReclamacaoDiversas(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	
	protected void queixas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Complaint> lista = DAO.listarQueixas();
		request.setAttribute("Queixas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("Queixas.jsp");
		rd.forward(request, response);
	}
	
	protected void fazerReclamacao(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		queixa.setDia(request.getParameter("Dia"));
		queixa.setMes(request.getParameter("Mes"));
		queixa.setAno(request.getParameter("Ano"));
		queixa.setDescricaoQueixa(request.getParameter("Descrição"));
		response.sendRedirect("main");
	}
	
	protected void inserirReclamacaoAnimal(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		queixa.setDia(request.getParameter("Dia"));
		queixa.setMes(request.getParameter("Mes"));
		queixa.setAno(request.getParameter("Ano"));
		queixa.setDescricaoQueixa(request.getParameter("Descrição"));
		dao.inserirReclamacaoAnimal(queixa);
		response.sendRedirect("main0");
	}
	protected void inserirReclamacaoFood(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		queixa.setDia(request.getParameter("Dia"));
		queixa.setMes(request.getParameter("Mes"));
		queixa.setAno(request.getParameter("Ano"));
		queixa.setDescricaoQueixa(request.getParameter("Descrição"));
		dao.inserirReclamacaoFood(queixa);
		response.sendRedirect("main1");
	}
	
	protected void inserirReclamacaoDiversas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		queixa.setDia(request.getParameter("Dia"));
		queixa.setMes(request.getParameter("Mes"));
		queixa.setAno(request.getParameter("Ano"));
		queixa.setDescricaoQueixa(request.getParameter("Descrição"));
		dao.inserirReclamacaoDiversas(queixa);
		response.sendRedirect("main2");
	}
	
}
