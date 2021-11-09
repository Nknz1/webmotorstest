package br.com.test.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {

	private static Properties properties = new Properties();

	public static Properties getConfiguration() {
		InputStream iStream = null;
		try {
			iStream = new FileInputStream("src/main/resources/conf/general.properties");
			properties.load(iStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (iStream != null) {
					iStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return properties;
	}

}
