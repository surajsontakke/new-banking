package com.qa.Banking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());

		}
	}

	public String getAppliactionUrl() {
		String url = pro.getProperty("BaseUrl");
		return url;

	}
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;

	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;

	}

	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;

	}
	public String getFirefoxpath() {
		String firefox=pro.getProperty("firefox");
		return firefox;
	}
}
