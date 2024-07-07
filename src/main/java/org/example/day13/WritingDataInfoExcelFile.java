package org.example.day13;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataInfoExcelFile {
    public static void main(String[] args) throws IOException, InvalidFormatException {
       // File file=new File("src/main/resoruces/employee.xlsx");
        FileOutputStream outputStream=new FileOutputStream(new File("src/main/resources/employee.xlsx"));
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
        XSSFRow row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Admin");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
