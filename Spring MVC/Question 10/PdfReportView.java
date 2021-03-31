package com.capgemini.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

// for PDF
public class PdfReportView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<EmployeeO> employeeList=(List<EmployeeO>) model.get("empList");
		/*
		 * PdfTable table= new PdfTable(3);
		 * table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		 * table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		 */
		Table table = new Table(3);
        table.addCell("Employee ID");
        table.addCell("Employee Name");
        table.addCell("Employee Salary");

        // getting the data and inserting into the cell
        for(EmployeeO employee:employeeList){
            Integer id = employee.getId();
            Float salary = employee.getSalary();
            table.addCell(id.toString());
            table.addCell(employee.getName());
            table.addCell(salary.toString());
        }
        document.add(table);
	}

}
