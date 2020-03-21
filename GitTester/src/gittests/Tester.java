package gittests;
import java.io.*;
import java.util.*;

public class Tester {


	/*
	 * To execute Java, please define "static void main" on a class
	 * named Solution.
	 *
	 * If you need more classes, simply define them inline.
	 */

	/* Create a menthod that returns the largest possible number using these numbers */

	  public static void main(String[] args) {
	   String num = "63821079046";
	    char[] numString = num.toCharArray();
	    
	    ArrayList<String> numArrList = new ArrayList<String>();
	    System.out.println(numString);
	    
	    for(int i = 0; i<numString.length; i++){
	      numArrList.add(Character.toString(numString[i]));
	    }
//	     int numA[] = new int ;
//	     count = num.length();
	    
//	       for (int i = 0; i < count; i++)
	    
	    System.out.println(numArrList);
	    Collections.sort(numArrList);
	     // Collections.sort(numArrList,Collections.reverseOrder());
	  
	    System.out.println("numbers in ascending order"+numArrList);
	    
	    Collections.sort(numArrList,Collections.reverseOrder());
	      System.out.println("numbers in descending order"+numArrList);
	   //  int num1 = 638214;
	   // while (num1 > 0){
	   //     System.out.print(num1 %10);
	   //  num1 = num1/10;
	    //System.out.println(num1);

	  }
	  }
	  

