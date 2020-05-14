package io.firstapp.springbootstarter.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.nimbusds.openid.connect.sdk.util.Resource;

import io.firstapp.springbootstarter.entity.Employee;
import io.firstapp.springbootstarter.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/getAllEmployeeList", method=RequestMethod.GET)
	public List<Employee> getAll(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/getAllEmployeeListByFirstName", method=RequestMethod.GET)
	public List<Employee> getAllEmployeeByFirstName(String fname){
		return employeeService.getAllEmployeesByFirstName(fname);
	}
	
	@RequestMapping(value="/getEmployeeById", method=RequestMethod.GET)
	public Employee getEmployeeById(Integer id){
		return employeeService.getAllEmployeeByID(id);
	}
	
//	@RequestMapping(path = "/download_excel", method = RequestMethod.GET)
//	public ResponseEntity<Resource> download(String fileName) throws IOException {
//
//	ByteArrayResource resource = fooService.export(fileName);
//
//	return ResponseEntity.ok()
//	        .headers(headers) // add headers if any
//	        .contentLength(resource.contentLength())
//	        .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
//	        .body(resource);
//	}
	
	
	
	@RequestMapping(value = "/test2.xlsx",  method=RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	byte[] testDown() throws IOException, InvalidFormatException {
	    Workbook workbook = new SXSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	    for (int i = 0; i < 60000; i++) {
	        Row newRow = sheet.createRow(i);
	        for (int j = 0; j < 100; j++) {
	            newRow.createCell(j).setCellValue("test" + Math.random());
	        }
	    }
	    ByteArrayOutputStream os = new ByteArrayOutputStream();
	    workbook.write(os);
	    byte[] bytes = os.toByteArray();
	    return bytes;
	}

	
	@RequestMapping(value = "/xlsx",  method=RequestMethod.GET)
	@ResponseBody
	public void generateExcel()
		      throws IOException
		    { 
		  
		        // Creating Workbook instances 
		        Workbook wb = new HSSFWorkbook(); 
		  
		        // An output stream accepts output bytes and sends them to sink. 
		        OutputStream fileOut = new FileOutputStream("F:\\SprintBootApplication\\Files\\Geeks.xls"); 
		          
		        // Creating Sheets using sheet object 
		        Sheet sheet1 = wb.createSheet("Array"); 
//		        Sheet sheet2 = wb.createSheet("String"); 
//		        Sheet sheet3 = wb.createSheet("LinkedList"); 
//		        Sheet sheet4 = wb.createSheet("Tree"); 
//		        Sheet sheet5 = wb.createSheet("Dynamic Programing"); 
//		        Sheet sheet6 = wb.createSheet("Puzzles"); 
		        Row newRow = sheet1.createRow(0);
		        for (int j = 0; j < 100; j++) {
		            newRow.createCell(j).setCellValue("test" +j);
		        }
		  
		        System.out.println("Sheets Has been Created successfully"); 
		  
		        wb.write(fileOut); 
		        fileOut.close();
		        
		        
		    } 
	
}
