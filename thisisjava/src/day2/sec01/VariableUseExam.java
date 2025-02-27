package day2.sec01;

public class VariableUseExam {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		/*
		 * 변수명 작성
		 * 영문자, 숫자, _ ->단, 숫자가 맨앞올수는 없다.
		 * 변수명 첫글자는 소문자로 기입한다.
		 * 변수명은 소문자로 기입한다.*대신 두단어의 뒤에오는 첫글자는 대문자로 기입한다.
		 * int는 처음 변수를 선언할때 한번만 한다.
		 */
		//국어점수 -> korscore x
		//국어점수 -> korScore o(카멜표기법)
		//국어점수 -> kor_score (스네이크표기법)
		int totalMinute = (hour *60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}

}
