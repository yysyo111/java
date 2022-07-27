//
//public class Switch02 {
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(4);
//		fortune++;
//		switch(fortune) {
//			case 1:
//				System.out.println("大吉");
//				break;
//
//			case 2:
//				System.out.println("中吉");
//				break;
//			
//			case 3:
//				System.out.println("吉");
//				break;
//
//			default:
//				System.out.println("凶");
//				break;
//		}
//	}
//}

//breakなし
public class Switch02 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch(fortune) {
			case 1:
			case 2:
				System.out.println("いいね！");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4:
			case 5:
				System.out.println("うーーん");
		}
	}
}
