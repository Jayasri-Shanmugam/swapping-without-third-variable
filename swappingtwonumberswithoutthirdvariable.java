package Jayasrijavapractice;
import java.util.Scanner;
public class swappingtwonumberswithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int number1=sc.nextInt();
         int number2=sc.nextInt();
         number1=number1+number2;
         number2=number1-number2;
         number1=number1-number2;
         System.out.println("After Swapping");
         System.out.println(number1);
         System.out.println(number2);
	}

}
