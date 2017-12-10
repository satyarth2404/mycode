import java.io.*;
class arrange
{
 public static void main(String ar[])throws Exception
 {
  DataInputStream z=new DataInputStream(System.in);
  int l,t=0;
  System.out.print("Give the number of integers: ");
  l=Integer.parseInt(z.readLine());
  System.out.println();
  int a[]=new int[l];
  for(int i=0;i<l;i++)
  {
   System.out.print("Give integer "+(i+1)+":");
   a[i]=Integer.parseInt(z.readLine());
  }
   for(int i=0;i<=l-2;i++)
   {
    for(int j=0;j<=l-2;j++)
    {
     if(a[j]<a[j+1])
     {
      t=a[j];
      a[j]=a[j+1];
      a[j+1]=t;
     }
    }
   }
   int b[]=new int[l];
   if((l%2)!=0)
   {
    for(int i=0;i<l/2;i++)
    {
     if((i%2)==0)
     b[(l/2)-i]=a[i];
     else
     b[(l/2)+i]=a[i];
   }
  }
  else
  {
   for(int i=1;i<=l;i++)
   {
    if((i%2)!=0)
     b[(l/2)-i]=a[i-1];
     else
     b[(l/2)+i]=a[i-1];
   }
  }
   System.out.print("REARRANGED ARRAY =");
   for(int i=0;i<l;i++)
   {
    System.out.println(b[i]+"\t");
   }
   }
  }

