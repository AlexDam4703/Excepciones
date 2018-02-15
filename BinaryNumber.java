package exepciones;

public class BinaryNumber {
	private String value;

	public BinaryNumber(String value) throws BinaryException { //esto nos indica que este metodo lanza una excepcion en el que caso de que el objeto no se declare de forma deacuanda
		if (checkBinary(value)) {
		this.value = value;
		}
		else 
			throw new BinaryException("Invalid binary number"); //aqui es donde se crea la exepcion y arribla en el metodo habra que declararla.
		
	}
	public String getValue() {
		return value;
	}
	public int getDecimalValue () {
		int decimal = 0;
		StringBuilder stringBuilder = new StringBuilder (value);
		String inverseValue = stringBuilder.reverse().toString();
		for (int i = 0 ; i < inverseValue.length() ; i++) {
			if (inverseValue.charAt(i)== '1')
				decimal += Math.pow(2, i);
		}
		return decimal;
	}
	
	
	private static boolean checkBinary (String value) {
		return value.matches ("[01]+");
	}
	public static void main (String args []) {//en el caso de que checkbinary no fuera estatico en el main habria que crean una referececnia para poder acudir al metodo
		System.out.println(checkBinary("0001100"));
	}
}
