package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class SignupExcelUtil {

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
				
				for(int rownum=2; rownum<= reader.getRowCount("signUpSheet"); rownum++ ) {
	
					String FirstName=reader.getCellData("signUpSheet", "Firstname", rownum);
					String LastName=reader.getCellData("signUpSheet", "LastName", rownum);
					String password=reader.getCellData("signUpSheet", "password", rownum);
					String Confirmpassword=reader.getCellData("signUpSheet", "Confirmpassword", rownum);
					String EmailID=reader.getCellData("signUpSheet", "EmailID", rownum);
					Object ob[]= {FirstName, LastName,password,Confirmpassword,EmailID };
					//myData.add(ob);
					myData.add(new Object[] {FirstName, LastName,password,Confirmpassword,EmailID});
				}
				
				return myData;
		
		
	}

	
}
