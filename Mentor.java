package task;

import java.util.Scanner;

public class Mentor {

	public static void main(String[] args) {
		//getting input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter values:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter X:");
		int x=sc.nextInt();
		//process
		if(a[0]==x)
			a[0]=1;
		 for(int i=1;i<a.length;i++) {
			 if(a[i]==x) {
				  for(int j=i;j>0;j--) {
					  int temp=1;
					  a[j]=a[j-1];
					  a[j-1]=temp;
				  } 
			 }
		 }
		 //output
		  for(int i=0;i<a.length;i++) {
			  System.out.print(a[i]+",");
		  }
	} 
}
