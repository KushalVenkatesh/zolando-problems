package com.logztechstuff.zolando.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {
	
	 public int solution(int A, int B) {
	     // write your code in Java SE 8
		 int result = 0;
		 
		 List<Integer> listOfA = convertIntToList(A);
		 List<Integer> listOfB = convertIntToList(B);
		 
		 int maxLength = listOfA.size() > listOfB.size() ? listOfA.size() : listOfB.size();
		 
		 for(int i = 0; i < maxLength; i++) {
			 result = getResult(i, listOfA, result);
			 result = getResult(i, listOfB, result);
		 }

		 return result > 1_000_000_000 ? -1 : result;
	 }
	 
	 private int getResult(int i, List<Integer> list, int result) {
		 if(list.size() >= (i + 1)) {
			 result = (result * 10) + list.get(i);
		 }
		 return result;
	 }
	 
	 private List<Integer> convertIntToList(int num) {
		 List<Integer> listOfIntegers = new ArrayList<>();
		 do {
			 listOfIntegers.add(num % 10);
			 num /= 10;
		 } while(num > 0);
		 Collections.reverse(listOfIntegers);
		 return listOfIntegers;
	 }
}
