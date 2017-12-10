import java.io.*;
import java.util.*;
class latex
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in );
		String s;
		System.out.println("Enter the paragraph");
		s=z.readLine();
                int p=0;
		StringTokenizer s1=new StringTokenizer(s);
		int l=s1.countTokens();
        String arr[]=new String[l];
        String arr1[]=new String[100];
		String s2,s3;
		for(int i=1;i<=l;i++)
		{
			s2=s1.nextToken();
			arr[p++]=s2;		
        }
        int len;
        for(int i=0;i<p;i++)
        {
			len=arr[i].length();
			arr1[len]=arr[i];
			System.out.print(len+":"+arr[i]+" ");
			for(int j=i+1;j<p;j++)
			{
				int len1=arr[j].length();
				if(len==len1)
				{
			         System.out.print(arr[j]+" ");         
				}
			}
                        System.out.println();
		}
}
}

               		
