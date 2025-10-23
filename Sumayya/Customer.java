package Sumayya;
public class Customer {
	int custno,contactnumber;
	String custname,address;	
	public Customer(int custno,int contactnumber, String custname, String address)
	{
		this.custno=custno;
		this.contactnumber=contactnumber;
		this.custname=custname;
		this.address=address;
	}
	public void display()
	{
		System.out.println(custno);
		System.out.println(custname);
		System.out.println(contactnumber);
		System.out.println(address);		
	}	
	public static void searchName(int cont,Customer[] allcust)
	{
		for(Customer c:allcust)
		{
			if(cont==c.contactnumber)
			{
				c.display();
			}
		}
	}
	public static void main(String[] args) {
		Customer[] AllCustomers= {
				new Customer(11,12345,"Maaz","Nayapura"),
				new Customer(12,587452,"Nadeem","Islampura"),
				new Customer(13,524163,"Saquib","Rasool Pura"),
				new Customer(14,365241,"Majid","Islampura"),
				new Customer(15,524174,"Saad","Nayapura"),
				new Customer(16,365241,"Khalid","Nayapura")
		};		
		searchName(12345,AllCustomers);
	}
}
