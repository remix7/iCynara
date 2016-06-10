package com.icynara.cfg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 管理配置信息  读取配置信息
 * @author liutao-REMIX 
 *
 */
public class Configuration {
	private static int pageSize = 3;
	
	public static int getPageSize() {
		return pageSize;
	}
	
	public static void setPageSize(int pageSize) {
		Configuration.pageSize = pageSize;
	}
	private static InputStream in;
	static{
		try {
			in = Configuration.class.getClassLoader().getResourceAsStream("default.properties");
			Properties props = new Properties();
			props.load(in);
			pageSize =Integer.parseInt(props.getProperty("pageSize"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
