package java01;

class Score{
	private int kor;
	private int math;
	private int computer;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public Score() {
		this(0,0,0);
	}
	public Score(int kor, int math, int computer) {
		super();
		this.kor = kor;
		this.math = math;
		this.computer = computer;
	}
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", math=" + math + ", computer=" + computer + "]";
	}
}
class Student{
	private String name;
	private int grade;
	private Score score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		score.getKor();
		score.getMath();
		score.getComputer();
		this.score.setKor(score.getKor());
		this.score.setMath(score.getMath());
		this.score.setComputer(score.getComputer());
		
	}
	public Student() {
		name = "noname";
		grade = 0;
		score = new Score();
	}
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		score = new Score();
		
	}
	public Student(String name, int grade, Score score) {
		super();
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}
}
public class e19_StudentTest {
	public static void main(String[] args) {
		Score ss1 = new Score(100,100,100);
		Student s1 = new Student("Han",3);
		System.out.println(ss1);
		System.out.println(s1);
		s1.setScore(ss1);
		System.out.println(s1);
		ss1.setKor(90);
		ss1.setMath(100);
		ss1.setComputer(95);
		System.out.println(ss1);
		System.out.println(s1);
	}
}
//생성자가 아무것도 정의되어 있지 않으면 기본생성자 실행시 컴파일러가 기본생성자 생성