package com.logztechstuff.zolando.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {

	public int solution(int[] A, int[] B, int M, int X, int Y) {

		int alreadyTravelled = 0; 
		
		int totalStops = 0;
		
		do {
			int personsCount = countOfPersonsForThisTrip(A, X, Y, alreadyTravelled);

			//System.out.println("Persons Count::" + personsCount);
			
			List<Integer> listOfStops = new ArrayList<>();
			
			for(int i = alreadyTravelled; i < (personsCount + alreadyTravelled); i++) {
				if(!listOfStops.contains(B[i])) {
					totalStops++;
					listOfStops.add(B[i]);
					//System.out.println(listOfStops);
				}
			}

			alreadyTravelled += personsCount;

			totalStops++;
			
			//System.out.println("Already Travelled::" + alreadyTravelled);
			
			//System.out.println("Total Stops::" + totalStops);
		
		} while(alreadyTravelled < A.length);
		
		System.out.println(totalStops);
		
		return 0;
	}
	
	private int countOfPersonsForThisTrip(int[] A, int X, int Y, int alreadyTravelled) {
		
		int totalPersons = A.length - alreadyTravelled;

		int theirTotalWeight = Arrays.stream(A, alreadyTravelled, A.length).sum();
		
		int persons = 0;
		
		if(totalPersons <= X && theirTotalWeight <= Y) {
			persons = totalPersons;
		} else {
			if(totalPersons > X && theirTotalWeight <= Y) {
				persons = X;
			} else if(theirTotalWeight > Y) {
				int weight = 0;
				for(int i = alreadyTravelled; i < totalPersons; i++) {
					if((weight + A[i]) > Y) {
						break;
					} else {
						weight += A[i];
						persons++;
					}
				}
			} 
		} 
		return persons;
	}
	
	public static void main(String[] args) {
		Problem3 solution = new Problem3();
		//solution.solution(new int[]{60, 80, 40}, new int[]{2, 3, 5}, 5, 2, 200);
		
		solution.solution(new int[]{40, 40, 10, 80, 20}, 
				new int[]{3, 3, 2, 2, 3}, 3, 5, 200);
	}
}
