/*
 * ���101��200֮�������
 */
public class TestCirculationTwo {
	public static void main(String[] args) {
		
		for (int i = 101; i <= 200; i++) {
			
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int num) {
		
		for(int i = 2; i < num; i ++) {
			
			if (num % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
}
