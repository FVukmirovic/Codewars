import java.util.ArrayList;

public class JadenCase {

	public String toJadenCase(String phrase) {

		String phraseFinal = "";
		
		
		if (phrase != null && phrase != "") {

			String[] phraseString = phrase.split(" "); // contains words from input phrase
			ArrayList<String> editedStringArr = new ArrayList<>();

			for (int i = 0; i < phraseString.length; i++) {
				
				String str = phraseString[i].substring(0, 1).toUpperCase() + phraseString[i].substring(1).toLowerCase();  // changes first character to uppercase
				editedStringArr.add(str);
				
					
			}
			
			for (int i = 0; i < editedStringArr.size(); i++) {
				phraseFinal = phraseFinal += editedStringArr.get(i) + " ";
			}
       phraseFinal = phraseFinal.substring(0, phraseFinal.length() - 1); //removes last space from the string
			return phraseFinal;

		} else {

			
			return null;
		}
	}

}
