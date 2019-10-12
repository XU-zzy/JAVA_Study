package test_1;
import java.util.Scanner;

public class text_8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[2];
		int[] arr = new int [20];
		num[0] = input.nextInt();
		num[1] = input.nextInt();
		int n = 0;
		while((arr[n] = input.nextInt()) != '\n') {
			n++;
		}
		
		int i,flag = 0;
		for(i = 0;i < n;i++) {
			if(arr[i] == num[0] && arr[i+1] == num[1]) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println(i);
		}else {
			System.out.println("Not Found");
		}
	}
}
