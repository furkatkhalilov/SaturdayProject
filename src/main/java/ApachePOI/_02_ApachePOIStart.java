package ApachePOI;



import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_ApachePOIStart {

    public static void main(String[] args) throws IOException {

        String path ="src/main/resources/ApacheExcel1.xlsx";

//        navigate to file
        FileInputStream inputStream = new FileInputStream(path);

//        Open a workbook - Access to data
        Workbook workbook = WorkbookFactory.create(inputStream);

//        Decide the which sheet we need to work with
        Sheet mySheet = workbook.getSheet("Sheet1");
//          Sheet mySheet = workbook.getSheetAt(0) this one is also going to work and deciding with index

        Row row = mySheet.getRow(0);

        Cell cell = row.getCell(1);

        System.out.println(cell.toString());

    }

}
