package com.logztechstuff.zolando.problems;

public class Problem1 {
	public int solution(String S) {
        // write your code in Java SE 8
		if(S == null || S.trim().isEmpty()) {
			return -1;
		}
		int max = 0;
		String matchedWord = "";
		boolean isUppercaseFound = false;
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(Character.isDigit(ch)) {
				max = getValidSubStringLength(matchedWord, isUppercaseFound, max);
				matchedWord = "";
				isUppercaseFound = false;
			} else {
				if(Character.isUpperCase(ch)) {
					isUppercaseFound = true;
				}
				matchedWord += ch;
			}
		}
		max = getValidSubStringLength(matchedWord, isUppercaseFound, max);
		return max == 0 ? -1 : max;
    }
	
	private int getValidSubStringLength(String subString, boolean isUppercaseFound, int max) {
		if(!subString.isEmpty() && isUppercaseFound)  {
			if(max < subString.length()) {
				max = subString.length();
			}
		}
		return max;
	}
}