import java.io.*;
import java.util.*;
import java.math.*;

public class hckrnk1 {

    static int getMagicNumber(String s, int k, int b, int m){
        int l=s.length();
        String s1="";
        int c=0;
        String arr[]=new String[20];
        for(int i=0;i<l-2;i++)
            {
            s1=s.substring(i,i+3);
            System.out.println(s1);
            arr[c++]=s1;
		}
        int i=0,c1=0,conv;
        double sum=0.0,res=0.0;
        while(arr[i]!=null)
        {
		   conv=Integer.parseInt(arr[i]);
			while(conv>0)
			{
             double m1=Math.pow(b,c1);
             c1++;
             int dig=conv%10;
             sum=sum+(m1*dig);
             conv=conv/10;
            }
            res=res+(sum%m);
            i++;
            c1=0;
            sum=0.0;
          }
          int result=(int)res;
          return result;
    }
    public static void main(String[] args)throws Exception {
        DataInputStream z=new DataInputStream(System.in);
        String s = z.readLine();
        int k = Integer.parseInt(z.readLine());
        int b = Integer.parseInt(z.readLine());
        int m = Integer.parseInt(z.readLine());
        int result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }
}
