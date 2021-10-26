package mvc.quest11;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		response.setHeader("Content-Dispositoin", "attachment; filename=\"employees.pdf\"");
		
		@SuppressWarnings("unchecked")
		List<Employee> list=(List<Employee>) model.get("employeeList");
		
		Table table= new Table(3);
		table.addCell("ID");
		table.addCell("NAME");
		table.addCell("SALARY");
		
		for(Employee emp: list) {
			table.addCell(String.valueOf(emp.getId()));
			table.addCell(emp.getName());
			table.addCell(String.valueOf(emp.getSalary()));
		}
		document.add(table);
	}
	
}
