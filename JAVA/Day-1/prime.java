import java.util.Scanner;
public class prime{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<=0)
{
System.out.print("Not Prime");
}
	if(n%2==0){
		System.out.print("Prime");
		}
	else{
	     System.out.print("Not Prime");
     }
  }
}