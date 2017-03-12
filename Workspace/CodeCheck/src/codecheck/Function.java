package codecheck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {

	public String name;
	public int locateLineNum;
	public int totalLines;
	public String parameters;
	public boolean isHavePara = false;
	public List<String> functionBody = new ArrayList<String>();

	public static Function createInstance() {
		return new Function();
	}

	/*
	 * public void checkPointer1(Function function) { Pattern pattern =
	 * Pattern.compile(
	 * "^\\s*(RRM_CHECK_POINTER)(_WORD32|_VOID)?\\((\\w+)+\\);\\s*$"); Matcher
	 * matcher; Set<String> paraSet = new HashSet<String>(); for (SingleLineCode
	 * singleLineCode : functionBody) { matcher =
	 * pattern.matcher(singleLineCode.code); while (matcher.find()) { if
	 * (!(paraSet.add(matcher.group(3)))) { print("RRM_CHECK_POINTER error at :"
	 * + singleLineCode.lineNumber); return; }
	 * 
	 * } } }
	 */

	public Set<String> getPointerCheckSentences() {
		Set<String> pointerCheckeSentenceSet = new HashSet<String>();
		Pattern pattern = Pattern.compile("^\\s*(RRM_CHECK_POINTER)(_WORD32|_VOID)?\\((\\w+)+\\);\\s*$");
		Matcher matcher;
		for (String temp : functionBody) {
			matcher = pattern.matcher(temp);
			if (matcher.find())
				pointerCheckeSentenceSet.add(matcher.group(3));
		}
		return pointerCheckeSentenceSet;
	}

	/*
	 * public boolean isHavePointerParas() { Pattern pattern =
	 * Pattern.compile("(\\w+\\*?)\\s(\\*\\w+)"); Matcher matcher =
	 * pattern.matcher(paraList); return matcher.find(); }
	 */

	public void pointerCheck() {
		if (this.getPointerParas().equals(this.getPointerCheckSentences()))
			print("function : " + this.name + " pointer parameter check SUCCESSFULLY, at line :" + this.locateLineNum);
		else
			print("function : " + this.name + " pointer parameter check FAILED, at line :" + this.locateLineNum);
	}

	public Set<String> getPointerParas() {

		Set<String> pointerParaListSet = new HashSet<String>();
		Pattern pattern = Pattern.compile("(\\w+\\*?)\\s(\\*\\w+)");
		Matcher matcher = pattern.matcher(parameters);

		while (matcher.find()) {
			pointerParaListSet.add(matcher.group(2).substring(1));
		}

		return pointerParaListSet;
	}

	private void print(String string) {
		System.out.println(string);
	}

	/*class SingleLineCode {
		private int lineNumber;
		private String code;
	}*/

	/*class Parameter {
		private String type;
		private String identifier;

		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			else {
				if (obj instanceof Parameter) {
					Parameter para = (Parameter)obj;
					if (type.equals(para.type) && identifier.equals(para.identifier))
						return true;
				} 
			}
			return false;
		}

		@Override
		public String toString() {
			return type + " " + identifier;
		}

	}*/
}
