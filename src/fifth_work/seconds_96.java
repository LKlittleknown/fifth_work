package fifth_work;

import java.util.*;

public class seconds_96 {

	private long startTime, endTime;
	
	public seconds_96() {
		Date date=new Date();
		startTime=date.getTime();
	}
	
	public void start() {
		this.startTime = startTime;
	}
	public void Stop(long endTime) {
		this.endTime=endTime;
	}
	
	public long getElapsedTime() {
		Date time=new Date(); 
		return time.getTime();
		
	}
	
	public long getStartTime() {
		return startTime;
		
	}
	
	public long getEndTime() {
		return endTime;
	}
}
