package org.company;

import org.client.Client;

public class Company extends Client {

	public void companyName()
	{
		System.out.println("Company name is 'Automation Inc.'");
	}

	public static void main(String[] args) {

		Company company = new Company();
		company.companyName();
		company.clientName();
		/*
		 * Client client = new Client(); client.clientName();
		 */

	}

}
