package com.scams.services;

public class BlackListedService {
	public boolean isBlackListed(String registerNumber) {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (registerNumber.equals("AA123AA")) {
			return true;
		}
		return false;

	}

}
