package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class RegistrationExcelUtil {
	
	
	static Xls_Reader reader;


	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		  
		try {
		//Get the Excel data
			reader=new Xls_Reader("C:\\Users\\CHALAMA\\eclipse-workspace\\NurtureFarm\\src\\main\\java\\com\\qa\\NurtureFarm\\TestData\\TestData.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				//parameterization
				
				for(int rownum=2; rownum<= reader.getRowCount("Registration"); rownum++ ) {
	
					String NonRegisterMail=reader.getCellData("Registration", "NonRegisterEmail", rownum);
					String Pwd=reader.getCellData("Registration", "Password", rownum);
					String Name=reader.getCellData("Registration", "FullName", rownum);
					String ShortBio=reader.getCellData("Registration", "Bio", rownum);
					String businessname=reader.getCellData("Registration", "BusinessName", rownum);
				//	String businessMail=reader.getCellData("Registration", "BusinessEmail", rownum);
					String AEmail=reader.getCellData("Registration", "AlternateEmail", rownum);
					String Phone=reader.getCellData("Registration", "PhoneNumber", rownum);
					String abn=reader.getCellData("Registration", "ABNNumber", rownum);
					String ngr=reader.getCellData("Registration", "NGRNumber", rownum);
					String postalcode=reader.getCellData("Registration", "PostCode", rownum);
					String address=reader.getCellData("Registration", "Address", rownum);
					String town=reader.getCellData("Registration", "Town", rownum);
					Object ob[]= {NonRegisterMail,Pwd,Name,ShortBio,businessname,AEmail,Phone,abn,ngr,postalcode,address,town};
					//myData.add(ob);
					myData.add(new Object[] {NonRegisterMail,Pwd,Name,ShortBio,businessname,AEmail,Phone,abn,ngr,postalcode,address,town});
				}
				
				return myData;
	}

}
