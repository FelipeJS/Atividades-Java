package br.com.investprojrestful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.investprojrestful.controller.UsuarioController;
import br.com.investprojrestful.domain.Usuario;

@Path("/usuario")
public class UsuarioResource {
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Usuario> listarTodos(){
		return new UsuarioController().listarTodos();
	}
	
	public static void main(String[] args) {
		UsuarioResource usuarioResource = new UsuarioResource();
		System.out.println(usuarioResource.listarTodos());
	}
}
