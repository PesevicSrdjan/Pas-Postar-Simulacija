package org.unibl.etf.prs.postar;

public class PostarA extends Postar 
{
	
	public PostarA()
	{
		super();
	}
	@Override
	public void run()
	{
		try 
		{
			System.out.println("Poštar_A veže pertle na poziciji (" + String.format("%.2f", x) + "," + y + ")");
			Thread.sleep(3000);
			t = t + 3;
		} 
		catch (InterruptedException ie) 
		{
			ie.printStackTrace();
		}
		
		while(!uhvacen)
		{
			if(uhvacen) break;
			x = x + 5;
			System.out.println("Poštar_A se nalazi na poziciji (" + String.format("%.2f", x) + "," + y + ")");
			t++;
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
		
	}

}
