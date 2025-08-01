package org.unibl.etf.prs.postar;

public class PostarB extends Postar
{
	
	public PostarB()
	{
		super();
	}
	
	@Override
	public void run()
	{	
		while(!uhvacen)
		{
			if(uhvacen) break;
			x = x + 2.5;
			System.out.println("Poštar_B se nalazi na poziciji (" + String.format("%.2f", x) + "," + String.format("%.2f", y) + ")");
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

