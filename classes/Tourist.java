package classes;
import java.lang.*;

public class Tourist
{
	private int nid;
	private String name;
	private String phnNumber;
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	
	public void showDetails()
	{
		System.out.println("Tourist NID: " + nid);
		System.out.println("Tourist Name: " + name);
		System.out.println("Tourist Phone Number: " + phnNumber);
		System.out.println();
	}
}