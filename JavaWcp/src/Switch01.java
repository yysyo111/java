
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		// switch文：分岐処理の開始
		switch (val) {
		case 3:
			// case：値が3の場合にブロックを実行
		    System.out.println("よくできました！");
		    // break：switch文を終了する
		    break;
		case 2:
			// case：値が2の場合にブロックを実行
			System.out.println("ふつうでした！");
			// break：switch文を終了する
			break;
			// default：全てのcaseの値に一致しない場合にブロックを実行
		default:
			System.out.println("がんばろう！");
		}
	}
}

//構文
//switch (式（変数や値）){
//case 値:
//    ブロック(処理);
//    break;
//case 値:
//    ブロック(処理);
//    break;
//default:
//    ブロック(処理);
//}