package Service;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.faces.flow.builder.SwitchBuilder;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
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
	
	@GET
	@Path("/cadastrar2/{nome}/{email}/{cpf}/{senha}/{datanasc}")
	public Response cadastraUsuarios(@PathParam("nome") String nome, @PathParam("email") String email,
			@PathParam("cpf") String cpf, @PathParam("senha") String senha, @PathParam("dataNasc") LocalDate dataNasc) {
		Usuarios user = new Usuarios(nome, cpf, email, senha,dataNasc);
		lista.inserir(user);
		return Response.status(Response.Status.OK).entity(Response.Status.OK.toString()).build();
	}
	@GET
	@Path("funcionamento")
	public Response funcionamento() {
		return Response.status(Response.Status.OK).entity(Response.Status.OK.toString()).build();
	}
	
	@GET
	@Path("login/{email}/{senha}")
	public Response acessoAplicacao(@PathParam("email") String email, @PathParam("senha") String senha) {
			return Response.status(Response.Status.OK).entity(Response.Status.OK.toString()).build();
		
	}
	
	@GET
	@Path("consulta/{dado}/{tipo}")
	@Produces("application/json")
	public Response usuarios(@PathParam("dado") String dado, @PathParam("tipo") Integer tipo) {
		List<Usuarios> usuarios = lista.listarUsuarios();
		List<Usuarios> retorno = new ArrayList<>();
	
	// blz, mas o @Path sei la como escreve     perai deixa eu abrir o ionic kkk vcq utem q colocar igual o do ionic... perai 
		
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
		return Response.status(Response.Status.OK).entity(retorno).build();
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
		return Response.status(Response.Status.OK).entity(retorno).build();
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
	
//	Usuarios usu = new Usuarios();
//	ArrayList< Usuarios > listaUsuario = new ArrayList<Usuarios>();
//	
//	@GET
//	@Path("/hello")
//	public Response hello() {
//		return Response.status(200).entity("chamou.").build();
//
//	}
	//http://localhost:8080/WebService-Ionic/resource/usuario/hello
	
	
	
//	@POST
//     @Path("/testeAddUsuario")
//    @Produces
//    @Consumes("application/json")
//    public Response testeCadastrar(Usuarios objUsuario) {
//       System.out.println("Nome do Usuario: " + objUsuario.getNome());
//       System.out.println("Cpf do Usuario: " + objUsuario.getCpf());
//       System.out.println("Senha do Usuario: " + objUsuario.getSenha());
//       System.out.println("Email do Usuario: " + objUsuario.getEmail());
//       System.out.println("Data de Nascimento do Usuario: " + objUsuario.getDataNasc());
//       
//		
//        return Response.status(200).entity(objUsuario.getNome()).build();     
//      
//    }
	
//	@POST
//    @Path("/adicionar")
//    @Produces
//    @Consumes("application/json")
//    public Response cadastrar(Usuarios objUsuario) {
//       // System.out.println("Cliente: " + objUsuario.getNome());
//		
//        return Response.status(200).entity(objUsuario.getNome()).build();}
//	
//	
//	@GET
//    @Path( "/consulta" )
//    @Produces("application/json")
//    public String ConsultaUsuario() 
//	{
//		return null;
//	}
	
	
	
	
	
		
	}



