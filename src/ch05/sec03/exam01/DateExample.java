package ch05.sec03.exam01;

import java.util.Calendar; // java.util에서 클래스 import 필요
import java.util.Date; // Date도 마찬가지

public class DateExample {

	public static void main(String[] args) {
		// 날짜 다루는 클래스 : Data (util.Data, sql.Data), Calendar(java.util.calendar)
		Date today = new Date();
		System.out.println(today.toString());
		System.out.println(today.getDay());//deprecated된 것이라 부른다. 권장하지 않음을 의미
		System.out.println(today.getDate());
		
		Calendar calendar = Calendar.getInstance();// new를 사용해 객체 생성하지 않는다
		System.out.println(calendar.get(Calendar.DATE));//28일
		System.out.println(calendar.get(Calendar.YEAR));//2022년
		System.out.println(calendar.get(Calendar.MONTH)+1); // 1월을 0으로 표현한다
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//일 월 화 수 목 금 토 순서 (1~7)
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		
	}

}
