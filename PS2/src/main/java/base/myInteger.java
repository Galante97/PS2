package base;

public class myInteger {

	// data field
	private static int iValue;

	// constructor
	public myInteger(int i) {
		iValue = i;

	}

	//getter, iValue
	public static int getiValue() {
		return iValue;
	}

	public static void setiValue(int iValue) {
		myInteger.iValue = iValue;
	}

	//methods
	boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {

			return false;
		}
	}

	boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;

		}
	}

	boolean isPrime() {
		int j = 2;
		while (j <= iValue / 2) {
			if (j % iValue == 0) {
				return false;
			}
			j++;
		}

		return true;
	}
	
	
	//static methods
	public static boolean isEven(int evenInt) {
		iValue = evenInt;
		if (evenInt % 2 == 0) {
			return true;
		} else {

			return false;
		}
	}

	public static boolean isOdd(int oddInt) {
		iValue = oddInt;
		if (oddInt % 2 != 0) {
			return true;
		} else {
			return false;

		}
	}

	public static boolean isPrime(int primeInt) {
		iValue = primeInt;
		int j = 2;
		while (j <= primeInt / 2) {
			if (j % primeInt == 0) {
				return false;
			}
			j++;
		}

		return true;
	}


	public static boolean isEven(myInteger n) {
		return isEven(myInteger.getiValue());
		
	}
	
	public static boolean isOdd(myInteger n) {
		return isOdd(myInteger.getiValue());
		
	}
	
	public static boolean isPrime(myInteger n) {
		return isPrime(myInteger.getiValue());
		
	}
	
	 //EQUALS
 	static boolean equals(int i) {
 		return true; 
		
	}

	public static boolean equals(myInteger n) {
		return equals(myInteger.getiValue());
	}

	
}
