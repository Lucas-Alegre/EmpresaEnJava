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
