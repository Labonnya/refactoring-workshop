package workshop;

public class FizzBuzzPatternMatcher implements PatternMatcher{

	@Override
	public boolean matchPattern(int number) {
		// TODO Auto-generated method stub
		return number % 15 == 0;
	}

	@Override
	public String response() {
		// TODO Auto-generated method stub
		return "FizzBuzz";
	}


}
