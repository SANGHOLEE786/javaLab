package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar();//자동형변환
		
		int year= now.get(Calendar.YEAR);
		
		/*
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY;
		strWeek = "월";
		break;
		case Calendar.TUESDAY;
		strWeek = "화";
		break;
		case Calendar.WEDNESDAY;
		strWeek = "수";
		break;
		case Calendar.THURSDAY;
		strWeek = "목";
		break;
		case Calendar.FRIDAY;
		strWeek = "금";
		break;
		case Calendar.SATURDAY;
		strWeek = "토";
		break;
		case Calendar.SUNDAY;
		strWeek = "일";
		break;
		}
			*/
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm==Calendar.AM){
				strAmPm = "오전";	
			}else {
				strAmPm = "오후";
			}
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
	
		System.out.println(year+"년");
		/*월
		일
		요일
		시
		분
		초*/
		
				
				
				
	}

}
