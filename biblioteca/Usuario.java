package biblioteca;

public class Usuario {

    
	private long codusuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
    public long gestionusuarios;
	
	public Usuario() {
		
	}
	
	public 	Usuario(long codusuario, String nombre, String apellido1, String apellido2) {
		this.codusuario=codusuario;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
	}

	public long getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(long codusuario) {
		this.codusuario = codusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result + ((apellido2 == null) ? 0 : apellido2.hashCode());
		result = prime * result + (int) (codusuario ^ (codusuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (apellido2 == null) {
			if (other.apellido2 != null)
				return false;
		} else if (!apellido2.equals(other.apellido2))
			return false;
		if (codusuario != other.codusuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	public String toString() {
		return "Código de usuario: " + codusuario + "\nNombre=" + nombre + "\nApellidos="+apellido1+" "+apellido2;
	}
}


