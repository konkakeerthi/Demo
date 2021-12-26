package com.qa.Base;

import java.util.ArrayList;

import com.qa.ExcelUtil.Xls_Reader;

public class StripeDetailsExcelUtil {
	
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
				
				for(int rownum=2; rownum<= reader.getRowCount("StripeDetails"); rownum++ ) {
	
					String Mail=reader.getCellData("StripeDetails", "Email", rownum);
					String Name=reader.getCellData("StripeDetails", "BusinessName", rownum);
					String Abn=reader.getCellData("StripeDetails", "ABNNumber", rownum);
					String address1=reader.getCellData("StripeDetails", "AddressLine1", rownum);
					String address2=reader.getCellData("StripeDetails", "AddressLine2", rownum);
					String city=reader.getCellData("StripeDetails", "City", rownum);
					String postcodee=reader.getCellData("StripeDetails", "PostalCode", rownum);
					String website=reader.getCellData("StripeDetails", "BusinessWebsite", rownum);
					
					Object ob[]= {Mail,Name,Abn,address1,address2,city,postcodee,website};
					//myData.add(ob);
					myData.add(new Object[] {Mail,Name,Abn,address1,address2,city,postcodee,website});
				}
				
				return myData;
	}


}
