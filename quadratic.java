
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		double a,b,c,d, root1, root2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		d = b*b - (4*a*c);
		if(d>0){
		    root1 = (-b + Math.sqrt(d)) / (2*a);
		    root2 = (-b - Math.sqrt(d)) / (2*a);
		    System.out.print("Both are different : "+Math.round(root1)+" and "+Math.round(root2));
		}
		else if(d==0){
		    root1 = -b / (2*a);
		    System.out.print("Equal roots : "+Math.round(root1)+" and "+Math.round(root1));
		}
		else{
		    System.out.print("no roots exist.....");
		}
	}
}
