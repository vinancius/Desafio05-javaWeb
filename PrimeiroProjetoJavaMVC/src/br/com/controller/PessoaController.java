package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.PessoaBean;
import br.com.bo.PessoaBO;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/PessoaController")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<PessoaBean> lista = new ArrayList<PessoaBean>();
		PessoaBO pessoa = new PessoaBO();
		lista = pessoa.listarPessoa();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("listarPessoas.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		System.out.println(nome);
		PessoaBO pessoa = new PessoaBO();
		pessoa.adicionarPessoa(nome, email);
		response.sendRedirect("index.jsp");
	}

}
