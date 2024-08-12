import java.util.Scanner;
public class Amstrong{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int n=number;
int sum=0,last;
while(n!=0){
last=n%10;
sum=sum+(last*last*last);
n=n/10;
}
if(number==sum)
System.out.print("Amstrong Number");
else
System.out.print("Not Amstrong Number");
}

}