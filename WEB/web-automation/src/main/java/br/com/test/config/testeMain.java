package br.com.test.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class testeMain {
	
	private Properties properties = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    testeMain pDemo = new testeMain();
	    pDemo.loadPropertiesFile();
	    pDemo.readProperties();

	}
	
	// This method is used to load the properties file
	  private void loadPropertiesFile(){
	    InputStream iStream = null;
	      try {
	        // Loading properties file from the path (relative path given here)
	        iStream = new FileInputStream("src/main/resources/conf/general.properties");   
	        properties.load(iStream);
	      } catch (IOException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();
	      }finally {
	        try {
	          if(iStream != null){
	            iStream.close();
	          }
	        } catch (IOException e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();
	        }
	      }
	    }
	  
	  /**
	  * Method to read the properties from a
	  * loaded property file
	  */
	  private void readProperties(){
	    System.out.println("TimeOUT - " + properties.getProperty("timeout"));
	    System.out.println("URL - " + properties.getProperty("url.hml"));
	  }

}
