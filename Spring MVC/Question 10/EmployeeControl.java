package com.capgemini.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeControl {

	// getting the EXCEL VIEW
    @RequestMapping("/excel.html")
    public ModelAndView toExcel(){
        List<EmployeeO> employeeList = Arrays.asList(
                new EmployeeO(1,"Rahul",70000),
                new EmployeeO(2,"Roy",60000),
                new EmployeeO(3,"Kartik",80000));

        ModelAndView modelAndView = new ModelAndView(new ExcelReportView());
        modelAndView.addObject("empList",employeeList);
        return  modelAndView;
    }
    
    // getting the PDF VIEW
    @RequestMapping("/pdf.html")
    public ModelAndView toPdf(){
        List<EmployeeO> employeeList = Arrays.asList(
        		 new EmployeeO(1,"Rahul",70000),
                 new EmployeeO(2,"Roy",60000),
                 new EmployeeO(3,"Kartik",80000));
        
        ModelAndView modelAndView = new ModelAndView(new PdfReportView());
        modelAndView.addObject("empList",employeeList);
        return  modelAndView;
    }

}
