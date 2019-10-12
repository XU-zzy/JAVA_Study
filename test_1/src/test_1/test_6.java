package test_1;
import java.util.Scanner;

public class test_6 {
	public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String[] name = new String[n];
        char[][] str_ch = new char[n][];
        for(int i=0;i<n;i++)
        {
        	name[i] = cin.next();
        	str_ch[i] = name[i].toCharArray();
        }
        for(int i=0;i<n-1;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		int k=0;
        		while(str_ch[i][k]==str_ch[j][k])
        			k++;
        		if(str_ch[i][k]>str_ch[j][k])
	        	{
	        		char[] temp = str_ch[i];
	        		str_ch[i] = str_ch[j];
	        		str_ch[j] = temp;
	        	}
        	}
        }
        for(int i=0;i<n;i++)
        	System.out.println(str_ch[i]);
        cin.close();
    }
}