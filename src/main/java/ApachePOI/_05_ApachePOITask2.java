package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _05_ApachePOITask2 {

    public static void main(String[] args) throws IOException {

    /*
       Print all the data next to address text
     */


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

        for(int i = 0 ; i<maxRow ; i++){

            row = mySheet.getRow(i);

            cell = row.getCell(0);

            if(cell.toString().equals("Address")){

//            cell = row.getCell(1);
//                System.out.println(cell);
//            cell = row.getCell(2);
//                System.out.println(cell);

                int columnCount = row.getPhysicalNumberOfCells();

                for(int j = 1 ; j <columnCount ; j++){

                    cell = row.getCell(j);

                    System.out.println(cell.toString());

                }
            }
        }

    }
}
