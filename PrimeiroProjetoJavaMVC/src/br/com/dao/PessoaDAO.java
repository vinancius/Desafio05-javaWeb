package br.com.dao;
import java.util.ArrayList;

import br.com.bean.PessoaBean;
public class PessoaDAO {

	private static ArrayList<PessoaBean> listaPessoa = new ArrayList<PessoaBean>();
	
	public ArrayList<PessoaBean> getListaPessoa() {
		return listaPessoa;
	}

	public PessoaDAO() {
		super();
	}
	
	public ArrayList<PessoaBean> listarPessoa() {
		
		return  getListaPessoa();
	}
	
	public void adicionarPessoa(String nome,String email) {
	
		listaPessoa.add(new PessoaBean(nome,email));
		
	}
}
