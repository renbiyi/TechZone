package cn.ediary.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class JsonUtil {

	public static void printJson(HttpServletResponse response,String content){
    	try {
			response.setContentType("text/html;charset=UTF-8"); 
			response.getWriter().print(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
