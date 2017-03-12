/*
 * 1 + 3 + 5 + ... + 99 = ?
 */
public class OddSum {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 99; i += 2) {
			sum = sum + i;
		}
		
		System.out.println("1 + 3 + 5 + ... + 99 = " + sum);
	}
}
