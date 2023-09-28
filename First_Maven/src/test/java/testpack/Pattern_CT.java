package testpack;

import java.util.Scanner;

public class Pattern_CT {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int num = sc.nextInt();
		
////----------Right Triangle Star Pattern-----------
//		for (int i=0; i<num; i++) 
//		{
//			for(int j=0; j<=i; j++) {
//				{
//				System.out.print("* ");
//				}
//			} 
//			System.out.println();
//		}
		
////----------Left Triangle Star Pattern------------
//		for (int i=num-1; i>=0; i--) 
//		{
//			for(int j=0; j<num; j++) 
//			{
//				if(j>=i) {
//					System.out.print("* ");
//				}
//				else { 
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		} 
		
////---------------Pyramid Program------------------
//		for (int i=0; i<num; i++) 
//		{
//			for(int j=1; j<=num; j++) 
//			{
//				if(j>=num-i) {
//				    System.out.print("* ");
//				}else { 
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		} 
		
////------------Diamond Shape Pattern--------------
//		for (int i=0; i<2*num-1; i++) 
//		{
//			if(i<=num-1) {
//				for(int j=-(num-1); j<num; j++) 
//				{ 
//					if(j<=i && j>=-i) {
//					System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//				}
//			else {
//				int s = i;
//				i=(2*num-2)-i;
//				for(int j=-(num-1); j<num; j++) {
//					if(j<=i && j>=-i) 
//					{
//						System.out.print("*");
//					}
//					else 
//					{
//						System.out.print(" ");
//					}
//				}
//				i=s;
//				System.out.println();
//			}
//		}
		
////---------------Downward Triangle Star Pattern with forward Loop------------------
//			for (int i=0; i<num; i++) 
//			{
//				for(int j=1; j<=num; j++) 
//				{
//					if(j<=num-i) {
//				    System.out.print("* ");
//					}
//				}
//				System.out.println();
//			} 
		
////---------------Downward Triangle Star Pattern with backward Loop------------------
//			for (int i=0; i<num; i++) 
//			{
//				for(int j=num-1; j>=0; j--) 
//				{
//					if(j>=i) {
//				    System.out.print("* ");
//					}
//				}
//				System.out.println();
//			} 
		
////---------------Reversed Pyramid Star Pattern------------------
//		for (int i=0; i<num; i++) 
//		{
//			for(int j=0; j<num; j++) 
//			{
//				if(j>=i) {
//			    System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		} 
		
////---------------Right down Mirror Star Pattern------------------
//		for (int i=0; i<num; i++) 
//		{
//			for(int j=0; j<num; j++) 
//			{
//				if(j>=i) {
//			    System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		} 
		
////---------------Right Pascal’s Triangle------------------
//		for (int i=0; i<2*num-1; i++) 
//		{
//			if(i<num) {
//			for(int j=0; j<num; j++) 
//			{
//				if(j<=i) {
//			    System.out.print("* ");
//				}
//			}
//			System.out.println();
//			}
//			else {
//			int k = i;
//			i = (2*num-2)-i;
//			for(int j=0; j<num-1; j++) 
//			{
//				if(j<=i) {
//			    System.out.print("* ");
//				}
//			}
//			i = k;
//			System.out.println();
//			}
//		}
		
////---------------Left  Triangle Pascal’s------------------
//		for (int i=0; i<2*num-1; i++) 
//		{
//			if(i<num) {
//			for(int j=num-1; j>=0; j--) 
//			{
//				if(j<=i) {
//			    System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//			}
//			else {
//			int k = i;
//			i = (2*num-2)-i;
//			for(int j=num-1; j>=0; j--) 
//			{
//				if(j<=i) {
//			    System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			i = k;
//			System.out.println();
//			}
//		}
		
////---------------Sandglass Star Pattern------------------
//		for (int i=0; i<2*num-1; i++) 
//		{
//			if(i<num) {
//			for(int j=0; j<num; j++) 
//			{
//				if(j>=i) {
//			    System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			}
//			else {
//			int k = i;
//			i = (2*num-2)-i;
//			for(int j=0; j<num; j++) 
//			{
//				if(j>=i) {
//			    System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			i = k;
//			System.out.println();
//			}
//		}
		
////---------------Sandglass Numeric Pattern------------------
//			for (int i=0; i<2*num-1; i++) 
//			{
//				if(i<num) {
//				for(int j=1; j<=num; j++) 
//				{
//					if(j>=i+1) {
//				    System.out.print(j+" ");
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//				}
//				else {
//				int k = i;
//				i = (2*num-2)-i;
//				for(int j=1; j<=num; j++) 
//				{
//					if(j>=i+1) {
//				    System.out.print(j+" ");
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				i = k;
//				System.out.println();
//				}
//			}
		
////----------Simple number program-----------
//			for (int i=1; i<=num; i++) 
//			{
//				for(int j=1; j<=i; j++) {
//					{
//					System.out.print(j+" ");
//					}
//				} 
//				System.out.println();
//			}
		
////----------Simple number program-----------
//		int c=1;
//		for (int i=1; i<=num; i++) 
//		{
//			for(int j=1; j<=i; j++) {
//				{
//				System.out.print(c++ +" ");
//				}
//			} 
//			System.out.println();
//		}
		
////---------------Pyramid Number Program------------------
//		for (int i = 0; i < num; i++) {
//            int number = 1;
//            for (int j = 0; j <= i; j++) {
//            	if(j <= i) {
//				    System.out.print(number+" ");
//				    number = number * (i - j) / (j + 1);
//				}else { 
//					System.out.print("  ");
//				}
//            }
//            System.out.println();
//        }
		
////------------Number Diamond Shape Pattern--------------
//			for (int i=0; i<2*num-1; i++) 
//			{
//				if(i<=num-1) {
//					for(int j=-(num-1); j<num; j++) 
//					{ 
//						int k=j;
//						if(j<=i && j>=-i) {
//							if(j<0) {
//								j=-(j-1);
//								System.out.print(j+" ");
//								j=k;
//							}else {
//								j=j+1;
//								System.out.print(j+" ");
//								j=k;
//							}
//						
//						}else {
//							System.out.print("  ");
//						}
//					}
//					System.out.println();
//					}
//				else {
//					int s = i;
//					i=(2*num-2)-i;
//					for(int j=-(num-1); j<num; j++) {
//						int k=j;
//						if(j<=i && j>=-i) 
//						{
//							if(j<0) {
//								j=-(j-1);
//								System.out.print(j+" ");
//								j=k;
//							}else {
//								j=j+1;
//								System.out.print(j+" ");
//								j=k;
//							}
//						}
//						else 
//						{
//							System.out.print("  ");
//						}
//					}
//					i=s;
//					System.out.println();
//				}
//			}
		
////----------Right Triangle number program-----------
//			for (int i=1; i<=num; i++) 
//			{
//				for(int j=1; j<=i; j++) {
//					{
//					System.out.print(i +" ");
//					}
//				} 
//				System.out.println();
//			}
		
////----------Right Triangle number program-----------
//		for (int i=0; i<num; i++) 
//		{
//			for(int j=0; j<=i; j++) {
//				{
//					System.out.print((num-j)+" ");
//				}
//			} 
//			System.out.println();
//		}
		
////----------Right Triangle number program-----------
//		for (int i=1; i<=num; i++) 
//		{
//			for(int j=num; j>=1; j--) {
//				{
//					if(j<=i)
//					System.out.print(j+" ");
//				}
//			} 
//			System.out.println();
//		}
		
////----------"10" Right Triangle number program-----------
//		int x=0;
//		int c=1;
//		for (int i=1; i<=num; i++) 
//		{
//			
//			for(int j=1; j<=num; j++) 
//			{
//					if(c%2!=0) {
//						x=1;
//					}else if(c%2==0) {
//						x=0;
//					}
//					System.out.print(x+" ");
//					c++;
//			}
//			System.out.println();
//		} 
		
////----------"10" Simple number program-----------
//		int x=0;
//		for (int i=1; i<=num; i++) 
//		{
//			for(int j=1; j<=i; j++) {
//				{
//					if(j%2==0) {
//						x=0;
//					}else if(j%2!=0) {
//						x=1;
//					}
//				System.out.print(x+"");
//				}
//			} 
//			System.out.println();
//		}
////----------Right Alphabetic triangle -----------
//		int a = 64;
//		for (int i=1; i<=num; i++) 
//		{
//			for(int j=1; j<=i; j++) {
//				{
//				System.out.print((char)(a+j)+" ");
//				}
//			} 
//			System.out.println();
//		}
		
////----------Alphabet/ Character Pattern -----------
//		int a = 64;
//		for (int i=1; i<=num; i++) 
//		{
//			for(int j=1; j<=i; j++) {
//				{
//				System.out.print((char)(a+i)+" ");
//				}
//			} 
//			System.out.println();
//		}
//////----------K Shape Character Pattern Program---------
////		int k = 97; //--To Print small letters--
//		int k = 65; //--To Print capital letters--
//		for(int i=0; i<2*num; i++) 
//		{
//		 if(i<num) 
//		 {
//			for(int j=0; j<num-i; j++)
//				{
//					System.out.print((char)(k+j)+" ");
//				}
//				System.out.println();
//		 }
//		 else 
//		 {
//			for(int j=0; j<=i-num; j++)
//			{
//					System.out.print((char)(k+j)+" ");
//			}
//			System.out.println();
//			}
//		}
	
////----------Rhombus Shape Character Pattern Program---------
//		int k = 97+num; //--To Print small letters--
//		int k = 65+num; //--To Print capital letters--
//		for(int i=0; i<=2*num; i++) 
//		{
//		 if(i<=num) 
//		 {
//			for(int j=-num; j<=num; j++)
//				{
//				if(j>-i && j<i) {
//					System.out.print("  ");
//				}else {
//					if(j>0) {
//						System.out.print((char)(k-j)+" ");
//					}else {
//					System.out.print((char)(k+j)+" ");
//					}
//				}
//				}
//			System.out.println();
//		 }
//		 else 
//		 {   int c =i;
//			 i =(2*num+1)-(i+1);
//			for(int j=-num; j<=num; j++)
//				{
//				if(j>-i && j<i) {
//					System.out.print("  ");
//				}else {
//					if(j>0) {
//						System.out.print((char)(k-j)+" ");
//					}else {
//					System.out.print((char)(k+j)+" ");
//					}
//				}
//				}
//			System.out.println();
//			i=c;
//		 }
//		}
		
////----------K Shape Character Pattern Program---------
			for(int i=1; i<=8; i++) 
			{
				for(int j=-6; j<=6;j++)
				{
					if(j>-i && j<i)
					{
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	}
}
