package org.example.day13;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromParticularExcelCell {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        XSSFWorkbook workbook=new XSSFWorkbook(new File("src/main/resources/demo.xlsx"));
        XSSFSheet sheet=workbook.getSheetAt(0);
        String usrerName=sheet.getRow(9).getCell(2).getStringCellValue();
        System.out.println(usrerName);
        System.out.println("Enter row name");
        String rowName= new Scanner(System.in).next();
        System.out.println("Enter column name");
        String columnName=new Scanner(System.in).next();


    }
    //Information.name.value1
    // Information - sheet name
    // name - row
    //valye - column
}
