package randoop_sample;

public class MultiplyService {
	public int multiply(int a, int b) {
		SumService sumService = new SumService();
		int result = 0;
		for(int i=0; i<b; i++) {
			result = sumService.add(result, a);
		}

		return result;
	}

	public void test() {
		return;
	}
}
