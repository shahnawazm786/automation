package org.example.exelfilehandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReadingExample {
    public static void main(String[] args) throws IOException {
    File file=new File("src/main/resources/demo.xlsx");
        FileInputStream inputStream=new FileInputStream(file);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=xssfWorkbook.getSheetAt(0);
        Iterator<Row> rows=sheet.rowIterator();
        while(rows.hasNext()){
            Row row=rows.next();
            Iterator<Cell> cells=row.cellIterator();
            while (cells.hasNext()){
                Cell cell=cells.next();
                switch (cell.getCellType()){
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case BLANK:
                        System.out.println("Blank cell");
                        break;
                    case FORMULA:
                        System.out.println("formula contains");
                        System.out.println(cell.getCellFormula());
                        System.out.println(cell.getNumericCellValue());
                    /*case ERROR:
                        System.out.println(cell.getErrorCellValue()); */
                }

            }
        }


    }
}
