import java.io.*;
import java.util.*;
class garage
{
	static int top_r=-1,rear_g=-1,front_g=0;
	static String truck_name[]=new String[20];
	static String cgrg[]=new String[20];
	public static void main(String ar[])throws Exception
	{
		DataInputStream z=new DataInputStream(System.in);
		int ch,ti,n;
		String c;
		do
		{
			System.out.println("Enter your choice 1.Line up the trucks on the road 2.Enter into Garage 3.Exit from garage 4.Show Trucks");
			ch=Integer.parseInt(z.readLine());
			switch(ch)
			{
				case 1:
					on_road();
					break;
				case 2:
					System.out.println("Enter the number of vehicles you want to enter into the garage");
					n=Integer.parseInt(z.readLine()); 
                                        for(int i=1;i<=n;i++)
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
		 if(front==(rear+1)%20)
			System.out.println("Garage is full");
		else
		   {
			rear_g=(rear_g+1)%20;
			grg[rear_g]=ti;
			truck_name[top_r]=0;
			top_r--;
		   }
         }
         public static void exit_garage(String ti)
         {
		  if(grg[front_g]==ti)                         
			  truck_id[++top_r]=grg[front_g];
		  else if(front_g==rear_g)
		   front_g=rear_g=-1;
		  else if(front_g==-1)
			System.out.println("The truck can't be moved as it is not on exit gate");
		  else
		   front=(front+1)%20; 
		 }
		  public static void show_trucks()
		  {
			  System.out.println("The trucks on road are :");
			  for(int i=0;i<=top_r;i++)
			  System.out.println(truck_id[i]);
			  System.out.println("The trucks inside the garage are: ");
			  for(int i=front;i<=rear_g;i=(i+1)%20)
			  System.out.println(grg[i]);
			}
		}
            
