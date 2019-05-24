import java.io.*;

class UpadteDetails
{
	//float rate;
	private float bal;
	UpadteDetails(float blnc)
	{
		bal=blnc;
	}
	
	void Pass(float rate) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Password For Update Balance :-");
		String pass = (br.readLine());
		if(pass.equals("123"))
		{
			InnerClass iobj = new InnerClass(rate);
			iobj.UpdateBal();
			iobj.display();
		}
		else
			System.out.println("Sorry!...You Are Not Valid User");
	}
	
	
	
	private class InnerClass
	{
		float rate;
		InnerClass(float rate)
		{
			this.rate = rate;
		}
		
		void UpdateBal()
		{
			float inter = bal * rate / 100;
			bal = bal + inter;
		}
		void display()
		{
			System.out.println("Updated Balance is :-"+bal);
		}
	}

}


public class InnerDemo
{
	public static void main(String ar[]) throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Interest rate  :-");
		float rate = Float.parseFloat(br.readLine());
		
		UpadteDetails uobj = new UpadteDetails(10000);
		//InnerClass i = 
		uobj.Pass(rate);
	}
}