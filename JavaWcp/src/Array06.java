
//従来
//public class Array06 {
//	public static void main(String[] args) {
//		int[] scores = {20, 30, 40, 50, 80};
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//	}
//}

//拡張for文で配列を回す
//for (要素の型 任意の変数名 : 配列変数名) {
//	処理
//}

//拡張for文
public class Array06 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}
	}
}
