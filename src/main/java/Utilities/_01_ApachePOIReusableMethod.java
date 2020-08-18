package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _01_ApachePOIReusableMethod {

    public void getTheSpecificDataFromExcel() throws IOException {

        String path ="src/main/resources/LoginData.xlsx";

//        navigate to file -- Creates an input file stream to read from the specified file descriptor.
        FileInputStream inputStream = new FileInputStream(path);

//        Open a workbook - Access to data
        Workbook workbook = WorkbookFactory.create(inputStream);

//        Decide the which sheet we need to work with
        Sheet mySheet = workbook.getSheet("Login");
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

        Row row;
        Cell cell;

        int maxRow = mySheet.getPhysicalNumberOfRows();

        ArrayList<String> listOfAddress = new ArrayList<>();

        for(int i = 0 ; i<maxRow ; i++){

            row = mySheet.getRow(i);

            cell = row.getCell(0);

            if(cell.toString().equals("Address")){

                int columnCount = row.getPhysicalNumberOfCells();

                for(int j = 1 ; j <columnCount ; j++){

                    cell = row.getCell(j);

                    listOfAddress.add(cell.toString());

                }
            }
        }

        System.out.println(listOfAddress);


    }

}
