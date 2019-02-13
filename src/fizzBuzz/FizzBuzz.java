package fizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.resultToTable();
		fb.printResult();
	}

	public ArrayList<String> resultTable = new ArrayList<>();

	public String getValueAtIndex(int index) {
		if(index % 3 == 0 && index % 5 == 0) {
			return "FizzBuzz";
		}
		if(index % 3 == 0) {
			return "Fizz";
		}
		if(index % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(index);
	}

	public void resultToTable() {
		for(int i = 1; i <= 100; i++) {
			resultTable.add(getValueAtIndex(i));
		}
	}
	
	public void printResult() {
		for (String element : resultTable) {
			System.out.println(element);
		}
	}

}
