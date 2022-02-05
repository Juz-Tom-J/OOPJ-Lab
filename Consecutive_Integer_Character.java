package JavaPack;

class I extends Thread
{ 
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class A extends Thread
{
	public void run() 
	{
		for(char i='a';i<='e';i++)
		{
			try
			{
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class javapack_consecutive_int_char {

	public static void main(String[] args) {
		I num = new I();
		A alp = new A();
		
		try {
			 num.start();
			 alp.start();
			 num.join();
			 alp.join();
		}
		catch(Exception e)
		{System.out.println(e);
		
		}

	}

}
