

package MySeleniumPractice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
    public String path;
    private FileInputStream fis = null;
    private FileOutputStream fileOut = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    public Xls_Reader(String path) {
        this.path = path;
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Returns the row count in a sheet
    public int getRowCount(String sheetName) {
        int index = workbook.getSheetIndex(sheetName);
        if (index == -1) {
            return 0;
        } else {
            sheet = workbook.getSheetAt(index);
            return sheet.getLastRowNum() + 1;
        }
    }

    // Returns the data from a cell
    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            if (rowNum <= 0) return "";

            int index = workbook.getSheetIndex(sheetName);
            int col_Num = -1;
            if (index == -1) return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);

            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
                    col_Num = i;
                }
            }

            if (col_Num == -1) return "";

            row = sheet.getRow(rowNum - 1);
            if (row == null) return "";

            cell = row.getCell(col_Num);
            if (cell == null) return "";

            // Handle different cell types
            return getFormattedCellValue(cell);

        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colName + " does not exist in xls";
        }
    }

    // A helper method to handle different cell types and formats
    private String getFormattedCellValue(Cell cell) {
        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
            String cellText = String.valueOf(cell.getNumericCellValue());
           
            if (DateUtil.isCellDateFormatted(cell)) {
                double d = cell.getNumericCellValue();
                Calendar cal = Calendar.getInstance();
                cal.setTime(DateUtil.getJavaDate(d));
                cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
                cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cellText;
            
            }
            return cellText;
        } else if (cell.getCellType() == CellType.BLANK) {
            return "";
        } else {
            return String.valueOf(cell.getBooleanCellValue());
        }
    }

    // Set cell data with additional URL for hyperlinks
    public boolean setCellData(String sheetName, String colName, int rowNum, String data, String url) {
        try {
            try (FileInputStream fis = new FileInputStream(path)) {
                workbook = new XSSFWorkbook(fis);
            }

            if (rowNum <= 0) return false;

            int index = workbook.getSheetIndex(sheetName);
            int colNum = -1;
            if (index == -1) return false;

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);

            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName)) {
                    colNum = i;
                }
            }

            if (colNum == -1) return false;

            sheet.autoSizeColumn(colNum);
            row = sheet.getRow(rowNum - 1);
            if (row == null) row = sheet.createRow(rowNum - 1);

            cell = row.getCell(colNum);
            if (cell == null) cell = row.createCell(colNum);

            cell.setCellValue(data);
            XSSFCreationHelper createHelper = workbook.getCreationHelper();

            XSSFCellStyle hlinkStyle = workbook.createCellStyle();
            hlinkStyle.setFont(createHyperlinkFont());
            XSSFHyperlink link = createHelper.createHyperlink(HyperlinkType.FILE);
            link.setAddress(url);
            cell.setHyperlink(link);
            cell.setCellStyle(hlinkStyle);

            try (FileOutputStream fileOut = new FileOutputStream(path)) {
                workbook.write(fileOut);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private XSSFFont createHyperlinkFont() {
        XSSFFont font = workbook.createFont();
        font.setUnderline(XSSFFont.U_SINGLE);
        font.setColor(IndexedColors.BLUE.getIndex());
        return font;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Code for testing the Xls_Reader class functionality
    }
}