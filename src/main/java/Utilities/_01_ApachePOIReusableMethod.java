package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class _01_ApachePOIReusableMethod {

    public static void getTheSpecificDataFromExcel(String pathOfExcel, String whichSheet,String whichData , int whichCell){

//        navigate to file -- Creates an input file stream to read from the specified file descriptor.
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(pathOfExcel);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Open a workbook - Access to data
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Decide the which sheet we need to work with
        Sheet mySheet = workbook.getSheet(whichSheet);
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

        Row row;
        Cell cell;

        int maxRow = mySheet.getPhysicalNumberOfRows();

        String result = null;

        for(int i = 0 ; i<maxRow ; i++){

            row = mySheet.getRow(i);

            cell = row.getCell(0);

            if(cell.toString().equals(whichData)){

              cell = row.getCell(whichCell);
              result =cell.toString();

            }
        }

        System.out.println(result);

    }

    public static void main(String[] args){
        String path1 = "src/main/resources/LoginData.xlsx";
        String path2 = "src/main/resources/ApacheExcel1.xlsx";

        getTheSpecificDataFromExcel(path1,"Login","Address" , 2);
        getTheSpecificDataFromExcel(path1,"Login","Username" , 1);
        getTheSpecificDataFromExcel(path1,"DiologContent","Name" , 1);
        getTheSpecificDataFromExcel(path2,"Sheet1","Tiger" , 1);

    }

}
