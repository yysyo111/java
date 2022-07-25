
public class Chapter15_1 {
	public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

	 // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
        // b(余り)が0になった時のaが最大公約数
        if (b == 0) {
            return a;
        }
        // 再帰呼び出し
        return gcd(b, a % b);
    }
}


//1回目のgcdメソッドの引数は「a = 976」「b = 427」になります。
//「if (b == 0) 」が「false」なので、「return gcd(b, a % b);」で自分自身を呼び出し（再帰呼び出し）します。
//
//2回目のgcdメソッドの引数は「a = 427」「b = 122 (976 % 427)」になります。
//まだ、「if (b == 0) 」が「false」なので、再帰呼び出しします。
//
//3回目のgcdメソッドの引数は「a = 122」「b = 61 (427 % 122)」で呼び出されます。
//まだ、「if (b == 0) 」が「false」なので、再帰呼び出しします。
//
//4回目のgcdメソッドの引数は「a = 61」「b = 0 (122 % 61)」で呼び出されます。
//「if (b == 0) 」が「true」なので、「a = 61」を「return」して再帰処理を終了します。