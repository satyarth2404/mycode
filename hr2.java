import java.io.*;
import java.util.*;
import java.math.*;

public class hr2 {

    public static void main(String[] args)throws Exception
    {
        DataInputStream z=new DataInputStream(System.in);
        int n,range,check=0,res=0,sum=0,enter=0;
        n=Integer.parseInt(z.readLine());
        String s,s1;
        int m=(int)(Math.pow(10,n-1));
        range=(int)(Math.pow(10,n));
        for(int i=m;i<range;i++)
            {
            s=Integer.toString(i);
            for(int j=1;j<s.length()-2;j++)
            {
             s1=s.substring(i,i+3);
             int dig=Integer.parseInt(s1);
             if(dig%10!=0)
             {
             enter=1;
             while(dig>0)
             {
				 int rem=dig%10;
				 sum=sum+dig;
				 dig=dig/10;
				}
				if(sum>9)
				check=1;
				sum=0;
			}
		}
			if(check==0 && enter==1)
			res++;
			check=0;
		}
        System.out.println(res);
	}
}
