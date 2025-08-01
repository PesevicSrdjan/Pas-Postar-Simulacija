package org.unibl.etf.prs.pas;

import org.unibl.etf.prs.postar.Postar;

public class Pas extends Thread
{
	public double x,y; // koordinate Psa.
	public double t; // Vrijeme u sekundama.
	public double s; // Brzina Psa.
	public Postar postar; // Poštar koji je prosljeđen.
	
	public Pas(Postar postar)
	{
		x = 0; // x - koordinata na početku = 0.
		y = 20; // y - koordinata na početku.
		t = 0;
		s = 0; // s(0) = 0
		this.postar = postar;
	}
	
	public void azurirajPsa(double brzina)
	{
		// Vektor razlike.
		double dx = postar.x - x;
		double dy = postar.y - y;
		
		// Pitagorina teorema.
		double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
		// Normalizacija vektora.
		double ux = dx / d;
		double uy  = dy / d;
		
		// Ažuriranje kooridinata.
		x = x + ux * brzina;
		y = y + uy * brzina;

	}
}
