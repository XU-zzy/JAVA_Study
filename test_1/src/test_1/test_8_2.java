package test_1;
import java.util.Scanner;

public class test_8_2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] a = new int[30];
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		int flag=1;
		for(int i=0;i<n;i++){
				if(a[i]==m){
					System.out.println(i);
					flag=0;
				}
		}
	if(flag==1)
			System.out.println("Not Found");
	}
}