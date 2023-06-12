package com.emp.test;

import java.util.Arrays;

public class LeetCode {
	public static void main(String[] args) {
		String[] strs={"dog","racecar","car"};		
		
		
		
		
	//finding minimum length
		int minLength=strs[0].length();
		for(int i=1;i<strs.length;i++){			
			if(strs[i].length() < minLength) {
				minLength=strs[i].length();
				}	
		}	
		
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		String str1 ="";
		 for(int j=0;j<minLength;j++){
			 if(strs[0].charAt(j) == strs[strs.length-1].charAt(j))
			 {				
					str1=str1+strs[0].charAt(j);
			 }
			 else {
				 break;
				
			 }			 
		 }
		 System.out.println(str1);
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}