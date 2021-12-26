package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class SellerAccountExcelUtil {
	
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
				
				for(int rownum=2; rownum<= reader.getRowCount("SellerAccount"); rownum++ ) {
	
					String sellerEmail=reader.getCellData("SellerAccount", "SellerEmail", rownum);
					String Password=reader.getCellData("SellerAccount", "Password", rownum);
					Object ob[]= {sellerEmail, Password};
					//myData.add(ob);
					myData.add(new Object[] {sellerEmail,Password});
				}
				
				return myData;
		
		
	}




}
