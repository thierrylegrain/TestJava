package adrien_test;

public class Test1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.println("Hello Adrien " + "fromage");
				break;
			case 2:
				System.out.println("Hello Adrien " + "saucisson");
				break;
			case 3:
				System.out.println("Hello Adrien " + "olive");
				break;
			case 4:
				System.out.println("Hello Adrien " + "camembert");
				break;
			default:
				System.out.println("Hello Adrien " + i);
				break;
			}
		}
		
	}
}
