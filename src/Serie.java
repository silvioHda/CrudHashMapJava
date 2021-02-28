
public class Serie {
	String nombre;
	String genero;
	String plataforma;
	int capitulos;
	
	public Serie() {
		
	}
	
public Serie(String nombre) {
		this.nombre = nombre;
	}
	
	public Serie(String nombre, String genero, String plataforma, int capitulos) {
		this.nombre = nombre;
		this.genero = genero;
		this.plataforma = plataforma;
		this.capitulos = capitulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Seria [nombre=" + nombre + ", genero=" + genero + ", plataforma=" + plataforma + ", capitulos="
				+ capitulos + "]\n";
	}
	
	
	 
	
}
