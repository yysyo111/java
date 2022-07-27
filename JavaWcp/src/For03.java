
public class For03 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out .println("現在" + (i + 1) + "周目");
		}
	}
}
//
//①初期化処理：int i = 0
//②繰り返し処理：i < 10
//③繰り返し時処理：i++
//ループ変数の注意点
//・ループ変数の名前は自由
//・ブロック内で利用可能
//・ブロック外では利用不可

//for (int i = 1; i < 10; i++) {　ループ変数を1からスタートする
//for (int i = 0; i < 10; i += 2) {　ループ変数を２ずつ増やしていく
//for (int i = 10; i > 0; i--) {　ループ変数10から1ずつ1まで減らしてく
//for (; i < 10; i++) {　ループ変数初期化しない
//for (int i = 0; i < 10) {　繰り返し処理使わない