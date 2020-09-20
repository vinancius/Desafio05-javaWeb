package br.com.bo;

import java.util.ArrayList;

import br.com.bean.PessoaBean;
import br.com.dao.PessoaDAO;

public class PessoaBO {
	
	public ArrayList<PessoaBean> listarPessoa() {
		PessoaDAO pessoa = new PessoaDAO();
		return pessoa.listarPessoa();
		
	}
	
	public void adicionarPessoa(String nome, String email) {
		PessoaDAO pessoa = new PessoaDAO();
		pessoa.adicionarPessoa(nome, email);
	}
}
