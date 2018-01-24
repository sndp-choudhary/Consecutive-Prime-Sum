package com.sum_prime.sndp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class PrimeSum {
   public static void main(String []args){
	   int n;//input variable
	   ArrayList list=new ArrayList();
	   int x,y=5;//y=all the prime number which is less than input
	   x=0;//x=number of prime numbers expressed as sum of prime
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter Input :");
	   n=scan.nextInt();
	   System.out.println("Prime Numbers are :");
	   if(n>3){
	   for(int i=3;i<=n;i++){
		  if(i%2==0||i%3==0){
			  
		  }//if
		  else{
			 list.add(i);
			  
		  }//else   
	   }//for
	  
	   Iterator i= list.iterator();
	   while(i.hasNext()){
		  
		  
		  
		  if(y%2==0||y%3==0){	
			 
		  }//if
		  
		  else{
			  if(y<=n){
		  x=x+1;//Increment
		  System.out.println(y);
			  }
		  }//else
		  
		  y=y+(Integer)i.next();//addition of consecutive prime number
		   
	      
	   }//while
	   
	   
	   
	   System.out.println("Total Prime No are/is :"+x);//total prime number
	   scan.close();
	   }
	   else{
		   System.out.println("Invalid Input");//else loop if input is less than 3
	   }
	   
		   
	   
   }//main
}//PrimeSum
