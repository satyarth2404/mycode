import java.io.*;
class binnext
{
	static String binconvert(int n)
	{
		String y="";
		int a;
		while(n>0){
                a=n%2;
                y=a+""+y;
                n=n/2;
            }
			return y;
	}
	static int decimalconvert(String x)
	{
		int dec=Integer.parseInt(x,2);
		return dec;
	}
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		int N,test=0,index=0;
		N=Integer.parseInt(z.readLine());
		int X[]=new int[N];
		for(int i=0;i<N;i++)
			X[i]=Integer.parseInt(z.readLine());
		for(int i=0;i<N;i++)
		{
			int x=X[i];
			while(test==0) {
				String bin=binconvert(x);
				for(int j=0;j<(bin.length())-1;j++)
				{
					index=bin.indexOf("11");
				}
					if(index==-1)
					{ 
				     int ans=decimalconvert(bin);
					 System.out.println(ans);
					 break;
					}
					else
					{
						x=x+1;
						continue;
					}
			}
		}
	}
}
