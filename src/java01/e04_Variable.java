package java01;

public class e04_Variable {
		public static void main(String[] args) {
			
		 //데이터 타입 - 기본 타입 정수형 문자형 실수형 논리형
			 
			int i = 26; // 10진수로 26을 표현
			int oi = 032; // 8진수로 26을 표현
			int xi = 0x1a; // 16진수로 26을 표현

			System.out.println(i);
			System.out.println(oi);
			System.out.println(xi);

			// long : 부호가 있는 정수 64bit로 정수를 저장
			long lightspeed;
			long distance;

			lightspeed = 300000L;
			distance = lightspeed * 365 * 24 * 60 * 60;
			System.out.println("빛이 1년동안 가는거리 : " + distance + "km");

			// 실수형
			// float : 32bit (7개 정도의 유효숫자 표현)
			// double : 64bit (15개 정도의 유효숫자 표현)

			// float
			 float rad, area; 
			 float PI = 3.141592F;// 자바는 실수의 기본타입을 double.  float을 사용하고싶다면 실수리터럴에 f/F를 붙여줌
			 rad = 5; 
			 System.out.println(rad * rad * PI);
			
			 // double
			 double r1 = 1.23e2;//지수표기법 가능 e2 -> 10^2
			 double r2 = 1.23e-2;//지수표기법 가능 e2 -> 1/10^2
			 System.out.println(r1);
			 System.out.println(r2);
			
			 //논리형
			 // boolean : 참인지 거짓인지를 판단, 결과값 : true/ false
			 boolean condition = true;
			 
			 boolean b;
			 b = true; //직접 true값을 지정
			 System.out.println("b : " + b);	 
			 b = 1 > 2; //비교연산을 해서 결과 값으로 boolean형 데이터 false를 얻음
			 System.out.println("b : " + b);
			 
			 //문자형
			 char c;
			 c = 'A';
			 System.out.println(c);
			 c = 65; //10진수로 저장
			 System.out.println(c);
			 c = '\u0041'; //16진수로 저장
			 System.out.println(c);
			 	
			 //문자열
			 String s = "hello";
			 System.out.println(s); 
			 //문자열끼리 + 는 문자열을 결합함
			 System.out.println(s + s);
			 	
		
	}



}
