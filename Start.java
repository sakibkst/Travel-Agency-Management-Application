import java.lang.*;
import classes.*;
import java.util.Scanner;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		String n, bn;
		System.out.print("Enter TravelAgency Name: ");
		n = sc.next();
		System.out.print("Enter Branch Name: ");
		bn = sc.next();
		TravelAgency b = new TravelAgency(n, bn);
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$$   Welcome to "+b.getName()+" Application  $$$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println();
			System.out.println("\tWhat Do You Want To Do?\n");
			System.out.println("\t\t1. TravelCounsellor Management");
			System.out.println("\t\t2. Tourist Management");
			System.out.println("\t\t3. Package Management");
			System.out.println("\t\t4. Package Transactions");
			System.out.println("\t\t5. Show Travel Agency Information");
			System.out.println("\t\t6. Exit");
				
			System.out.println("\n---------------------------");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected TravelCounsellor Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat1 = true;
					
					while(repeat1)
					{
					
						System.out.println("\tTravelCounsellor Management Options are: \n");
						System.out.println("\t\t1. Insert New TravelCounsellor");
						System.out.println("\t\t2. Remove TravelCounsellor");
						System.out.println("\t\t3. Search TravelCounsellor");
						System.out.println("\t\t4. Show All TravelCounsellors");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option1 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option1)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert TravelCounsellor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Travel Counsellor ID: ");
								String travelCounsellorId1 = sc.next();
								System.out.print("Enter Travel Counsellor Name: ");
								String name1 = sc.next();
								System.out.print("Enter Salary: ");
								double salary1 = sc.nextDouble();
								
								TravelCounsellor tc1 = new TravelCounsellor();
								tc1.setTravelCounsellorId(travelCounsellorId1);
								tc1.setName(name1);
								tc1.setSalary(salary1);
								
								if(b.insertTravelCounsellor(tc1))
								{
									System.out.println(travelCounsellorId1 + " Travel Counsellor Has Been Inserted");
								}
								else
								{
									System.out.println(travelCounsellorId1 + " Travel Counsellor Can NOT be Inserted");
								}
								
								
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Travel Counsellor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The Travel Counsellor Id to remove a Travel Consellor: ");
								String travelCounsellorId2 = sc.next();
								
								TravelCounsellor tc2 = b.searchTravelCounsellor(travelCounsellorId2);
								
								if(tc2 != null)
								{
									if(b.removeTravelCounsellor(tc2))
									{
										System.out.println("*** Travel Counsellor Removed ***");
									}
								}
								else
								{
									System.out.println("*** Travel Counsellor Can NOT be Removed ***");
								}
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Travel Counsellor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The Travel Counsellor Id to search a Travel Counsellor: ");
								String travelCounsellorId3 = sc.next();
								
								TravelCounsellor tc3 = b.searchTravelCounsellor(travelCounsellorId3);
								
								if(tc3 != null)
								{
									System.out.println("*** Travel Counsellor Found ***");
									tc3.showDetails();
								}
								else
								{
									System.out.println("*** Travel Counsellor NOT Found ***");
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Travel Counsellors");
								System.out.println("************************************");
								System.out.println();
								
								b.showAllTravelCounsellors();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat1 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Tourist Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat2 = true;
					
					while(repeat2)
					{
					
						System.out.println("\tTourist Management Options are: \n");
						System.out.println("\t\t1. Insert New Tourist");
						System.out.println("\t\t2. Remove Tourist");
						System.out.println("\t\t3. Search Tourist");
						System.out.println("\t\t4. Show All Tourists");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option2 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option2)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Tourist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Tourist NID: ");
								int nid1 = sc.nextInt();
								System.out.print("Enter Tourist Name: ");
								String name1 = sc.next();
								System.out.print("Enter Phone Number: ");
								String phnNumber1 = sc.next();
								
								Tourist c1 = new Tourist();
								c1.setNid(nid1);
								c1.setName(name1);
								c1.setPhnNumber(phnNumber1);
								
								if(b.insertTourist(c1))
								{
									System.out.println(nid1 + " Tourist Has Been Inserted");
								}
								else
								{
									System.out.println(nid1 + " Tourist Can NOT be Inserted");
								}
							
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Tourist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The NID to remove a Tourist: ");
								int nid2 = sc.nextInt();
								
								Tourist c2 = b.searchTourist(nid2);
								
								if(c2 != null)
								{
									if(b.removeTourist(c2))
									{
										System.out.println("*** Tourist Removed ***");
									}
								}
								else
								{
									System.out.println("*** Tourist Can NOT be Removed ***");
								}
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Tourist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The NID to search a Tourist: ");
								int nid3 = sc.nextInt();
								
								Tourist c3 = b.searchTourist(nid3);
								
								if(c3 != null)
								{
									System.out.println("*** Tourist Found ***");
									c3.showDetails();
								}
								else
								{
									System.out.println("*** Tourist NOT Found ***");
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Tourist");
								System.out.println("************************************");
								System.out.println();
								
								b.showAllTourists();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat2 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 3:
				
					System.out.println("#####################################");
					System.out.println("You Have Selected Package Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat3 = true;
					
					while(repeat3)
					{
					
						System.out.println("\tPackage Management Options are: \n");
						System.out.println("\t\t1. Insert New Package");
						System.out.println("\t\t2. Remove Package");
						System.out.println("\t\t3. Search Package");
						System.out.println("\t\t4. Show All Packages");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option3 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option3)
						{
							case 1:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Insert Package");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Tourist NID for Verification: ");
								int nid1 = sc.nextInt();
								
								Tourist c1 = b.searchTourist(nid1);
								
								if(c1 != null)
								{
									System.out.println("**** Valid Tourist ****");
									
									System.out.println("Which Type of Package do you want to create?");
									System.out.println("\t\t 1. Silver Package");
									System.out.println("\t\t 2. Gold Package");
									System.out.println("\t\t 3. Go Back");
									
									System.out.println("\n---------------------------");
									System.out.print("Enter Your Type: ");
									int type = sc.nextInt();
									System.out.println("---------------------------\n");
									
									IPackage a = null;
									
									if(type == 1)
									{
										System.out.println("***************");
										System.out.println("Silver Package");
										System.out.println("***************");
										System.out.println();
										
										System.out.print("Enter Package Number: ");
										String an = sc.next();
										System.out.print("Enter Package Amount Of Day: ");
										double ba = sc.nextDouble();
										System.out.print("Enter Hotel Type: ");
										String ir = sc.next();
										
										SilverPackage sa = new SilverPackage(an, c1, ba, ir);
										
										a = sa;
										
									}
									else if(type == 2)
									{
										System.out.println("***************");
										System.out.println("Gold Package");
										System.out.println("***************");
										System.out.println();
										
										System.out.print("Enter Package Number: ");
										String an = sc.next();
										System.out.print("Enter Package Amount Of Day: ");
										double ba = sc.nextDouble();
										System.out.print("Enter Resort Type: ");
										String ty = sc.next();
										
										GoldPackage fa = new GoldPackage(an, c1, ba, ty);
										
										a = fa;
									}
									else if(type == 3)
									{
										System.out.println("***************");
										System.out.println("Going Back");
										System.out.println("***************");
										System.out.println();
									}
									else
									{
										System.out.println("***************");
										System.out.println("Invalid Type");
										System.out.println("***************");
										System.out.println();
									}
									
									if(a != null)
									{
										if(b.insertIPackage(a))
										{
											System.out.println("*** Package Inserted ***");
										}
										else
										{
											System.out.println("*** Package NOT Inserted ***");
										}
									}
									
								}
								else
								{
									System.out.println("**** Invalid Tourist ****");
								}
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Remove Package");
								System.out.println("********************************");
								System.out.println();
								
								
								System.out.print("Enter The Pacakge Number to remove a Package: ");
								String iPackageNumber2 = sc.next();
								
								IPackage ip2 = b.searchIPackage(iPackageNumber2);
								
								if(ip2 != null)
								{
									if(b.removeIPackage(ip2))
									{
										System.out.println("*** Package Removed ***");
									}
								}
								else
								{
									System.out.println("*** Package Can NOT be Removed ***");
								}
								
								
								break;
								
							case 3:
							
								System.out.println("********************************");
								System.out.println("You Have Selected Search Package");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter The Package Number to search a package: ");
								String iPackageNumber3 = sc.next();
								
								IPackage ip3 = b.searchIPackage(iPackageNumber3);
								
								if(ip3 != null)
								{
									System.out.println("*** Package Found ***");
									ip3.showDetails();
								}
								else
								{
									System.out.println("*** Package NOT Found ***");
								}
								
								break;
								
							case 4:
								
								System.out.println("***********************************");
								System.out.println("You Have Selected Show All Packages");
								System.out.println("***********************************");
								System.out.println();
								
								b.showAllIPackages();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat3 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
				
					break;
					
				case 4:
					
					System.out.println("######################################");
					System.out.println("You Have Selected Package Transactions");
					System.out.println("######################################");
					System.out.println();
					
					boolean repeat4 = true;
					
					while(repeat4)
					{
					
						System.out.println("\tPackage Transaction Options are: \n");
						System.out.println("\t\t1. Add Day");
						System.out.println("\t\t2. Cancel Day");
						System.out.println("\t\t3. Show Total Day");
						System.out.println("\t\t4. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option4 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option4)
						{
							case 1:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Add Day");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Package Number: ");
								String an1 = sc.next();
								
								IPackage a1 = b.searchIPackage(an1);
								
								if(a1 != null)
								{
									System.out.println("*** Valid Package ***");
									
									System.out.println("Current Total Day	: " + a1.getAmountOfDay());
									System.out.print("Add Day	: ");
									double am = sc.nextDouble();
									if(a1.addDay(am))
									{
										System.out.println("--- Add Day Successfull ---");
										System.out.println("New Total Day	: " + a1.getAmountOfDay());
										frwd.writeInFile(am + " Add Day in " + a1.getIPackageNumber());
									}
									else
									{
										System.out.println("--- Add Day Failed ---");
									}
								}
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Cancel Day");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Package Number: ");
								String an2 = sc.next();
								
								IPackage a2 = b.searchIPackage(an2);
								
								if(a2 != null)
								{
									System.out.println("*** Valid Package ***");
									
									System.out.println("Current Total Day	: " + a2.getAmountOfDay());
									System.out.print("Cancel Day	: ");
									double am = sc.nextDouble();
									if(a2.cancelDay(am))
									{
										System.out.println("--- Cancel Day Successfull ---");
										System.out.println("New Total Day	: " + a2.getAmountOfDay());
										frwd.writeInFile(am + " Cancel Day in " + a2.getIPackageNumber());
									}
									else
									{
										System.out.println("--- Cancel Day Failed ---");
									}
								}
								
								break;
								
							case 3:
							
								System.out.println("*************************************");
								System.out.println("You Have Selected Show Total Day History");
								System.out.println("*************************************");
								System.out.println();
								
								frwd.readFromFile();
								
								break;
								
							case 4:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								System.out.println();
								repeat4 = false;
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 5:
					
					System.out.println("###########################################");
					System.out.println("You Have Selected Travel Agency Information");
					System.out.println("###########################################");
					System.out.println();
					
					b.showDetails();
					
					break;
					
				case 6:
					
					System.out.println("###################################");
					System.out.println("Thank You for Using Our Application");
					System.out.println("###################################");
					System.out.println();
					
					repeat = false;
					
					break;
					
				default:
				
					System.out.println("######################");
					System.out.println("Invalid Selection.....");
					System.out.println("######################");
					System.out.println();
					
					break;
			}
		}		
	}
}