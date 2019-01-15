
public class GenerateWeather implements Runnable{
	Weather weather;
	public GenerateWeather(Weather weather) {
		this.weather = weather;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
				weather.setEmperature(i+1);	
				weather.setHumidity(i);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
