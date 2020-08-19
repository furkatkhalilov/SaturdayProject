package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReadExcelReusableMethods {

    Row row;
    Cell cell;
    Sheet mySheet;

    public ReadExcelReusableMethods(String pathOfExcel,String whichSheet){

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
        mySheet = workbook.getSheet(whichSheet);
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

    }

//    Get the specific data from excel
    public String getSpecificData(String whichData , int whichCell){

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
        return result;
    }

    public ArrayList<String> getAllData(){

        int maxRow= mySheet.getPhysicalNumberOfRows();

        ArrayList resultList = new ArrayList();

        for(int i = 0 ; i <maxRow ; i++){

            row = mySheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();

            for(int j = 0 ; j <cellCount ; j++){

                cell = row.getCell(j);

                resultList.add(cell.toString());
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

        String path1 = "src/main/resources/LoginData.xlsx";

        ReadExcelReusableMethods readExcelReusableMethods = new ReadExcelReusableMethods(path1,"Login");

        String s1 = readExcelReusableMethods.getSpecificData("Address" , 1);

        System.out.println(s1);
        System.out.println("------------------");

        ArrayList<String> l1 = new ArrayList();
        l1 = readExcelReusableMethods.getAllData();

        System.out.println(l1);

        System.out.println("------------------");

    }

}
