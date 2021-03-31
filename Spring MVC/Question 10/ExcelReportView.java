package com.capgemini.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

// for EXCEL
public class ExcelReportView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "attachment;filename=\"users.xls\"");
        
		@SuppressWarnings("unchecked")
		List<EmployeeO> employeeList =(List<EmployeeO>) model.get("empList");
        Sheet sheet = workbook.createSheet("Employee Data");
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Employee ID");
        header.createCell(1).setCellValue("Employee Name");
        header.createCell(2).setCellValue("Employee Salary");

        // setting the value for each cell in the row
        int rowNum = 1;
        for(EmployeeO emp:employeeList){
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(emp.getId());
            row.createCell(1).setCellValue(emp.getName());
            row.createCell(2).setCellValue(emp.getSalary());
        }
	}
}