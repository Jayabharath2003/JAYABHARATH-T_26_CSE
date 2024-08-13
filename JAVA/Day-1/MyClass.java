import java.util.Scanner;
public class MyClass {
public static void main(String args[]) {
int sum=0;
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
sum=sum+arr[i];
}
System.out.print(sum);
}

}