package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _07_ApachePOITask4 {


    /*

            Get the data in column 1 for each row.

            ali123
            MyPasswordIsHere
            123 main
            12345
            Harrison
            New jersey


     */

    public static void main(String[] args) throws IOException {

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

        int rowCount = mySheet.getPhysicalNumberOfRows();
        System.out.println("Row count for the excel sheet--> " + rowCount );

        for(int i = 0 ; i <rowCount ; i++){

            row = mySheet.getRow(i);

            cell = row.getCell(1);

            System.out.println(cell);

        }

    }



}
