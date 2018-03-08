
import java.util.Arrays;

public class Line {

	public static String Tickets(int[] peopleInLine) {
		System.out.println(Arrays.toString(peopleInLine));
		int bill25 = 0, bill50 = 0, bill100 = 0;
		
		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == 25) {
				bill25++;
			} else if (peopleInLine[i] == 50 && bill25 >= 1) {
				bill50++;
				bill25--;
			} else if (peopleInLine[i] == 100) {
				if (bill25 >= 1 && bill50 >= 1) {
					bill25--;
					bill50--;
				} else {
					bill25 = bill25 - 3;
				}
			} else {
				return "NO";
			}
		}
		
		if(bill25 >= 0 && bill50 >= 0 && bill100 >= 0) {
			return "YES";
		}else {
			return "NO";
		}


	}

}
