package br.com.JavaWeb.estudo;

import br.com.JavaWeb.estudo.entidade.Usuario;
import br.com.JavaWeb.estudo.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(6); 
	
		
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.excluir(usu);;
		
	}
	
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setId(3); 
		usu.setNome("Teste1");
		usu.setLogin("teste1");
		usu.setSenha("123");
		
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.alterar(usu);;
		
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		usu.setNome("Filo");
		usu.setLogin("mena");
		usu.setSenha("123");
		
		UsuarioDao usuDAO = new UsuarioDao();
		usuDAO.cadastrar(usu);
		
	}

}
