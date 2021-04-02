package model;

public class Customer
{	
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private int customerID; 
	private String firstName;
	private double credit; 
	//----------------------------------Constructor--------------------------------------------------------------------------------	
	public Customer(int customerID, String firstName, double credit)
	{
		setCustomerID(customerID);
		setFirstName(firstName);
		setCredit(credit);
	}

	//----------------------------------Getter-------------------------------------------------------------------------------------
	public int getCustomerID()
	{
		return customerID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getCredit()
	{
		return firstName;
	}
	//----------------------------------Setter-------------------------------------------------------------------------------------
	
	public void setCustomerID(int customerID)
	{
		if(customerID >= 0)
			if(customerID <= 100_000)
				this.customerID = customerID;
			else
				System.out.println("Fehler bei setPrice("+ customerID +"): Die customerID darf nicht größer 100.000 sein!!!");
		else
			System.out.println("Fehler bei setPrice("+ customerID +"): Der Die customerID darf nicht kleiner 0 sein!!!"); 
	}		
	public void setFirstName(String firstName)
	{
		if(firstName != null)
			if( ! firstName.isEmpty())
				if(firstName.length() <= 100)
					this.firstName = firstName.trim();
				else
					System.out.println("Fehler bei setName("+ firstName.length() +"): Es sind Maximal 100 Zeichen erlaubt!!!"); 
			else
				System.out.println("Fehler bei setName(...): Der Name ist leer!!!"); 
		else
			System.out.println("Fehler bei setName(...): Null-Ref. erhalten!!!"); 
	}
	
	private void setCredit(double credit)
	{
		if(credit >= 0)
			if(credit <= 100_000)
				this.credit = credit;
			else
				System.out.println("Fehler bei setCredit("+ credit +"): Die credit darf nicht größer 100.000 sein!!!");
		else
			System.out.println("Fehler bei setCredit("+ credit +"): Der Die credit darf nicht kleiner 0 sein!!!"); 
		
	}
	//----------------------------------others-------------------------------------------------------------------------------------

	//----------------------------------Filesystem---------------------------------------------------------------------------------

	//----------------------------------toString-----------------------------------------------------------------------------------
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerID=");
		builder.append(customerID);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", credit=");
		builder.append(credit);
		builder.append("]");
		return builder.toString();
	}

}
