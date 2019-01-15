
public class Weather {
	private float emperature;
	private float humidity;
	boolean flag = false;
	public synchronized float getEmperature() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag = false;
		notifyAll();
		return emperature;
	}
	public synchronized void setEmperature(float emperature) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		this.emperature = emperature;
		flag =true;
		notifyAll();
	}
	public synchronized float getHumidity() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("得到:"+humidity);
		flag = false;
		notifyAll();
		return humidity;
	}
	public synchronized void setHumidity(float humidity) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.humidity = humidity;
		System.out.println("设置:"+humidity);
		flag = true;
		notifyAll();
	}
	
}
