package com.learingonline;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindAnArrayElementsOrNot {

	int array[]= {1,2,3,4,5};
	int numbertofind=3;
	boolean found=false;
	public void anArrayElementsOrNot()
	
	{
		
		for(int number:array)
		{
			if(number==numbertofind) {
				found=true;
				break;
			}
		}
			if(found) {
				System.out.println("The elements is present");
			}
			else {
				System.out.println("The elements is not present");
			}
		

	}
	
	public void usingIntStream() {
		
	boolean found=IntStream.of(array).anyMatch(elements->elements==numbertofind);
	if(found) {
		System.out.println("The number is present");
	}
	else
	{
		System.out.println("The number is not present");
	}
	}
	public static void main(String[] args) {
		FindAnArrayElementsOrNot elementsOrNot=new FindAnArrayElementsOrNot();
		elementsOrNot.anArrayElementsOrNot();

	}

}
