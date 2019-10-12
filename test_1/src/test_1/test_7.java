import java.util.Scanner;
public class test_7{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] a = new int[n];
      int x=0;
      for(int i=0;i<n;i++){
        a[i]=input.nextInt();
      }
      for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
          if(a[j]>a[j-1]){
            x=a[j];
            a[j]=a[j-1];
            a[j-1]=x;
          }
        }
      }
      for(int i=0;i<n;i++){
        System.out.print(a[i]);
        if(i!=n-1){
          System.out.print(" ");
        }
      }
  }
}