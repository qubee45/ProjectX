package upskill.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static Map<String, Map<String, String>> setMapData() throws Exception{
		
		String path = System.getProperty("usr.dir")+"/src/test/resource/Datasheets/EbayDataSheets.xlsx"; 
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
		Map<String, String> dataMap = new HashMap<String, String>();
		
		for (int i=0; i<=lastRow; i++) {
			Row row = sheet.getRow(i);
			Cell KeyCell = row.getCell(0);
			Cell ValueCell = row.getCell(1);
			
			DataFormatter df = new DataFormatter();
			String Key = df.formatCellValue(KeyCell);
			String Value = df.formatCellValue(ValueCell);
			
			dataMap.put(Key, Value);
			excelFileMap.put("EbayDataSheets", dataMap);
			
		}
		
		return excelFileMap;
		
	}
	public static String getMapData(String key) throws Exception {
		Map<String, String> m = setMapData().get("EbayDataSheets");
		String value = m.get(key);
		return value;
	}
	

}
