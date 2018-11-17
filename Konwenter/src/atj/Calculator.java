package atj;

public class Calculator {
	public Double doCF(String operation, Double num12) throws IllegalArgumentException {

		Double result = null;

		if (operation.equals("Celcjusz na Fahrenheit"))
			result = CelcjusznaFar(num12);
		if (operation.equals("Fahrenheit na Celcjusz"))
			result = FAFar(num12);

		return result;

	}

	private Double CelcjusznaFar(Double num12) {
		return 1.8 * num12 + 32;
	}

	private Double FAFar(Double num12) {
		return (num12 - 32) / 1.8;
	}

}