package com.logztechstuff.zolando.test;

import com.logztechstuff.zolando.problems.Problem1;

public class TestTask1 {

	public static void main(String[] args) {
		
		Problem1 solution = new Problem1();
		System.out.println("1st::" + solution.solution("12344"));
		System.out.println("2nd::" + solution.solution("a0Bb"));
		System.out.println("3rd::" + solution.solution("hhbjjkl9090909090hhbbgghR"));
		System.out.println("4th::" + solution.solution("78iiii33vvvv0ThTyJu"));
		System.out.println("Null::" + solution.solution(null));
		System.out.println("Empty::" + solution.solution(""));
		System.out.println("Only Spaces::" + solution.solution("    "));
		System.out.println("Only smaller cases::" + solution.solution("asvbhjs999klohuh99"));
		System.out.println("3rd::" + solution.solution("hhbjjkl9090909090hhbbgg hR"));
	}
}
