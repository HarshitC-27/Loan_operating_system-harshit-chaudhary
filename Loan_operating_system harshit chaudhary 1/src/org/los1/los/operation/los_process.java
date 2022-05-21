package org.los1.los.operation;
import org.los1.los.customer.Customer;//importing the data members and member functions of class Customer
import org.los1.los.util.constant_loan;//importing the utility (interface) constant_loan
public class los_process
{
    public void inputs(Customer cstmr)//to print all the inputs
    {
        System.out.println("Name                :"
		+cstmr.get_information_customer().enterfirst_name()+
		" "+cstmr.get_information_customer().enterlast_name());

        System.out.println("You Applied For    :"+cstmr.get_loan_info().getloanType());
        System.out.println("Duration            :"+cstmr.get_loan_info().enter_years()+" years "+" and "+cstmr.get_loan_info().enter_months()+" months ");
        System.out.println("Amount              :"+cstmr.get_loan_info().enter_amount());
        System.out.println("The Pan Details are");
		
        System.out.println(cstmr.get_information_customer().enter_pan_number()); 
        System.out.println("the aadhar Details are");
        
        System.out.println(cstmr.get_information_customer().enter_aadhar());
        System.out.println("the Income is");
		
        System.out.println(cstmr.get_information_customer().enter_income());
        System.out.println("the Phone no is");
		
        System.out.println(cstmr.get_information_customer().enter_phone());
		System.out.println("the Email is");
		
        System.out.println(cstmr.get_information_customer().enter_email());
        //crucial step- using the interface constant_loan to find the rate of interest
        double principle=cstmr.get_loan_info().enter_amount();
        if(cstmr.get_loan_info().getloanType().equalsIgnoreCase(constant_loan.personal_loan)) 
        {
			cstmr.get_loan_info().put_rate(constant_loan.personal_loan_r);
		}
        if((cstmr.get_loan_info()).getloanType().equalsIgnoreCase(constant_loan.home_loan)) 
        {
			cstmr.get_loan_info().put_rate(constant_loan.home_loan_r);
		}
        if((cstmr.get_loan_info()).getloanType().equalsIgnoreCase(constant_loan.car_loan)) 
        {
			cstmr.get_loan_info().put_rate(constant_loan.car_loan_r);
		}
        if((cstmr.get_loan_info()).getloanType().equalsIgnoreCase(constant_loan.edu_loan)) 
        {
			cstmr.get_loan_info().put_rate(constant_loan.edu_loan_r);
		}
        if((cstmr.get_loan_info()).getloanType().equalsIgnoreCase(constant_loan.gold_loan)) 
        {
			cstmr.get_loan_info().put_rate(constant_loan.gold_loan_r);
		}
        double rate=cstmr.get_loan_info().get_rate();
        double time=cstmr.get_loan_info().enter_years()+12*(cstmr.get_loan_info().enter_months());
        double interest=principle*rate*time/100.0;//formula for iterest
        System.out.println("Your total interst is"+interest);
        System.out.println("Your EMI is"+(interest*1.0)/time);
    }
}