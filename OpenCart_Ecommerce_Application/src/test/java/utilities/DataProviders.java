package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	//data provider no 1
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path="\\testData\\Opencart_LoginData.xlsx"; //taking the xl path frpm the testdata
		ExcelFileUtility xlutil=new ExcelFileUtility(path); //creating the objrct of the XCLFILEUTILITY class
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellData("Sheet1",1);
		
		String logindata[][]=new String [totalrows][totalcols]; //created two dimensional array which can 
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1",i, j); //1,0
			}
		}
	 return logindata;
	}
}

//data provider2

//data provider3

//data provider4
