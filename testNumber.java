package exepciones;

public class testNumber {

	public static void main(String[] args) {
	try {
		BinaryNumber binaryNumber = new BinaryNumber ("0011");
		System.out.printf("Decimal value of %s is %d%n",
				binaryNumber.getValue(),binaryNumber.getDecimalValue());
	} catch (BinaryException e) {
	}
	
	}

}
