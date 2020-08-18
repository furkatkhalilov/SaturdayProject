package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_GetASpecificData {

    public static void main(String[] args) throws IOException {

//        Username password
//          Value for the password


        String path ="src/main/resources/LoginData.xlsx";

//        navigate to file -- Creates an input file stream to read from the specified file descriptor.
        FileInputStream inputStream = new FileInputStream(path);

//        Open a workbook - Access to data
        Workbook workbook = WorkbookFactory.create(inputStream);

//        Decide the which sheet we need to work with
        Sheet mySheet = workbook.getSheet("Sheet1");
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

        Row row;
        Cell cell;

//        Total count of row is here
        int totalRowCount = mySheet.getPhysicalNumberOfRows();

        for(int i =0 ; i<totalRowCount ; i++){

//            Setting the row object to each rows
            row = mySheet.getRow(i);

            cell = row.getCell(0);

            if(cell.toString().equalsIgnoreCase("password")){
                cell = row.getCell(1);
                System.out.println(cell);
            }
        }
    }

}
