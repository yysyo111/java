
//public class Array03 {
//	public static void main(String[] args) {
//		int[] scores = {20, 30, 40, 50, 80};
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		int avg = sum / scores.length;
//		System.out.println("合計点数:" + sum);
//		System.out.println("平均点:" + avg);
//	}
//}

//ループに入る前に、集計結果を入れるための変数sumを0で初期化

//50点以上の科目を調べる
public class Array03 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
	}
}
