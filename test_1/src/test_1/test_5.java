package test_1;

class FoldCount {
    public int getCount(double h)  {
           int n =0 ;
           while(h<8848.43)  {
                h *= 2;
                n++;
             }
            return n;
  }
}

public class test_5 {
	public static void main(String[] args)  {
        FoldCount obj;
        obj = new FoldCount();
        System.out.println("count = " + obj.getCount(0.00001)) ;
    }
}

