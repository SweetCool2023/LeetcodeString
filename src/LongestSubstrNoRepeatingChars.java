import java.util.*;

public class LongestSubstrNoRepeatingChars {
	public int longestStrNonRepeatingChars(String str) {
		int result= 1;
		
		if(str == null)
			return 0;
		
		if(str.length() == 0)
			return 0;
		
		for(int i=0; i<str.length(); i++) {
			int currResult = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) != str.charAt(j))
					currResult++;
				else {
					if(currResult > result) {
						result = currResult;
					}
					
					break;
						
				}
			}
			
			
			
			
			/*
			char currChar = str.charAt(i);
			if(myList.contains(currChar)) {
				
			}
			else {
				myList.add(currChar);
				result++;
				resultStr = resultStr + currChar;
			}
			*/			
			
		}
		

		
		return result;
	}

}
