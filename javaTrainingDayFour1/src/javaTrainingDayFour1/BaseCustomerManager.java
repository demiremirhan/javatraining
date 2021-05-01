package javaTrainingDayFour1;

import javaTrainingDayFour1.Abstract.CustomerService;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("database saved" + customer.getFirstName() + "  " + customer.getLastName() +" "+ customer.getNationalityId());
		
	}

}
