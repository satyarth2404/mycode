import java.io.*;
import java.util.*;
class croad
{
	static int front=0,rear=-1,top_g=-1;
	static String croad[]=new String[20];
	static String grg[]=new String[20];
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
					enter_garage(croad[front]);
					break;
				case 3:
					System.out.println("Enter the name of the truck you want to exit");
					ti=Integer.parseInt(z.readLine());
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
			System.out.println("Enter the name of the trucks you want to lineup");
			for(int i=0;i<n;i++)
			{
			 if(front==(rear+1)%20)
				{
				 System.out.println("No space on the road");
				 break;
			 }
			else
				{
					rear=(rear+1)%size;
					croad[rear]=z.readLine();
				}
			}
		}
		public static void enter_garage(int ti)
		{
		 grg[++top_g]=croad[top_r];
         croad[rear_r]=0;
         top_r--;
         }
         public static void exit_garage(int ti)
         {
		  if(grg[top_g]==ti)
		  {
			  grg[top_g]=0;
			  top_g--; 
		   }
		   else
		   System.out.println ("Truck "+ti+" cannot be moved");
		  }
		  public static void show_trucks()
		  {
			  System.out.println("The trucks on road are :");
			  for(int i=front;i<=q.rear;i=(i+1)%20)
			  System.out.println(croad[i]);
			  System.out.println("The trucks inside the garage are: ");
			  for(int i=0;i<=top_g;i++)
			  System.out.println(grg[i]);
			}
		}
            
