package extend.human;

public class Human {
	// privateは自分自身からのみアクセス可能
	private String name;
	// protectedはサブクラスからもアクセス可能
	protected int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
} 

//
//final修飾子が指定されたクラスは継承が禁止
////final修飾子を指定
//final public class Human {
//}
//
////Humanが継承禁止のため、コンパイルエラー
//final public class Employee extends Human {
//}