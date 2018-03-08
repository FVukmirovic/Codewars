public class FindShortestWord {

	public static int findShort(String s) {
		
		String[] phraseString = s.split(" "); // contains words from input phrase

		int length = 100;
		for (String string : phraseString) {
			if(string.length() <= length) {
				length = string.length();
			}
		}
		return length;
	}
}
