package classes;

import java.lang.*;

public class GoldPackage extends IPackage
{
	private String resortType;
	
	public GoldPackage(){}
	public GoldPackage(String iPackageNumber, Tourist tourist, double amountOfDay, String resortType)
	{
		super(iPackageNumber, tourist, amountOfDay);
		this.resortType = resortType;
	}
	
	public void setResortType(String resortType){this.resortType = resortType;}
	public String getResortType(){return resortType;}
	
	public void showDetails()
	{
		System.out.println("**** Package Information ****");
		this.getTourist().showDetails();
		System.out.println("Package Number: " + this.getIPackageNumber());
		System.out.println("Package Amount Of Day: " + this.getAmountOfDay());
		System.out.println("Resort Type: " + resortType);
		System.out.println();
	}
}