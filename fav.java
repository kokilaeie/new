import java.util.Scanner;


public class fav {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		if(t>=1&&t<=10)
		{
		for(int i=0;i<t;i++)
		{
                   try
                         {
			int n=s.nextInt();
			int a[]=new int[n];
			int c=0;
			for(int j=0;j<n;j++)
			{
				a[j]=s.nextInt();
			}
			int fn=s.nextInt();
			int b[]=new int[fn];
			for(int j=0;j<fn;j++)
			{
				b[j]=s.nextInt();
			}
			for(int j=0;j<fn;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(b[j]==a[k])
					{
						c++;
					}
				}	
			}
			
			if(c==b.length)
			{
				System.out.println("yes");
			}else
			{
				System.out.println("no");
			}
                         }
                      catch(Exception e)
                       {
                     System.out.println("Exception thrown");
                     break;
                     }
 
		}
		}else
			System.out.println("Enter correct testcase");

	}

}
