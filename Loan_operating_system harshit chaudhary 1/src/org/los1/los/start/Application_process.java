package org.los1.los.start;
import java.util.Scanner;
import org.los1.los.operation.los_process;
import org.los1.los.customer.Customer;
import org.los1.los.customer.information_customer;
import org.los1.los.customer.loan_info;
public class Application_process //driver class for this project
{
    static int answer;

    public static void main(String[] args) //main method
    {
        String fn,inc,ln,pan,address,occupation,email,type;
        int accno,age,aadhar,phone,amt,y,m;
        Scanner sc=new Scanner(System.in);//to scan all the required values
        try
        {
            Customer cstmr=new Customer();
            information_customer ic=new information_customer();
            System.out.println("Are you an existing customer?");
            System.out.println("1 for yes, 0 for no, -1 for exit");
            int ans=sc.nextInt();
            answer=ans;
            if(ans==-1)//terminates for exiting
            System.exit(0);
            else if(ans==0)
            {
                System.out.println("Visit our nearest branch for account opening");
                System.exit(0);
            }
            //entering the values of customer
            System.out.println("Enter your first name");
            fn=sc.next();
            ic.put_first_name(fn);
            System.out.println("Enter your last name");
            ln=sc.next();
            ic.put_last_name(ln);
            System.out.println("Enter your account number");
            accno=sc.nextInt();
            ic.putaccount_no(accno);
            System.out.println("Enter your pan number");
            pan=sc.next();
            ic.put_pan_number(pan);
            System.out.println("Enter your aadhar number");
            aadhar=sc.nextInt();
            ic.put_aadhar(aadhar);
            System.out.println("Enter age");
            age=sc.nextInt();
            ic.put_age(age);
            System.out.println("Enter occupation ");
            occupation=sc.next();
            ic.put_occupation(occupation);
            System.out.println("Enter income");
            inc=sc.next();
            ic.put_income(inc);
            System.out.println("Enter pincode");
            address=sc.next();
            ic.put_fulladdress(address);
            System.out.println("Enter phone number");
            phone=sc.nextInt();
            ic.put_phone(phone);
            System.out.println("Enter email address");
            email=sc.next();
            ic.put_email(email);
            cstmr.set_information_customer(ic);//imp
            
            loan_info li=new loan_info();//object of class loan_info
        
            System.out.println("Enter amount to be loaned");
            amt=sc.nextInt();
        li.put_amount(amt);
        System.out.println("Enter years");
        y=sc.nextInt();
        li.put_years(y);
        System.out.println("Enter months");
        m=sc.nextInt();
        li.put_months(m);
        System.out.println("Enter type of loan- PL HL CL EL GL");
        type=sc.next();
        li.setType(type);
        li.put_rate(0.0);
        cstmr.set_loan_info(li);
        los_process lp=new los_process();//object of class los_process
        lp.inputs(cstmr);
        }
        finally{
            sc.close();
        }
    }
}
