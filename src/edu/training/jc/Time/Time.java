package edu.training.jc.Time;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
		
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}

		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}
	
	public void addTime(int hour, int minute, int second) {
		this.hour += hour;
		if (this.hour < 0 || this.hour > 23) {
			this.hour = 0;
		}
		
		this.minute += minute;
		if (this.minute < 0 || this.minute > 59) {
			this.minute = 0;
		}
		
		this.second += second;
		if (this.second < 0 || this.second > 59) {
			this.second = 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Время: %02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	
	public static void main(String[] args) {
		Time t = new Time(0, 0, 0);
		
		System.out.println(t.toString());
		
		t.addTime(24, 60, 60);
		
		System.out.println(t.toString());
		
	}
	
}
