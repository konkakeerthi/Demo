package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class BuyerAccountExcelUtil {
	
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
				
				for(int rownum=2; rownum<= reader.getRowCount("BuyerAccount"); rownum++ ) {
	
					String buyerEmail=reader.getCellData("BuyerAccount", "BuyerEmail", rownum);
					String Password=reader.getCellData("BuyerAccount", "Password", rownum);
					Object ob[]= {buyerEmail, Password};
					//myData.add(ob);
					myData.add(new Object[] {buyerEmail,Password});
				}
				
				return myData;
		
		
	}


}
