package br.com.investprojrestful.controller;

import java.util.ArrayList;

import br.com.investprojrestful.dao.UsuarioDAO;
import br.com.investprojrestful.domain.Usuario;

public class UsuarioController {
	public ArrayList<Usuario> listarTodos(){
		return UsuarioDAO.getInstance().listarTodos();
	}
	
	public static void main(String[] args) {
		UsuarioController usuarioController = new UsuarioController();
		System.out.println(usuarioController.listarTodos());
	}
}
