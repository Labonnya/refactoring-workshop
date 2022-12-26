package workshop;

public class BuzzPatternMatcher implements PatternMatcher{

	@Override
	public boolean matchPattern(int number) {
		// TODO Auto-generated method stub
		return number % 5 == 0;
	}

	@Override
	public String response() {
		// TODO Auto-generated method stub
		return "Buzz";
	}
}
