package codecheck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeCheckOne {

	private static int lineNumber = 0;
	private static int head = 0;
	private static int tail = 0;
	private static boolean isFunctionBody = false;
	private static Map<Integer, String> lineCodeMap = new HashMap<Integer, String>();
	 
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\A\\TestCodeCheck.cpp")));
			String line = "";
			while ((line = br.readLine()) != null) {
				lineNumber++;
				if (isFunctionBody) {
					lineCodeMap.put(lineNumber, line); 
				}
				if (line.matches("^(void|bool|WORD32)\\b(.+)([^;])$")) {
//					lineCodeMap.put(lineNumber, line);
//					print("head : " + ++head + " : " + line);
					isFunctionBody = true;
				}
				if (line.startsWith("}") && line.endsWith("}")) {
//					print("tail : " + ++tail + " : " + line);;
					isFunctionBody = false;
				}
				
			}
//			print("head :" + head + "-----" + "tail :" + tail);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	
}
