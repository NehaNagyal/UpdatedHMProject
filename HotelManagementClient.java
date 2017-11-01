package com.cg.hotelManagement.cleint;

import java.util.Scanner;

import com.cg.hotelManagement.dto.Hotels;
import com.cg.hotelManagement.dto.UserDetails;
import com.cg.hotelManagement.exception.HotelManagementException;
import com.cg.hotelManagement.service.HotleManagementServiceImpl;

public class HotelManagementClient {

	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);

		HotleManagementServiceImpl hotelMangementService=new HotleManagementServiceImpl();
		UserDetails userDetails=new UserDetails();
		Hotels hotels=new Hotels();

		System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
		System.out.println("1.Admin");
		System.out.println("2. Customer/HotelEmployee");
		System.out.println("3. Exit.");
		System.out.println("Select one of the above :: ");

		int firstChoice=sc.nextInt();
		switch(firstChoice){
		case 1:{

			System.out.println("You selected admin.......Please Login."); 	//ADMIN LOGIN since there can be only one admin --> so values are hardcoded in service layer.
			System.out.println("Enter Admin LoginID ::");
			String adminId = sc.next();
			System.out.println("Enter Admin Password :: ");
			String adminPassword= sc.next();

			if(hotelMangementService.adminLogin(adminId, adminPassword)==false){
				System.err.println("You entered wrong admin credentials.");	
			}
			else{ 
				System.out.println("Welcome Admin...Select one of the following..");
				System.out.println("1. Hotels management (add/delete/modify hotel details..)");
				System.out.println("2. Rooms management (add/delete/modify room details..)");
				System.out.println("3. Generate various reports.");
				System.out.println("4. Exit");

				int secondChoice=sc.nextInt();
				switch(secondChoice){
				case 1:{
					System.out.println("You selected to manage hotels. ");
					System.out.println("Please select one of the following operation ::");
					System.out.println("1. Add a new hotel to dataBase.");
					System.out.println("2. Delete a hotel from dataBase");
					System.out.println("3. Update a hotel detail in dataBase.");
					System.out.println("4.Exit.");

					int thirdChoice=sc.nextInt();
					switch(thirdChoice)
					{
					case 1:{
						System.out.println("Want to enter a new hotel to dataBase?");
						System.out.println("Enter Hotel details ::");

						System.out.println("Enter hotel ID ::");
						String hId=sc.next();
						hotels.setHotelId(hId);

						System.out.println("Enter city ::");
						String cty=sc.next();
						hotels.setCity(cty);

						System.out.println("Enter hotel Name ::");
						String hName=sc.next();
						hotels.setHotelName(hName);

						System.out.println("Enter hotel address ::");
						String addrs=sc.next();
						hotels.setAddress(addrs);

						System.out.println("Enter a short decription of hotel ::");
						String desc=sc.next();
						hotels.setDescription(desc);

						System.out.println("Enter avg rate per night for this hotel ::");
						int arpn=sc.nextInt();
						hotels.setAvgRatePerNight(arpn);

						System.out.println("Enter primary contact number ::");
						String pno = sc.next();
						hotels.setPhone1(pno);

						System.out.println("Enter secondry contact number::");
						String sno = sc.next();
						hotels.setPhone2(sno);

						System.out.println("Enter rating of hotel ::");
						int rating = sc.nextInt();
						hotels.setRating(rating);

						System.out.println("Enter fax details ::");
						String fax = sc.next();
						hotels.setFax(fax);

						//add a new hotel here --> from service layer.
						break;	
					}
					case 2:{
						System.out.println("You selected to delete a hotel from dataBase ::");
						System.out.println("Enter a hotel ID to delete from dataBase ::");
						String hId=sc.next();
						//delete the hotel here.
						break;	
					}
					case 3:{
						System.out.println("You selected to update a existing hotel in dataBase ");

						System.out.println("Enter hotel ID ::");
						String hId=sc.next();
						hotels.setHotelId(hId);

						System.out.println("Enter city ::");
						String cty=sc.next();
						hotels.setCity(cty);

						System.out.println("Enter hotel Name ::");
						String hName=sc.next();
						hotels.setHotelName(hName);

						System.out.println("Enter hotel address ::");
						String addrs=sc.next();
						hotels.setAddress(addrs);

						System.out.println("Enter a short decription of hotel ::");
						String desc=sc.next();
						hotels.setDescription(desc);

						System.out.println("Enter avg rate per night for this hotel ::");
						int arpn=sc.nextInt();
						hotels.setAvgRatePerNight(arpn);

						System.out.println("Enter primary contact number ::");
						String pno = sc.next();
						hotels.setPhone1(pno);

						System.out.println("Enter secondry contact number::");
						String sno = sc.next();
						hotels.setPhone2(sno);

						System.out.println("Enter rating of hotel ::");
						int rating = sc.nextInt();
						hotels.setRating(rating);

						System.out.println("Enter fax details ::");
						String fax = sc.next();
						hotels.setFax(fax);

						//update these details to dataBase hwere
						break;	
					}
					case 4:{
						System.out.println("You choose to exit.");
						break;	
					}
					default:{
						System.out.println("You entered a wrong value...Please try again.");
						break;	
					}
					}
					break;
				}
//NEHA
				case 2:{
					//room management --> refer the above hotel management case --> wruite it same as above-->
					// 3 operations 
					//1. add room 
					//2. delete room 
					//3.update room 
					//4.exit 
					//default case 
					break;
				}
				case 3:{
//NEHA					
					//generate reports --> write a swich case here --> write 6 casses as written below..
					//1. 	View List of Hotels
					// 2	View Bookings of specific hotel
				//	3. 	View guest list of specific hotel
					//4. 	View bookings for specified date
					//5. exit
					//default
					break;
				}
////NEHA
				case 4:{
					//exit code 
					break;
				}
				default:
					System.out.println("You entered a wrong value...Please try again.");
					break;
				}
			}
			break;
		}
		case 2:{
			break;
		}
		case 3:{
			System.out.println("Thankyou for using our services......Visit Atgain.");
			break;
		}
		default:{
			System.err.println("You entered a wrong value...Please try again.");
			break;
		}
		}
		//*************************************************************
		//Adding a new user hotel employee/customer to the hotel management system

		/*System.out.println("Enter User Name :: ");
		String name=sc.next();
		userDetails.setUserName(name);
		System.out.println("Create your Password ::");
		String password=sc.next();
		userDetails.setPassword(password);
		System.out.println("Enter a unique user Id :: ");
		String userId=sc.next();
		userDetails.setUserId(userId);
		System.out.println("Enter your role :: ");
		String role=sc.next();
		userDetails.setRole(role);
		System.out.println("Enter your mobile number :: ");
		String mobile=sc.next();
		userDetails.setMobileNo(mobile);
		System.out.println("Enter your phone number :: ");
		String pNo=sc.next();
		userDetails.setPhone(pNo);
		System.out.println("Enter your home city :: ");
		String city=sc.next();
		userDetails.setAddress(city);
		System.out.println("Enter your email Id :: ");
		String eMail=sc.next();
		userDetails.setEmail(eMail);

		hotelMangementService.addUser(userDetails); */
		//*************************************************************

		//System.out.println(hotelMangementService.adminLogin("System", "Capgemini123"));
		//*************************************************************
		//User login 
		System.out.println("Enter UserID ::");
		String uId=sc.next();
		System.out.println("Enter Password ::");
		String pwd = sc.next();
		try {
			if(hotelMangementService.userLogin(uId, pwd)==1)
				System.out.println("Welcome!!Signed in");
			else
				System.err.println("Your password does not match.");
		} catch (HotelManagementException e) {
			System.err.println("Exception::UserID Does not exist");
		}

	}
}
