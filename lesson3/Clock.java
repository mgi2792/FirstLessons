package lesson3;

public class Clock {

	private int hour;
	private int minute;
	private int second;
	private boolean am;
	
	public void setHour(int h) {
		hour = (h > 0 && h < 24) ? h % 12 : 0;
		am = (hour == 0 || hour < 12) ? true : false;
	}
	public void setMinute(int m) {
		minute = (m > 0 && m < 60) ? m : 0;
	}
	public void setSecond(int s) {
		second = (s > 0 && s < 60) ? s : 0;
	}
	
	public Clock(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public Clock(int h, int m) {
		this(h,m,0);
	}
	public Clock(int h) {
		this(h,0,0);
	}
	public Clock() {
		this(0,0,0);
	}
	
	public void displayUSclock() {
		System.out.format("Time set - %02d:%02d:%02d %s", hour, minute, second, am?"AM":"PM");
	}
}
