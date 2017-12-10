import java.io.*;
import java.util.*;
class cgarage
{
	static int top_r=-1,rear_g=0,front_g=-1,temp=0,k;
	static String truck_name[]=new String[20];
	static String cgrg[]=new String[20];
	static String tempstr[]=new String[20];
	static int count[]=new int[20];
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		int ch,n;
		String c,ti;
		do
		{
			System.out.println("Enter your choice 1.Line up the trucks on the road 2.Enter into Garage 3.Exit from garage 4.Show Trucks 5.Priority");
			ch=Integer.parseInt(z.readLine());
			switch(ch)
			{
				case 1:
					on_road();
					break;
				case 2:
					System.out.println("Enter the number of vehicles you want to enter into the garage");
					n=Integer.parseInt(z.readLine());
					temp=n; 
                                        for(k=1;k<=n+1;k++)
					enter_garage(truck_name[top_r]);
					break;
				case 3:
					System.out.println("Enter the truck name that you want to exit from the garage");
					ti=z.readLine();
					exit_garage(ti);
					break;
				case 4:
					show_trucks();
					break;
				case 5:
					priority();
					break;
			 }
			 System.out.println("Do you want to continue? (Y/N)");
			 c=z.readLine();
			} 
			while(c.equalsIgnoreCase("Y"));
		}
		public static void on_road()throws Exception
		{
			DataInputStream z=new DataInputStream(System.in);
			int n;
			System.out.println("Enter the number of vehicles you want to lineup");
			n=Integer.parseInt(z.readLine());
			System.out.println("Enter the truck id of the vehicles you want to lineup");
			for(int i=0;i<n;i++)
			{
				truck_name[i]=z.readLine();
				top_r++;
			}
		}
		public static void enter_garage(String ti)
		{
                if(front_g==(rear_g+1)%20)
			System.out.println("Garage is full");
		else if(front_g==-1)
   			front_g=rear_g=0;
		else	
                        rear_g=(rear_g+1)%20;
			cgrg[rear_g]=ti;
			if(k!=(temp+1))
			{
                        truck_name[top_r]="0";
			top_r--;
                        }
         }
         public static void exit_garage(String ti)
         {
		  if(cgrg[front_g]==ti)                         
			  truck_name[++top_r]=cgrg[front_g];
		  else if(front_g==rear_g)
		   front_g=rear_g=-1;
		  else if(front_g==-1)
			System.out.println("The truck can't be moved as it is not on exit gate");
		  else
		     truck_name[++top_r]=cgrg[front_g];
                     front_g=(front_g+1)%20; 
		 }
		  public static void show_trucks()
		  {
			  System.out.println("The trucks on road are :");
			  for(int i=0;i<=top_r;i++)
			  System.out.println(truck_name[i]);
			  System.out.println("The trucks inside the garage are: ");
			  int i=front_g;
			  while(i!=rear_g)
			  {
			   System.out.println(cgrg[i]);
 			   i=(i+1)%20;
			  }
			}
			public static void priority()throws Exception
			{
				DataInputStream z=new DataInputStream(System.in);
				System.out.println("Enter the no. of days a truck has to be retained in the garage");
				int i=front_g,j=0,t;
				String t1; 
				while(i!=rear_g)
				{
					System.out.println("No of days "+cgrg[i]+" has to be retained");
					tempstr[j]=cgrg[i]; //moving the trucks in a temporary buffer in order to sort them according to their priority
					count[j]=Integer.parseInt(z.readLine());
					j++;
					i=(i+1)%20;
				}
				for(int x=0;x<j-1;x++) //sorting the trucks according to their priority
				{
				      	for(int y=0;y<(j-x-1);y++) 
					{
						if(count[y]>count[y+1])
						{
							t=count[y];
							count[y]=count[y+1]; 
							count[y+1]=t;
				            		t1=tempstr[y];
				            		tempstr[y]=tempstr[y+1]; 
				            		tempstr[y+1]=t1;
				           }
				         }
				        }  
				 System.out.println("Order of trucks in the garage according to their priority");
				 for(int x=0;x<j;x++)
				 System.out.println(tempstr[x]);
			         for(int x=0;x<j;x++)
				 cgrg[x]=tempstr[x];	 //redirecting the trucks into the garage depending on their priority
                          }		

		}
            
