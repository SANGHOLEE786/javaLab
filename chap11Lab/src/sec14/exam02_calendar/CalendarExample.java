package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar();//�ڵ�����ȯ
		
		int year= now.get(Calendar.YEAR);
		
		/*
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY;
		strWeek = "��";
		break;
		case Calendar.TUESDAY;
		strWeek = "ȭ";
		break;
		case Calendar.WEDNESDAY;
		strWeek = "��";
		break;
		case Calendar.THURSDAY;
		strWeek = "��";
		break;
		case Calendar.FRIDAY;
		strWeek = "��";
		break;
		case Calendar.SATURDAY;
		strWeek = "��";
		break;
		case Calendar.SUNDAY;
		strWeek = "��";
		break;
		}
			*/
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm==Calendar.AM){
				strAmPm = "����";	
			}else {
				strAmPm = "����";
			}
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
	
		System.out.println(year+"��");
		/*��
		��
		����
		��
		��
		��*/
		
				
				
				
	}

}
