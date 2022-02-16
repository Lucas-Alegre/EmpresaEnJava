package Empresa;

public class Main {

	public static void main(String[] args) {
		

	}

}
class Empresa {

	private Usuario usuario;
	private Region region;

	public Empresa(Usuario usuario, Region region) {
		this.usuario = usuario;
		this.region = region;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public Region getRegion() {
		return region;
	}
	@Override
	public String toString() {
		return "Empresa ( " + getUsuario() + ", " + getRegion() + " )";
	}

}

