package org.unibl.etf.prs.simulacija;

import org.unibl.etf.prs.pas.PasA;
import org.unibl.etf.prs.pas.PasB;
import org.unibl.etf.prs.postar.PostarA;
import org.unibl.etf.prs.postar.PostarB;

public class Simulacija {

	public static void main(String[] args) 
	{
		PostarA postarA = new PostarA();
		PostarB postarB = new PostarB();
		
		// (4) Moguće kombinacije:
		//PasA pasA = new PasA(postarA); postarA.start(); pasA.start(); // 1.
		// PasA pasA = new PasA(postarB); postarB.start(); pasA.start(); // 2.
		// PasB pasB = new PasB(postarA); postarA.start(); pasB.start(); // 3.
		PasB pasB = new PasB(postarB); postarB.start(); pasB.start(); // 4.
	}

}
