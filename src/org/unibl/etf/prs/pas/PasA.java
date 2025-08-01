package org.unibl.etf.prs.pas;

import org.unibl.etf.prs.postar.Postar;

public class PasA extends Pas
{	
	public PasA(Postar postar)
	{
		super(postar);
	}
	
	@Override
	public void run()
	{
		while(!postar.uhvacen)
		{
			if(t >= 0 && t < 5)
			{
				s = 2 * t;
			}
			else 
			{
				s = 10;
			}
			azurirajPsa(s);
			
			if((postar.x - x) < 0)
			{
				double vrijednost = postar.x - x;
				x = x + vrijednost;
				
				if(Math.abs(y - postar.y) >= 1)
					y = y - (int)y;
			}
			System.out.println("Pas_A se nalazi na poziciji (" + String.format("%.2f", x) + "," + String.format("%.2f", y) + ")" + " - kreće se brzinom " + String.format("%.2f", s) + "m/s");

	        if (Math.abs(x - postar.x) < 1 && Math.abs(y - postar.y) < 1)
	        {
	            postar.uhvacen = true;
	            System.out.println("Pas_A je uhvatio poštara!");
	        }
			
			
			try 
			{
				Thread.sleep(1000);
				t = t + 1;
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
		
		System.out.println("Pas je ugrizao poštara nakon " + t + " sekundi.");
	}
}
