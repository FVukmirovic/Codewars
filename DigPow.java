import java.util.ArrayList;

public class DigPow {

	public static long digPow(int n, int p) {

		String intToString = String.valueOf(n); // integer to string
		ArrayList<Integer> squaredInts = new ArrayList<Integer>();

		int[] digits = intToString.chars().map(i -> i - '0').toArray(); // adds digits to array
		int sum = 0;
		int k = 1;

		for (int j = 0; j < digits.length; j++) {

			double squaredDouble = Math.pow(digits[j], p++); // calculates ^ for each number
			// System.out.println(squaredDouble);
			int squaredInt = (int) Math.round(squaredDouble); // double to int
			// System.out.println(squaredInt);

			squaredInts.add(squaredInt);

		}

		for (int j = 0; j < squaredInts.size(); j++) { // sum of all numbers after ^
			sum = sum + squaredInts.get(j);
			// System.out.println(squaredInts.get(j));
		}
		// System.out.println("Sum is " + sum);

		while (sum / n != k) { // finding k
			k++;
		}
		// System.out.println(k);
		// System.out.println("n= " + n + " k= " + k + " sum= " + sum);

		if (k >= sum || sum < 1 || k == 0 || sum % n != 0) { 
    // added more conditions after encountering errors when trying to submit
			return -1;
		} else {
			return k;
		}

	}

}
