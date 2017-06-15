package com.java.cxf.soap.ws;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FileUpload {
	
	@WebMethod
	public void uploadFile(DataHandler attachmentInfo) {
	  try {
		  
		  InputStream inputStream = attachmentInfo.getInputStream();
		  
		  FileOutputStream fileOutputStream = new FileOutputStream(new File("c://data//downloaded//test.jpg"));
		  
		  byte[] b = new byte[10000];
		  int byteRead = 0;
		  while ((byteRead = inputStream.read(b)) != -1) {
			  fileOutputStream.write(b, 0, byteRead);
		  }
		  fileOutputStream.close();
		  inputStream.close();
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  } 
	}
	
	@WebMethod
	public DataHandler downloadFile() {
		DataSource ds = new FileDataSource(new File("c://data//test.jpg"));
		return new DataHandler(ds );
	}

}
