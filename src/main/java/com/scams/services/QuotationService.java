package com.scams.services;

import com.scams.modeles.Vehicule;

// un exemple de service
public class QuotationService {
	public int getQuotation(Vehicule vehicule) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 35000;
	}

	

}
