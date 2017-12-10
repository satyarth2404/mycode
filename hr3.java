import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        DataInputStream z=new DataInputStream(System.in);
        int k,k1,sum=0,sum1=0;
        k=Integer.parseInt(z.readLine());
        if(k>=0 && k<((int)Math.pow(10,1000))){
        for(int i=1;i<=k;i++)
            {
            k1=i;
            while(k1>0)
                {
                int m=k1%10;
                sum=sum+(m*m);
                k1=k1/10;  
            }
            int sqr=(int)Math.sqrt(sum);
            if(sqr*sqr==sum)
            {
                sum1=sum1+i;
            }
            sum=0;
        }
        System.out.println(sum1);
    }
}
}

        
        
        
