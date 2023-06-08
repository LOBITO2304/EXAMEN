package biblioteca;

public class Libro {

	private long identificador;
	private String signatura;
	private String titulo;
	private String autor;
	private String materia;
	private String editorial;
	
	public Libro(){
	}
	
	public Libro(long identificador, String signatura, String titulo, String autor, String materia, String editorial) {
		this.identificador=identificador;
		this.signatura=signatura;
		this.titulo=titulo;
		this.autor=autor;
		this.materia=materia;
		this.editorial=editorial;
	}

	public long getidentificador() {
		return identificador;
	}

	public void setidentificador(long identificador) {
		identificador = identificador;
	}

	public String getSignatura() {
		return signatura;
	}

	public void setSignatura(String signatura) {
		this.signatura = signatura;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (identificador != other.identificador)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (signatura == null) {
			if (other.signatura != null)
				return false;
		} else if (!signatura.equals(other.signatura))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String toString() {
		return "identificador: "+identificador+"\nSignatura: "+signatura+"\nTítulo: "+titulo+"\nAutor: "+autor
				+"\nMateria: "+materia+"\nEditorial: "+editorial;
	}
}