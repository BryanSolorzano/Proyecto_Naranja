package clases.mundo;

import java.util.ArrayList;

public class ClassLogin {

	//Atributos
	
	private ArrayList<Usuarios> personal;
	
	public ClassLogin( ) {
		personal = new ArrayList<Usuarios>( );
		
		personal.add( new Usuarios("Wilfrido", "123A", "Supervisor"));
		personal.add( new Usuarios("Roberto", "123B", "Admin"));
		personal.add( new Usuarios("Frida", "123C", "Secretaria"));
		personal.add( new Usuarios("Anonymous", "1111", "Soporte Tecnico"));
		personal.add( new Usuarios("Anonimo", "2222", "Chofer"));
		
	}
	
	/**
	 * Un metodo que puede llegar a ser usado con frecuencia, 
	 * por lo que se implementa para la busqueda de los usuarios
	 * @param pUsuario
	 * @return
	 */
	public Usuarios BuscarUsuario(String pUsuario) {
		
		Usuarios buscado = null;
		int i = 0;
		
		while( i < personal.size() && buscado == null) {
			Usuarios actual = personal.get(i);
			if( actual.getUsuario().equals(pUsuario)) {
				buscado = actual;
			}
			i++;
		}
		return buscado;
	}
	
	/**
	 * Metodo que sera usado por la InterfazLogin, 
	 * Esta validara el ingreso del personal solamente tenga permisos
	 * @param pUsuario
	 * @param pContraseña
	 * @param pCargo
	 * @return
	 */
	public boolean ValidarUsuario( String pUsuario, String pContraseña, String pCargo ) {
		Usuarios buscado = BuscarUsuario(pUsuario);
		boolean confirmacion;
		
		String usuario = buscado.getUsuario();
		String contraseña = buscado.getContraseña();
		String cargo = buscado.getCargo();
		
		if ( usuario == pUsuario && contraseña == pContraseña && cargo == pCargo) {
			confirmacion = true; 
		} else {
			confirmacion = false;
		}
		return confirmacion;
	}
	
	/**
	 * Mostrara un arreglo de todos los usarios que ahcen participes, 
	 * Se usa el metodo ToString para guardar los datos 
	 * @return
	 */
	public ArrayList<String> mostrarUsuarios( ) {
		
		ArrayList<String>motrar = new ArrayList<String>();
		
		for( Usuarios used : personal ){
	        	String datos = used.toString();
	        	motrar.add( datos );
	    }
		
		
		return motrar;
	}
	
}