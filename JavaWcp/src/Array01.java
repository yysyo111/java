
public class Array01 {
	public static void main(String[] args) {
		int[] scores = new int[5];
//		int num = scores.length;
//		System.out.println("要素の数" + num);
		scores[1] = 30;
		System.out.println(scores[1]);
	}
}

//配列作成と初期化の省略記法
//要素の型[] 配列変数名 = new 要素の型[] {値1, 値2, 値3, ・・・・};
//int[] scores1 = new int[] {20, 30, 40, 50, 80};
//要素の型[] 配列変数名 = {値1, 値2, 値3, ・・・・};
//int[] scores2 = {20, 30, 40, 50, 80};