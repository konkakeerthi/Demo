package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class ValidLoginDataExcelUtil {

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
				
				for(int rownum=2; rownum<= reader.getRowCount("ValidLoginSheet"); rownum++ ) {
	
					String Email=reader.getCellData("ValidLoginSheet", "Email", rownum);
					String Password=reader.getCellData("ValidLoginSheet", "Password", rownum);
					Object ob[]= {Email, Password};
					//myData.add(ob);
					myData.add(new Object[] {Email,Password});
				}
				/*for(int rownum=2; rownum<= reader.getRowCount("FacebookLogin"); rownum++ ) {
					String FBEmail=reader.getCellData("FacebookLogin", "FacebookEmail", rownum);
					String FBPassword=reader.getCellData("FacebookLogin", "FBPassword", rownum);
					Object obj[]= {FBEmail, FBPassword};
					//myData.add(obj);
					myData.add(new Object[] {FBEmail,FBPassword});
					
					
				}*/
				
				return myData;
		
		
	}

	
}
