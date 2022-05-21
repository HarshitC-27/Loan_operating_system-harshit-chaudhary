package org.los1.los.customer;

public class information_customer //class to enter values of various parts of information of the customer 
{
    private String first_name,last_name,pan,email,occupation,add,income;
    private int age,aadhar,phone;
    private int acc_no;
    public String enterfirst_name()//to get the first name from an information_customer object
    {
        return first_name;
    }
    public void put_first_name(String fn)//to enter the first name to an information_customer object
    {
        first_name=fn;
    }
    public String enterlast_name()//all of these follow the same rules
    {
        return last_name;
    }
    public void put_last_name(String ln)
    {
        this.last_name=ln;
    }
    public int enteraccount_no()
    {
        return acc_no;
    }
    public void putaccount_no(int an)
    {
        this.acc_no=an;
    }
    public int enter_age()
    {
        return age;
    }
    public void put_age(int age1)
    {
        this.age=age1;
    }
    public String enter_fulladdress()
    {
        return add;
    }
    public void put_fulladdress(String add1)
    {
        this.add=add1;
    }
    public String enter_pan_number()
    {
        return pan;
    }
    public void put_pan_number(String pan1)
    {
        this.pan=pan1;
    }
    public int enter_aadhar()
    {
        return aadhar;
    }
    public void put_aadhar(int aad1)
    {
        this.aadhar=aad1;
    }
    public String enter_occupation()
    {
        return occupation;
    }
    public void put_occupation(String occu)
    {
        this.occupation=occu;
    }
    public String enter_income()
    {
        return income;
    }
    public void put_income(String inc)
    {
        this.income=inc;
    }
    public int enter_phone()
    {
        return phone;
    }
    public void put_phone(int pn)
    {
        this.phone=pn;
    }
    public String enter_email()
    {
        return email;
    }
    public void put_email(String eid)
    {
        this.email=eid;
    }
}