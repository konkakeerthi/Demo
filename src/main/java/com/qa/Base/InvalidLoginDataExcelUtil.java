package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class InvalidLoginDataExcelUtil {

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
				
				for(int rownum=2; rownum<= reader.getRowCount("InvalidLoginSheet"); rownum++ ) {
	
					String Email=reader.getCellData("InvalidLoginSheet", "Email", rownum);
					String Password=reader.getCellData("InvalidLoginSheet", "Password", rownum);
					Object ob[]= {Email, Password};
					//myData.add(ob);
					myData.add(new Object[] {Email,Password});
				}
		
					
					
				
				
				return myData;
		
		
	}

	
}
