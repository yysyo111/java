package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	
	private int minutes;
	
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	
	 public void call(String number) {
		 System.out.println(number + "に、電話します。通話できているのは飛んでいる間だけです");
	 }
	 
	 public void fly() {
		 System.out.println(minutes + "分間、飛びます。");
	 }
	 
     public void powerOff() {  
        Flying.super.powerOff();
     }
}