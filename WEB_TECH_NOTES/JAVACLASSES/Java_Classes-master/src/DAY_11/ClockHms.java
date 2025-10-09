package DAY_11;

public class ClockHms {

	private int hr;
	private int min;
	private int sec;
	
	public ClockHms(int hr, int min, int sec) {
		if((hr>=0 && hr<=24) && (min>=0 && min<60) &&(sec>=0 && sec<60)){
			 this.hr = hr;
			 this.min= min;
			 this.sec = sec;
		}
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public void showTime() {
		System.out.println(hr+" "+ min + " "+ sec);
	}
	
}
