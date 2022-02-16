package Empresa;

public class Main {

	public static void main(String[] args) {
		
		Usuario persona = new Usuario("Alegre", "Lucas");
		Region localidad = new Region("Concordia, Entre ríos, Argentina");
		Empresa empresa = new Empresa(persona, localidad);
		
		System.out.println("-----------------Bienvenidos------------------");
		System.out.println(empresa.toString());
		System.out.println("-----------------Bienvenidos------------------");
	}

}

class Empresa {

	private Usuario usuario;
	private Region region;
	private Tipo tipo;

	public Empresa(Usuario usuario, Region region, Tipo tipo) {
		this.usuario = usuario;
		this.region = region;
		this.tipo = tipo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public Region getRegion() {
		return region;
	}
	public Tipo getTipo() {
		return tipo;
	}
	@Override
	public String toString() {
		return "Empresa ( " + getUsuario() + ", " + getRegion() + ", " + getTipo() + " )";
	}

}


class Usuario {

	private String apellido;
	private String nombre;

	public Usuario(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Usuario( " + getApellido() + ", " + getNombre() + " )";
	}
	
}


class Region {

	private String localidad;

	public Region(String localidad) {
		this.localidad = localidad;
	}

	public String getLocalidad() {
		return localidad;
	}
	@Override
	public String toString() {
		return "Region [localidad=" + localidad + "]";
	}
}
class Tipo{
	private String tipo;
	
	public Tipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo(){
		return tipo;
	}
	@Override
	public String toString() {
		return "Tipo [tipo=" + tipo + "]";
	}
}
