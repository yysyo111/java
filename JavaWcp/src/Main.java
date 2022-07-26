
//public class Main {
//	public static void main(String[] args) {
////		変数宣言の文(ageという箱を用意)
//		int age;
////		箱に数字の「30」を入れる
//		age = 30;
////		箱の中身を表示
//		System.out.println(age);
//	}
//}

//変数宣言の文
//型 変数名;

//public class Main {
//	public static void main(String[] args) {
//		int age = 20;
//		System.out.println("私の年齢は" + age);
//		
//		age = 31;
//		System.out.println("・・・いや、本当の年齢は" + age);
//	}
//}

public class Main {
	public static void main(String[] args) {
		final double PI = 3.14;
		int pie = 5;
		
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径の倍にします");
//		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}
}

//定数の定義
//final 型 定数名 = 初期値;
//定数名は大文字