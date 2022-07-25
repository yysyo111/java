package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
    public static void main(String[] args) {
    	// MobilePhoneインスタンスを生成
        MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
        
        // Phoneインターフェースのフィールド（定数）を参照
        System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
        // Phoneインターフェースの抽象メソッドを実装したメソッドを呼び出し
        mobilePhone.call("99-8888-7777");
        // classTakePictureメソッドの呼び出し
        Interface01.classTakePicture(mobilePhone);
    }

    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
}

//インターフェース基本構文
//[public] interface インターフェース名 extends インターフェース名, インターフェース名 {
//    // フィールドの宣言（定数）
//    (public static final) 定数の型 定数名 = 初期値;
//    // メソッドの宣言（抽象メソッド）
//    (public abstract) 戻り値の型 メソッド名(引数);
//}


//クラスによるインターフェース実装の基本構文
//修飾子 class クラス名 implements インターフェース名, インターフェース名 {
//    // インターフェースを実装したメソッドなど
//}