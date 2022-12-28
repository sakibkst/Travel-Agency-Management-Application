package classes;

import java.lang.*;

public class SilverPackage extends IPackage
{
	private String hotelType;
	
	public SilverPackage(){}
	public SilverPackage(String iPackageNumber, Tourist tourist, double amountOfDay, String hotelType)
	{
		super(iPackageNumber, tourist, amountOfDay);
		this.hotelType = hotelType;
	}
	
	public void setHotelType(String hotelType){this.hotelType = hotelType;}
	public String getHotelType(){return hotelType;}
	
	public void showDetails()
	{
		System.out.println("**** Package Information ****");
		this.getTourist().showDetails();
		System.out.println("Package Number: " + this.getIPackageNumber());
		System.out.println("Package AmountOfDay: " + this.getAmountOfDay());
		System.out.println("Hotel Type: " + hotelType);
		System.out.println();
	}
}