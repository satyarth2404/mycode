import java.io.*;
import java.util.*;
class days
{
    public static void main(String [] args)throws Exception 
    {
		
        DataInputStream z=new DataInputStream(System.in);
        String date1=z.readLine();
		String date2=z.readLine();
        StringTokenizer st=new StringTokenizer(date1,"/");
        int first[]=new int[3];
        int second[]=new int[3];
        int i=0,j=0;
        while(st.hasMoreTokens())
        {
            first[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        if((first[0]<0 || first[0]>31) || (first[1]<0 || first[1]>12))
            System.exit(0);
        StringTokenizer st1=new StringTokenizer(date2,"/");
        while(st1.hasMoreTokens())
        {
            second[j]=Integer.parseInt(st1.nextToken());
            j++;
        }
		Calendar c1=Calendar.getInstance();
        c1.set(first[2],first[1], first[0] );
        Calendar c2=Calendar.getInstance();
        c2.set(second[2],second[1],second[0]);
 
        Date d1=c1.getTime();
        Date d2=c2.getTime();
 
        long diff=d2.getTime()-d1.getTime();
        int noofdays=(int)(diff/(1000*24*60*60));
        System.out.println(noofdays);
    }
}