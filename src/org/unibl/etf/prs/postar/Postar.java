package org.unibl.etf.prs.postar;

import java.util.Random;
public class Postar extends Thread 
{
	public double x; // x - koordinata.
	public double y = 0; // y - koordinata.
	public int t = 0; // t - vrijeme.
	public volatile boolean uhvacen = false; //Boolean vrijednost da li je poštar uhvaćen - za kraj simulacije.
	private Random random = new Random();
	
	public Postar()
	{
		x = random.nextDouble(16) + 5; // Početna pozicija poštara.
	}
	
}
