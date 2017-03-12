import java.util.ArrayList;

public class TestPerm {

	public static void permutation(int[] ss, int i) {
		if (ss == null || i < 0 || i > ss.length) {
			return;
		}
		if (i == ss.length) {
			System.out.println(ss.toString());
		} else {
			for (int j = i; j < ss.length; j++) {
				int temp = ss[j];// 交换前缀,使之产生下一个前缀
				ss[j] = ss[i];
				ss[i] = temp;
				permutation(ss, i + 1);
				temp = ss[j]; // 将前缀换回来,继续做上一个的前缀排列.
				ss[j] = ss[i];
				ss[i] = temp;
			}
		}
	}

	public static void main(String args[]) {
		int[] ss = {1, 2};
		permutation(ss, 0);
	}

	/*
	 * private int total = 0; private ArrayList arrangeList = new ArrayList();
	 * 
	 * public TestPerm() { }
	 * 
	 * private void swap(String list[], int k, int i) { String c3 = list[k];
	 * list[k] = list[i]; list[i] = c3; }
	 * 
	 * public void perm(String list[], int k, int m) { if (k > m) { StringBuffer
	 * sb = new StringBuffer(); for (int i = 0; i <= m; i++) {
	 * sb.append(list[i]).append(","); } if (sb.length() > 0) {
	 * sb.setLength(sb.length() - 1); } arrangeList.add(sb.toString()); total++;
	 * } else { for (int i = k; i <= m; i++) { swap(list, k, i); perm(list, k +
	 * 1, m); swap(list, k, i); } } }
	 * 
	 * public int getTotal() { return total; }
	 * 
	 * public ArrayList getArrangeList() { return arrangeList; }
	 * 
	 * public static void main(String args[]) { String list[] = { "1", "2", "3"
	 * }; TestPerm ts = new TestPerm(); ts.perm(list, 0, list.length - 1); for
	 * (int i = 0; i < ts.getArrangeList().size(); i++) {
	 * System.out.println(ts.getArrangeList().get(i)); }
	 * System.out.println("total:" + ts.total); }
	 */

}
