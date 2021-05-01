package javaTrainingDayFour1;

import java.text.DateFormat;

public class Main {

	public static void main(String[] args) {
		//BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
		//baseCustomerManager.add(new Customer();
		SbCustomerManager customerManager = new SbCustomerManager(new CustomerCheckManager());
		customerManager.add(new Customer(1, "emirhan", "demir",DateFormat.getDateInstance(), 	78117612362l));
	}

}
