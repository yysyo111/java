//
//public class practice3_5 {
//	public static void main(String[] args) {
//		System.out.println("[メニュー]1：検索 2：登録 3：削除 4：変更>");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		if (selected == 1) {
//			System.out.println("検索します");
//		} else if (selected == 2) {
//			System.out.println("登録します");
//		} else if (selected == 3) {
//			System.out.println("削除します");
//		} else if (selected == 4) {
//			System.out.println("変更します");
//		} else {
//			System.out.println("1~4でお選びください");
//		}
//	} 
//}

public class practice3_5 {
	public static void main(String[] args) {
		System.out.println("[メニュー]1：検索 2：登録 3：削除 4：変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		    case 1:
		    	System.out.println("検索します");
		    	break;
		    case 2:
		    	System.out.println("登録します");
		    	break;
		    case 3:
		    	System.out.println("削除します");
		    	break;
		    case 4:
		    	System.out.println("変更します");
		    	break;
		}
	} 
}
