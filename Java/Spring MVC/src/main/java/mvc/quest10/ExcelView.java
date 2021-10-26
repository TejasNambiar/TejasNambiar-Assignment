package mvc.quest10;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.setHeader("Content-Dispositoin", "attachment; filename=\"employees.xls\"");
		
		@SuppressWarnings("unchecked")
		List<Employee> list=(List<Employee>) model.get("employeeList");
		
		Sheet sheet= workbook.createSheet("Employee List");
		
		Row header= sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("NAME");
		header.createCell(2).setCellValue("SALARY");
				
		int rowNum=1;
		
		for(Employee emp: list) {
			Row row= sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(emp.getId());
			row.createCell(1).setCellValue(emp.getName());
			row.createCell(2).setCellValue(emp.getSalary());
		}
		
	}

}
