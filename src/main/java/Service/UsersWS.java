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


import Modelo.Usuarios;
import Modelo.listaUsuarios;




@Path("/WebService")
@ApplicationPath("/resource")
public class UsersWS extends Application {
	// http://localhost:8080/avaliacao/resource/WebService/listaUsuarios
	
	
	@POST
	@Path("/cadastroUsuarios")
	@Consumes("application/json")
	public void cadastroUsuarios(Usuarios objUsuarios){
		try {
			
		} catch (Exception e) {
			System.out.println("error"+e);
		}
	}
	
	@GET
	@Path("/listaUsuarios")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public listaUsuarios CadastroUsuarios() {
	try {
		Usuarios users = new Usuarios();
		listaUsuarios.add(users);
		
		System.out.println(users);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	
		
	}

}
