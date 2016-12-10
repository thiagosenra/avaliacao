package Service;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import Modelo.Usuarios;

import util.ListaUsuarios;




@Path("/usuario")
public class UsersWS {
	Usuarios usuario;
	ListaUsuarios lista = new ListaUsuarios();
	public UsersWS (){		
		usuario = new Usuarios();
	}
	// 
	@GET
	@Path("/cadastrar2/{nome}/{email}/{cpf}/{senha}/{datanasc}")
	@Produces("application/json")
	public Response cadastraUsuarios(@PathParam("nome") String nome, @PathParam("email") String email,
			@PathParam("cpf") String cpf, @PathParam("senha") String senha, @PathParam("datanasc") String dataNasc) {
		String dataStr[] = dataNasc.split("-");
		LocalDate dataToLocalDate = LocalDate.of(Integer.valueOf(dataStr[0]), Integer.valueOf(dataStr[1]),
				Integer.valueOf(dataStr[2]));
		Usuarios user = new Usuarios(nome, cpf, email, senha, dataToLocalDate);
		lista.inserir(user);
		return Response.status(Response.Status.OK).entity(user).header("Access-Control-Allow-Origin", "*").build();
	}
	
	@GET
	@Path("login/{email}/{senha}")
	public Response acessoAplicacao(@PathParam("email") String email, @PathParam("senha") String senha) {
			return Response.status(Response.Status.OK).entity(Response.Status.OK.toString()).header("Access-Control-Allow-Origin", "*").build();
		
	}
	
	@GET
	@Path("buscarPorNome/{nome}")
	@Produces("application/json")
	public Response buscarPorNome(@PathParam("nome") String nome){
		List<Usuarios> usuarios = lista.listarUsuarios();
		List<Usuarios> retorno = new ArrayList<>();
		for(Usuarios n : usuarios){
			if (n.getNome() != null && n.getNome().equalsIgnoreCase(nome)) {
				retorno.add(n);
			}
		}
		return Response.status(Response.Status.OK).entity(retorno).header("Access-Control-Allow-Origin", "*").build();
	}
	
	@GET
	@Path("buscarPorEmail/{email}")
	@Produces("application/json")
	public Response buscarPorEmail(@PathParam("email") String email){
		List<Usuarios> usuarios = lista.listarUsuarios();
		List<Usuarios> retorno = new ArrayList<>();
		for(Usuarios n : usuarios){
			if (n.getEmail() != null && n.getEmail().equalsIgnoreCase(email)) {
				retorno.add(n);
			}
		}
		return Response.status(Response.Status.OK).entity(retorno).header("Access-Control-Allow-Origin", "*").build();
	}
	
	@GET
	@Path("buscarPorCPF/{cpf}")
	@Produces("application/json")
	public Response buscarPorCPF(@PathParam("cpf") String cpf){
		List<Usuarios> usuarios = lista.listarUsuarios();
		List<Usuarios> retorno = new ArrayList<>();
		for(Usuarios n : usuarios){
			if (n.getCpf() != null && n.getCpf().equalsIgnoreCase(cpf)) {
				retorno.add(n);
			}
		}
		return Response.status(Response.Status.OK).entity(retorno).build();
	}
	
	}
	

	
	
	
	
	
		
	



