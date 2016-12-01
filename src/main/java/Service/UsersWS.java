package Service;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Modelo.Usuarios;
import Modelo.listaUsuarios;





@Path("/usuario")
@ApplicationPath("/resource")
public class UsersWS extends Application {

	Usuarios usu = new Usuarios();
	ArrayList< Usuarios > listaUsuario = new ArrayList<Usuarios>();
	
	@GET
	@Path("/hello")
	public Response hello() {
		return Response.status(200).entity("chamou.").build();

	}
	//http://localhost:8080/WebService-Ionic/resource/usuario/hello
	
	
	
	@POST
    @Path("/testeAddUsuario")
    @Produces
    @Consumes("application/json")
    public Response testeCadastrar(Usuarios objUsuario) {
       System.out.println("Nome do Usuario: " + objUsuario.getNome());
       System.out.println("Cpf do Usuario: " + objUsuario.getCpf());
       System.out.println("Senha do Usuario: " + objUsuario.getSenha());
       System.out.println("Email do Usuario: " + objUsuario.getEmail());
       System.out.println("Data de Nascimento do Usuario: " + objUsuario.getDataNasc());
       
		
        return Response.status(200).entity(objUsuario.getNome()).build();     
      
    }
	
	@POST
    @Path("/adicionar")
    @Produces
    @Consumes("application/json")
    public Response cadastrar(Usuarios objUsuario) {
       // System.out.println("Cliente: " + objUsuario.getNome());
		
        return Response.status(200).entity(objUsuario.getNome()).build();}
	
	
	@GET
    @Path( "/consulta" )
    @Produces("application/json")
    public String ConsultaUsuario() 
	{
		return null;
	}
	
	
	
	
	
		
	}


