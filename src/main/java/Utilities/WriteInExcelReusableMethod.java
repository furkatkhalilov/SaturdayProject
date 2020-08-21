package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcelReusableMethod {

    static int count = 0;

    public static void writeInExcelReusable(String path , String sheetName, Scenario scenario){

        FileInputStream inputStream= null;

        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Workbook workbook = null;

        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);

//        Every time we are working with new scenario and sheet.createRow should increase according to
//              count of scenario
        Row row = sheet.createRow(count);

        Cell cell = row.createCell(0);
        cell.setCellValue(scenario.getId());

        cell = row.createCell(1);
        cell.setCellValue(scenario.getStatus());

        count++;

//        File out put stream is saving and closing the excel file.
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook.write(outputStream);

            outputStream.close();
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        /*
            While typing in the excel we need to close the file.
         */

    }

}
