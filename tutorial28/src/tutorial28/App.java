package tutorial28;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 25466;
		
		// float should have "f" at the end
		// by default if it doesn't have it is considered double
		float floatValue = 9954.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 42.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		
		// cast int to long
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		// auto cast doubleValue - adds .0 to value
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		
		// cast intValue to float
		// cuts the end off - doens't round
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// the ff won't work as expected, 128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue); //pushed to min value as max is 127
	}

}
