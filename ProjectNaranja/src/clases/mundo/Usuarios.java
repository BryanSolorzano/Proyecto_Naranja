package clases.mundo;

public class Usuarios {

	//Usuario
		private String usuario;
		
		private String contraseña;
		
		private String cargo;
		
		//Constructor
		
		public Usuarios(String pUsuario, String pContraseña, String pCargo) {
			usuario = pUsuario;
			contraseña = pContraseña;
			cargo = pCargo;
		}
		
		@Override
		public String toString() {
			return "ClassLogin [usuario=" + usuario + ", contraseña=" + contraseña + ", cargo=" + cargo + "]";
		}

		public String getUsuario() {
			return usuario;
		}


		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
	}
