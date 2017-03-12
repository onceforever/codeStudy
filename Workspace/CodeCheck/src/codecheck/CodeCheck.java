package codecheck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeCheck {
	
	public static void main(String[] args) {
		/*print("185abc2341b1013".replaceAll("[a-z]+", "-"));
		print("\\".matches("\\\\"));*/
		
		/*print("yangqing_1013@sina.com.cn".matches("^[\\w&&[^_]][\\w\\.]*@[\\w&&[^_]]+\\.com(.cn)?"));
		print("10193248@zte.com.cn".matches("^[\\w&&[^_]][\\w\\.]*@[\\w&&[^_]]+\\.com(.cn)?"));
		print("he.yuan-quan@zte.com.cn".matches("^[\\w&&[^_]][\\w\\.-]*@[\\w&&[^_]]+\\.com(.cn)?"));*/
		
		
		
		/*String str = "java Java JAVA jAVa I love javA, you hate JAva, abcdefg";
		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		StringBuffer buf = new StringBuffer();
		int count = 0;
		while (matcher.find()) {
			count++;
			if (count % 2  == 0) {
				matcher.appendReplacement(buf, "java");
			} else {
				matcher.appendReplacement(buf, "JAVA");
			}
		}
		matcher.appendTail(buf);
		print(buf);*/
		
		
		
		/*String str = "123aa--234vv--7893cc--";
		Pattern pattern = Pattern.compile("(\\d{3,5})([a-zA-Z]{2})(-{2})");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			print(matcher.group());
		}*/
		
		
		/*String  str = "WORD32 max(int, int)";
		print(str.matches("^(void|bool|WORD32)\\b(.+)([^;])$"));
		
		String str1 = "    RRM_CHECK_POINTER_VOID(ptaGetScellList);";
		Pattern pattern1 = Pattern.compile("^\\s*(RRM_CHECK_POINTER)(_WORD32|_VOID)?\\((\\w+)+\\);\\s*$");
		Matcher matcher1 = pattern1.matcher(str1);
		print(matcher1.find());
		while (matcher1.find()) {
			print(matcher1.group(3));
		}*/
		
		
		
		
//		print(str.matches("\\s+RRM_CHECK_POINTER(_VOID)|(_WORD32)?.+;$"));
//		print(str.matches("^\\s*RRM_CHECK_POINTER(_WORD32|_VOID)?\\((\\w)+\\);$"));
		
		/*String str1 = "void max(int a,int b, int c)        ";
		String str3 = "WORD32 findMaxNumber(   )    ";
		String str2 = "bool isMaxNumber(int a, int b          ";
		Pattern pattern = Pattern.compile("^(void|WORD32|bool)\\b\\s(\\w+)\\((.*)\\)\\s+");
		Pattern pattern = Pattern.compile("^(void|WORD32|bool)\\b\\s(\\w+)\\((.*)\\s+");
		Matcher matcher =pattern.matcher(str1);
		while (matcher.find())
			print(matcher.group(3).matches(""));*/
		
		
		/*String str1 = "int a, double *b, float &c, ptScellList *scellList";
		Pattern pattern = Pattern.compile("(\\w+\\*?)\\s(\\*\\w+)");
		Matcher matcher = pattern.matcher(str1);
		while (matcher.find()) {
			print(matcher.group(2).substring(1));
		}*/
		
		/*String paraList = "int a, double *b, float &f, char* &c, ptGetScellList &getScellList, PScell pScell";
		print(isHavePointerParas(paraList));
		print("一共" + getPointerPara(paraList).size() + "个指针参数----->" + getPointerPara(paraList));*/
		
		
		
		/*Set<String> hashSet1 = new HashSet<String>();
		Set<String> hashSet2 = new HashSet<String>();
		hashSet1.add("heyuanquan");
		hashSet1.add("zhanghang");
		hashSet1.add("heyuanquan");
		hashSet1.add("zhenghaoyue");
		hashSet1.add("zhanghang");
		
		hashSet2.add("heyuanquan");
		hashSet2.add("zhanghang");
		hashSet2.add("yanzunguang");
		
		print("hashSet1---->" + hashSet1.size() + "      " + "hashSet2---->" + hashSet2.size());
		print(hashSet1.equals(hashSet2));*/
		
		
		/*String str = "";
		print(str.isEmpty());*/
		
		
		
		String s = "int a, double b, float f";
		Pattern pattern = Pattern.compile("\\w+\\b\\s+\\w+");
		Matcher matcher = pattern.matcher(s);
		print(matcher.find());
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static List<String> getPointerPara(String paraList) {
		List<String> pointerParaList = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(\\w+\\*?)\\s(\\*\\w+)");
		Matcher matcher = pattern.matcher(paraList);
		
		while (matcher.find()) {
			pointerParaList.add(matcher.group(2).substring(1));
		}
		return pointerParaList;
	}
	
	/*public static boolean isHavePointerParas(String paraList) {
		Pattern pattern = Pattern.compile("(\\w+\\*?)\\s(\\*\\w+)");
		Matcher matcher = pattern.matcher(paraList);
		return matcher.find();
	}*/
}
