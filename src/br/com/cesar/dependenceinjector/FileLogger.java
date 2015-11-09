package br.com.cesar.dependenceinjector;

import java.io.*;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FileLogger implements ILogger {

	@Override
	public void print(String s) {
		try{
			File statText = new File("log.txt");
	        FileOutputStream is = new FileOutputStream(statText);
	        OutputStreamWriter osw = new OutputStreamWriter(is);    
	        Writer w = new BufferedWriter(osw);
	        w.write(s);
	        w.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
