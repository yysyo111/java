//
//public class While02 {
//	public static void main(String[] args) {
//		int temp = 40;
//		while (temp > 25) {
//			temp--;
////			System.out.println((temp) + "°");
//			System.out.println((temp) + "°です。" + "温度を一度下げました");
//		}
//	}
//}

//do-while文
public class While02 {
	public static void main(String[] args) {
		int temp = 25;
		do {
			temp--;
//			System.out.println((temp) + "°");
			System.out.println((temp) + "°です。" + "温度を一度下げました");
		} while (temp > 25);
	}
}