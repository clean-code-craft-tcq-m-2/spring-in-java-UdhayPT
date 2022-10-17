package statisticker;

import java.util.List;

public class Statistics 
{
	public static Stats getStatistics(List<Float> numbers) {
		Stats s = new Stats();
		s.average = getAverage(numbers);
		s.max = getMax(numbers);
		s.min = getMin(numbers);
		return s;
    }

	private static Float getMax(List<Float> numbers) {
		if (null == numbers || numbers.isEmpty()) {
			return Float.NaN;
		}
		Float max = Float.MIN_VALUE;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		return max;
	}

	private static Float getAverage(List<Float> numbers) {
		if (null == numbers || numbers.isEmpty()) {
			return Float.NaN;
		}
		Float sum = Float.MIN_VALUE;
		for (int i = 0; i < numbers.size(); i++) {
			sum = sum + numbers.get(i);
		}
		return sum/numbers.size();
	}

	private static Float getMin(List<Float> numbers) {
		if (null == numbers || numbers.isEmpty()) {
			return Float.NaN;
		}
		Float min = Float.MAX_VALUE;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < min) {
				min = numbers.get(i);
			}
		}
		return min;
	}
}
