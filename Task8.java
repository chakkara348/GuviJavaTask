package SeleniumProjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task8 {

	// Method for write a excel
	public static void writeExcel() throws IOException {
		// Declare a workbook
		XSSFWorkbook myWorkbook = new XSSFWorkbook();

		// Create a sheet1 on the excel sheet
		XSSFSheet mySheet = myWorkbook.createSheet("sheet1");

		// Create a column on the sheet1
		XSSFRow columnRow = mySheet.createRow(0);
		columnRow.createCell(0).setCellValue("Name");
		columnRow.createCell(1).setCellValue("Age");
		columnRow.createCell(2).setCellValue("Email");

		// Create a first row value on the sheet1
		XSSFRow firstRow = mySheet.createRow(1);
		firstRow.createCell(0).setCellValue("John Doe");
		firstRow.createCell(1).setCellValue(30);
		firstRow.createCell(2).setCellValue("john@test.com");

		// Create a Second row value on the sheet1
		XSSFRow secondRow = mySheet.createRow(2);
		secondRow.createCell(0).setCellValue("Jane Doe");
		secondRow.createCell(1).setCellValue(28);
		secondRow.createCell(2).setCellValue("john@test.com");

		// Create a third row value on the sheet1
		XSSFRow thirdRow = mySheet.createRow(3);
		thirdRow.createCell(0).setCellValue("Bob smith");
		thirdRow.createCell(1).setCellValue(35);
		thirdRow.createCell(2).setCellValue("jacky@example.com");

		// Create a fourth row value on the sheet1
		XSSFRow fourthRow = mySheet.createRow(4);
		fourthRow.createCell(0).setCellValue("Swapnil");
		fourthRow.createCell(1).setCellValue(37);
		fourthRow.createCell(2).setCellValue("swapnil@example.com");

		// creating ouput excel file
		FileOutputStream fileOut = new FileOutputStream(new File("FileOperations.xlsx"));

		// write the workbook data to excel
		myWorkbook.write(fileOut);

		System.out.println("The excel created successfully");

	}

	// Method for read a excel
	public static void readExcel() throws IOException {

		// Declare the file input stream
		FileInputStream fileInput = new FileInputStream(
				"C:\\Users\\cmurugan\\eclipse-workspace\\GuviLearningProjects\\FileOperations.xlsx");
		// Declare the workbook to read
		Workbook myWorkbook = new XSSFWorkbook(fileInput);

		// Declare a sheet to read
		Sheet mySheet = myWorkbook.getSheet("Sheet1");

		//Read the data on the sheet and display it
		System.out.println();
		System.out.println("The Data on the excel sheet:");
		for (Row row : mySheet) {
			System.out.println();
			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + " ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " ");
					break;
				default:
					break;
				}
			}
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Calling writeExcel method
		writeExcel();
		//calling readExcel method
		readExcel();

	}

}
