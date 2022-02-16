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