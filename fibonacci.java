import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,c=0;
		System.out.print("Enter how many terms : ");
		int n = sc.nextInt();
		if(n==1){
		    System.out.print("1st term => "+a);
		}
		else if(n==2){
		    System.out.print("2nd term => "+b);
		}
		else{
		    for(int i=2;i<n;i++){
		    c=a+b;
		    a=b;
		    b=c;
		}
		System.out.print(n+"th term => "+c);
		}
		sc.close();
	}
}
