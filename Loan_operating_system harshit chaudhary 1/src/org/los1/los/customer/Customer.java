package org.los1.los.customer;
public class Customer {
    information_customer ic;
    public loan_info li;
    public loan_info get_loan_info()//using the method to deal with values in class loan_info
    {
        return li;
    }
    public void set_loan_info(loan_info loandet)
    {
        this.li=loandet;
    }
    public information_customer get_information_customer()//using the method to deal with values in class information_customer
    {
        return ic;
    }
    public void set_information_customer(information_customer infocust)
    {
        this.ic=infocust;
    }
}
