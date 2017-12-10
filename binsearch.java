import java.io.*;
class binsearch
{
 public static void main(String ar[])throws Exception             
 {
  DataInputStream z=new DataInputStream(System.in);
  System.out.println("Enter the size of array");
  int n,key;
  n=Integer.parseInt(z.readLine());
  int array[]=new int[n];
  System.out.println("Enter the elements of array:");
  for(int i=0;i<n;i++)
  {
   array[i]=Integer.parseInt(z.readLine());
  }     
  System.out.print("Enter the number to be searched:");
  key=Integer.parseInt(z.readLine());
  binary_search(array,0,n-1,key);
  }
  public static void binary_search(int array[],int lb,int ub,int key)
  {
   int pos;
   int c=1;
   pos=(lb+ub)/2;
   while((array[pos]!=key) && (lb<ub))
   {
    c++;
    if(array[pos]>key)
    {
     ub=pos-1;
    }
    else
    {
     lb=pos+1;
    }
    pos=(lb+ub)/2;
   }
   if(lb<ub)
   {
    System.out.println("SEARCH SUCCESSFUL");
    System.out.println("Position of searched number in array="+pos);
   }
   else
   {
    System.out.println("SEARCH UNSUCCESSFUL");
   }
  }
  }
