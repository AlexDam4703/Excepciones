package exepciones;


public class HexadecimalNumber {
	private String value;

	public HexadecimalNumber(String value) throws hexadecilamException {
		if (correctValue(value))
		this.value = value;
		else 
			throw new hexadecilamException ("Invalid number");
	} 
	
	public String getValue() {
		return value;
	}
	public int getDeciamalNumber () {
		StringBuilder stringBuilder = new StringBuilder (value);
		String valueReverse = stringBuilder.reverse().toString();
		int decimal = 0 ;
		for (int i = 0 ; i < valueReverse.length() ; i++ ) {
		}
		return decimal;
	}
	private static boolean correctValue (String value) {
		
		return value.toUpperCase().matches ("[1-9ABCDEF]+");
	}
}
