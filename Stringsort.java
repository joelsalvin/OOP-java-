import java.util.Scanner;
class Stringsort
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i,j;
		String t;
		System.out.print("Enter the number of strings:");
		n=s.nextInt();
		String a[]=new String[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					t=a[i];
				    a[i]=a[j];
				    a[j]=t;
		        }
			}
		}
		System.out.println("Sorted String");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}