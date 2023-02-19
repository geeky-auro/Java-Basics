//Problem 3: Write a Java program to print the corresponding week day for the given day no. //of the current month using switch..case statement.
import java.util.Scanner;
public class question3{
public static void main(String args[]){
System.out.println("Enter Day No. form 1 to 7..");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<=31 && a!=0)
switch(a%7){
case 1:{
System.out.println("Sunday");
break;
}
case 2:{
System.out.println("Monday");
break;
}
case 3:{
System.out.println("Tuesday");
break;
}
case 4:{
System.out.println("Wednesday");
break;
}
case 5:{
System.out.println("Thursday");
break;
}
case 6:{
System.out.println("Friday");
break;
}
case 7:{
System.out.println("Saturday");
break;
}
default:{
System.out.println("Wrong Date No. Entered");
}
}
System.out.println("Thank You");
}
}