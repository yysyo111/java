package extend.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、でテストの点数は" + this.score + "点です";
		return profile;
	}
}

//継承するクラスの基本構文
//修飾子 class クラス名 extends スーパークラス名 {
//    // サブクラスの処理
//}