import java.io.*;
import java.util.*;
class latexdsa
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in );
		protected String s;
		System.out.println("Enter the paragraph");
		s=z.readLine();
                protected int p=0;
		StringTokenizer s1=new StringTokenizer(s);
		protected int l=s1.countTokens();
        protected String arr[]=new String[l];
        protected String arr1[]=new String[100];
	protected String s2,s3;
		for(int i=1;i<=l;i++)
		{
			s2=s1.nextToken();
			arr[p++]=s2;		
        }
        protected int len;
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
 private class Node extends latexdsa{
 private String data;
 public Node(String data)
 {
  this.data=data;
 }
 public Node head=null;
 private Node flink;
 private Node blink;
 public Node mid;
 public void main()
 {
 for(int i=0;i<l;i++)
{
 Node nnode=new Node(arr[i]);
 for(int j=i+1;j<p;j++)
 {
  if(arr[i].length==arr[j].length())
 if(head=null){
 head=nnode;
 head.flink=null;
}
else
{
 Node last=head;
 while(last.flink!=null)
 {
   mid=last;
   last=last.flink;
   last.blink=mid;
			}
			mid = last;
			last.flink=nnode;
			last=last.flink;

			last.blink=mid;
			 
			}
 String arr[]=list.toArray();
  }
 }
}
}
}

               		
