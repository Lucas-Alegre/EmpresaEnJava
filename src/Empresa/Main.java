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

