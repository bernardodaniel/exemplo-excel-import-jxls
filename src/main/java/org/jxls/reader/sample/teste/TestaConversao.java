package org.jxls.reader.sample.teste;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.jxls.reader.sample.Department;
import org.xml.sax.SAXException;

public class TestaConversao {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("configuracao.xml");
			InputStream inputXML = 
					new BufferedInputStream(is);
			
			XLSReader mainReader = ReaderBuilder.buildFromXML( inputXML );
			
			InputStream arquivoXLS = new FileInputStream("departmentdata.xls");
			InputStream inputXLS = new BufferedInputStream(arquivoXLS);
			
			Department department = new Department();
		    List departments = new ArrayList();
		    Map beans = new HashMap();
		    beans.put("department", department);
		    beans.put("departments", departments);
		    
		    XLSReadStatus readStatus = mainReader.read( inputXLS, beans);
			
			System.out.println("sucesso");
			
		} catch (IOException | SAXException | InvalidFormatException e) {
			e.printStackTrace();
		}
		
		
	}

}
