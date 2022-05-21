package org.los1.los.customer;

public class loan_info //class to store the information of loan wanted
{
    // private int answer;
    public int amount,time_y,time_m;
    // private int dd,mm,yyyy;
    public double rate;
    public String type;
    public int enter_amount()
    {
        return amount;
    }
    public void put_amount(int amt)
    {
        this.amount=amt;
    }
    public int enter_years()//for time in years
    {
        return time_y;
    }
    public void put_years(int yy)
    {
        this.time_y=yy;
    }
    public int enter_months()//for time in months
    {
        return time_m;
    }
    public void put_months(int mm)
    {
        this.time_m=mm;
    }
    public double get_rate()
    {
        return rate;
    }
    public void put_rate(double roi)
    {
        this.rate=roi;
    }
    public String getloanType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}