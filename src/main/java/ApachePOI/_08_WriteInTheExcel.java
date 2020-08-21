package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {

    public static void main(String[] args) throws IOException {

        String path = "src\\main\\resources\\WriteInTheExcelFile.xlsx";

        FileInputStream inputStream= new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sheet = workbook.getSheet("Sheet1");

//        Currently we do not have any row or column in the excel so that is why we need to
//          create both first.
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);

//          With a setCellValue method we are able to put our String in the excel
        cell.setCellValue("Hello World5");

//        File out put stream is saving and closing the excel file.
        FileOutputStream outputStream = new FileOutputStream(path);

        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
        inputStream.close();

        /*
            While typing in the excel we need to close the file.
         */
    }
}
