package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class InvalidSignupExcelUtil {
	
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
				
				for(int rownum=2; rownum<= reader.getRowCount("InvalidSignupSheet"); rownum++ ) {
	
					String FirstName=reader.getCellData("InvalidSignupSheet", "Firstname", rownum);
					String LastName=reader.getCellData("InvalidSignupSheet", "LastName", rownum);
					String password=reader.getCellData("InvalidSignupSheet", "password", rownum);
					String Confirmpassword=reader.getCellData("InvalidSignupSheet", "Confirmpassword", rownum);
					String EmailID=reader.getCellData("InvalidSignupSheet", "EmailID", rownum);
					Object ob[]= {FirstName, LastName,password,Confirmpassword,EmailID };
					//myData.add(ob);
					myData.add(new Object[] {FirstName, LastName,password,Confirmpassword,EmailID});
				}
				
				return myData;
	}


}
