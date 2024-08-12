import java.util.Scanner;
public class Numpalindrome{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int n=number;
int temp=0;
while(n!=0){
int last=n%10;
temp=temp*10+last;
 n=n/10;
}
if(temp==number){
System.out.print("Palindrome");
}
else{
System.out.print("Not Palindrome");

}

}

}