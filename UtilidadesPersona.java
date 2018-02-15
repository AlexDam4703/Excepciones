package exepciones;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadesPersona {
	//metodo que nos diga si un dni es valido o no
	
	public static boolean validarDNI (String dni) {
		String regexDNI ="^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
		if (!dni.toUpperCase().matches(regexDNI))
			return false;
		// 11111111H lenght () = 9
		char letra = dni.charAt(dni.length()-1);
		String numero = dni.toUpperCase().substring(0, dni.length()-1); // subString recoge desde 0 hasta donde se le indique sin entrar la ultima
		int numeroDNI = Integer.parseInt(numero);
		int posicion = numeroDNI % 23;
		return letra == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(posicion);
	}
	
	//metodo que nos diga si una fecha es valida o no
	//fehca del futuro
	public static boolean validarFecha (LocalDate localDate) {
		Period period = Period.between(localDate, LocalDate.now());
		int resultado = period.getYears() + period.getMonths() + period.getDays();
		System.out.println(period);
		return resultado >=0;
	}
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2000, 02, 13);
		validarFecha(localDate);
	}
	
}
