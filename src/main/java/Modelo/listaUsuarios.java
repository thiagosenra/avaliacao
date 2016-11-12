package Modelo;

import java.util.ArrayList;
import java.util.List;

public class listaUsuarios {
	private static List <Usuarios> listaUsuarios;
	Usuarios users = new Usuarios();
	public static void add(Usuarios users) {
		// TODO Auto-generated method stub
		
		users.setNome("");
		users.setSenha("");
		users.setCpf(123);
		
		
		users.setDataNasc(1234);
	}

}
