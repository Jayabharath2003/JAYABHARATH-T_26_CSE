import java.lang.Math;
public class Random{
public static void main(String args[]) {
int max=20,min=1;
int random=(int)(Math.random()*(max-min+1)+min);
System.out.print(random);
}

}