package javaTrainingDayFour1;

import javaTrainingDayFour1.Abstract.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	public boolean validateTckno(Long nationalityId) {
        String TCNo = String.valueOf(nationalityId);

        if (TCNo.length() != 11)
            return false;

      
        int sum1 =
            Character.getNumericValue(TCNo.charAt(0)) + Character.getNumericValue(TCNo.charAt(2)) +
            Character.getNumericValue(TCNo.charAt(4)) + Character.getNumericValue(TCNo.charAt(6)) +
            Character.getNumericValue(TCNo.charAt(8));
       
        int sum2 =
            Character.getNumericValue(TCNo.charAt(1)) + Character.getNumericValue(TCNo.charAt(3)) +
            Character.getNumericValue(TCNo.charAt(5)) + Character.getNumericValue(TCNo.charAt(7));

     
        int tenthDigit = ((sum1 * 7) - sum2) % 10;
        if (tenthDigit != Character.getNumericValue(TCNo.charAt(9)))
            return false;

    
        int sum = sum1 + sum2 + Character.getNumericValue(TCNo.charAt(9));
        if ((sum % 10) != Character.getNumericValue(TCNo.charAt(10)))
            return false;

        return true;

    }

}
