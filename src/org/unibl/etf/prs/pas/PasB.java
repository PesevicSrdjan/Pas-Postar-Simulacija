package org.unibl.etf.prs.pas;

import org.unibl.etf.prs.postar.Postar;

public class PasB extends Pas
{
	public int t_run;
	
	public PasB(Postar postar)
	{
		super(postar);
	}
	
	@Override
	public void run()
	{
		while(!postar.uhvacen)
		{
			if(slip(t_run))
			{
				t_run = 0;
				System.out.println("Pas_B se okliznuo i pao...");
				s = 0;
			}
			else 
			{
				if(t_run >= 0 && t_run < 4)
				{
					s = 3 * t_run;
				}
				else 
				{
					s = 12;
				}
				azurirajPsa(s);
				if((postar.x - x) < 0)
				{
					double vrijednost = postar.x - x;
					x = x + vrijednost;
					
					if(Math.abs(y - postar.y) >= 1)
						y = y - (int)y;				
				}
				
				
				System.out.println("Pas_B se nalazi na poziciji (" + String.format("%.2f", x) + "," + String.format("%.2f", y) + ")" + " - kreće se brzinom " + s + "m/s");
				t_run++;	
			}
			
			
	        if (Math.abs(x - postar.x) < 1 && Math.abs(y - postar.y) < 1)	
	        {
	            postar.uhvacen = true;
		        System.out.println("Pas_B je uhvatio poštara!");
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
	
	public boolean slip(int t_run) 
	{
	    double p = 0.05 * t_run;
	    p = Math.min(p, 0.5);
	    return Math.random() < p;
	}
	
}
