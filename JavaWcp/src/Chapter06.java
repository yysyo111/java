
public class Chapter06 {
	public static void main(String[] args) {
//		変数「val」を算術演算子の「+」で計算した結果で初期化
		int val = 2 + 5;
		System.out.println(val);
		
//		「val」をインクリメント（後置）
		val++;
		System.out.println(val);
		
//		代入演算子の「*=」を使用して、変数「val」に「5」を掛けた値を代入
		val *= 5;
		System.out.println(val);
		
//		「bool」変数に、関係演算子の「==」を使用して、「valは50と等しい」の結果を代入
		boolean bool = (val == 50);
		System.out.println(bool);
		
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}

