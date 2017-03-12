package codecheck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCodeCheck {
	
	public static List<Function> getFunctionListFromFile(String filePath) {
		int lineCount = 0;
		boolean isFunctionLineOne = false;
		boolean isFunctionLineTwo = false;
		boolean isFunctionBody = false;
		List<Function> functions = new ArrayList<Function>();
		Pattern patternFunctionHeadOne = Pattern.compile("^(void|WORD32|bool)\\b\\s(\\w+)\\((.*)\\)\\s+");
		Pattern patternFunctionHeadTwo = Pattern.compile("^(void|WORD32|bool)\\b\\s(\\w+)\\((.*)\\s+");
		Matcher matcher;
		int num = 0;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				lineCount++;
				if ((matcher = patternFunctionHeadOne.matcher(line)).find() || isFunctionLineOne) {
					isFunctionLineOne = true;
					num = lineCount;
					Function tempFunction = Function.createInstance();
					tempFunction.name = matcher.group(2);
					tempFunction.locateLineNum = num;
					
					if (line.startsWith("{") || isFunctionBody) {
						isFunctionBody = true;
						tempFunction.functionBody.add(line);
						
						if (line.startsWith("}")) {
							isFunctionBody = false;
							isFunctionLineOne = false;
							functions.add(tempFunction);
						}
					}
				}
				else if ((matcher = patternFunctionHeadTwo.matcher(line)).find()) {
					isFunctionLineTwo = true;
				}
 			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return functions;
	}
	
	
	public static void main(String[] args) {
		List<Function> functions = new ArrayList<Function>();
		functions = getFunctionListFromFile("E:\\A\\TestCodeCheck.cpp");
		print(functions.size());
		
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	
	
}
