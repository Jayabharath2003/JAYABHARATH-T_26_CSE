import java.util.Scanner;
public class fibo{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=0,n2=1,temp;
System.out.print(n1+","+n2);
for(int i=3;i<=n;i++){
temp=n1+n2;
n1=n2;
n2=temp;
System.out.print(","+temp);
}

}

}