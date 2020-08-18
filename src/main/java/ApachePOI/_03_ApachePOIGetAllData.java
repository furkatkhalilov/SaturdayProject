package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {

        String path ="src/main/resources/ApacheExcel1.xlsx";

//        navigate to file -- Creates an input file stream to read from the specified file descriptor.
        FileInputStream inputStream = new FileInputStream(path);

//        Open a workbook - Access to data
        Workbook workbook = WorkbookFactory.create(inputStream);

//        Decide the which sheet we need to work with
        Sheet mySheet = workbook.getSheet("Sheet1");
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

        Row row;
        Cell cell;

//        Get the row count from the excel
        int maxRow = mySheet.getPhysicalNumberOfRows();
            System.out.println(maxRow + " total count of row in my excel");

//            With this for loop we are going to read the data one by one from the rows
        for(int i = 0 ; i < maxRow ;i++){

            row = mySheet.getRow(i);

//            This will get the active count of the cell in the row.
            int cellCount = row.getPhysicalNumberOfCells();
            System.out.println(cellCount + " cell count for each row");

//            In each row getting all the data from the cells
            for (int j = 0 ; j<cellCount ; j++){

                cell = row.getCell(j);

                System.out.println(cell.toString());
            }
        }
    }
}


    /*
        If you dont have a data then it will give null pointer exception.
     */