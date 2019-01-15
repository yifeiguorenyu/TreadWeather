
public class ReadWeather implements Runnable{
	Weather weather;
	 ReadWeather(Weather weather) {
		this.weather = weather;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			weather.getEmperature();
			weather.getHumidity();
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
