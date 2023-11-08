package utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelUtility {

    public static String getTestData(int rowNr, int cellNr) {

        File file = new File("C:\\Users\\juan.gonzales\\Documents\\testData.xlsx");

        try{
            XSSFWorkbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheetAt(0);
            return sheet.getRow(rowNr).getCell(cellNr).getStringCellValue();
        } catch(IOException ioe) {
            System.out.println("File could not be loaded");
        } catch(InvalidFormatException ife) {
            System.out.println("The format of the file is invalid");
        }
        return "";
    }
}
