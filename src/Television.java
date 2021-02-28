
public class Television {
	int clave;
	String modelo;
	String marca;
	double precio;
	double pulgada;
	
	
	public Television() {
		
	}
		
	public Television(int clave, String modelo, String marca, double precio, double pulgada) {
		this.clave = clave;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.pulgada = pulgada;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPulgada() {
		return pulgada;
	}

	public void setPulgada(double pulgada) {
		this.pulgada = pulgada;
	}

	@Override
	public String toString() {
		return "Television [clave=" + clave + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio
				+ ", pulgada=" + pulgada + "]\n";
	}
	
	
	
}
