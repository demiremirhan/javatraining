package javaTrainingDayFour1;

import java.util.function.LongToIntFunction;

import javaTrainingDayFour1.Abstract.CustomerCheckService;

public class SbCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	
	public SbCustomerManager(CustomerCheckService checkService) {
		this.customerCheckService = checkService;
	}


	public void add(Customer customer) {
		
		CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		if(customerCheckManager.validateTckno(customer.getNationalityId())) {
			System.out.println("kaydedildi  : " + customer.getFirstName());
		}else {
			System.out.println("error");
		}
	}
}
