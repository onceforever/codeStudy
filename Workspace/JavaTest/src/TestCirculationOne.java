/*
 * ���0��100֮��ǰ����ܸ�3��������
 */
public class TestCirculationOne {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 5 == 0) {
				
				System.out.println(i);
				count++;
			}
			
			if (count == 5) {
				break;
			}
		}
	}
}
