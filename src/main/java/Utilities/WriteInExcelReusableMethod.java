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
            To get a data from excel I am using ApachePOI.
                I can get a data from the excel and use it in the selenium.
                I can write the data to excel for example scenario name and status of the scenario(failed or passed).


            How do you work with apachePOI? Steps for apache POI?
                1)I need a location of the excel.
                2) File input stream
                3) Workbook
                4) Sheet
                5) Row and cell.
                    After these steps I can get my data from excel.
         */

        /*
            While typing in the excel we need to close the file.
         */

    }

}
