package statisticker;

public class StatsChecker {
	
	public Float maxThreshold;
	public IAlerter[] alerters;
	
	public StatsChecker(Float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
	
		for (int i = 0; i < numbers.length; i++) {
			if(maxThreshold < numbers[i]) {
				for (int j = 0; j < alerters.length; j++) {
					alerters[j].alert();
				}
			}
		}
	}

}
