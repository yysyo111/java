package extend.phone;

//Phone, Cameraインターフェースを実装したMobilePhoneクラスの宣言
public class MobilePhone implements Phone, Camera {
    private String number;

    public MobilePhone(String number) {
        this.number = number;
    }
    
    // Cameraインターフェースのメソッドを実装
    public void takePicture() {
        System.out.println("写真をとります。");
    }
    
    // Phoneインターフェースのメソッドを実装
    public void call(String number) {
        System.out.println(this.number + " から " + number + " に電話をかけます。");
    }
}

//インターフェースのインスタンス生成
//SampleClass sampleClass = new SampleClass();
////アップキャスト
//SampleInterface upCastInterface = sampleClass;
////ダウンキャスト
//SampleClass downCastClass = (SampleClass) upCastInterface;
