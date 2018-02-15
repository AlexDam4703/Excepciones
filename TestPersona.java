package exepciones;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in); 
		System.out.println("Intruduce nombre");
		String nombre = in.nextLine();
		System.out.println("Introduce apellidos");
		String apellidos = in.nextLine ();
		if(!nombre.toLowerCase().matches("[a-zñáéíóúäëïöü\\s]+") || 
				(!apellidos.toLowerCase().matches("[a-zñáéíóúäëïöü\\s]"))){
			System.out.println("Nombre no valido");
			System.exit(1);
	
		}
		System.out.println("Introduce fecha dd/mm/aaaa");
		String fecha = in.nextLine();
		String regexDias = "(0[1-9]|[1-9]|[1-2][0-9])|3[0-1]";
		String regexMeses ="(0[1-9]|[1-9]|1[0-2])";
		String regexAnio = "[0-9] {1,4}";
		if (!fecha.matches(regexDias +"/" + regexMeses + "/" + regexAnio));
		System.out.println("fecha no valida");
		System.out.println("Intruduce dni con letra");
		String dni = in.nextLine();

	}

}
