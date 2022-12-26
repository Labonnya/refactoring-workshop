package workshop;

public class FizzPatternMatcher implements PatternMatch{

	@Override
	public boolean matchPattern(int number) {
		// TODO Auto-generated method stub
		return number % 3 == 0;
	}

	@Override
	public String response() {
		// TODO Auto-generated method stub
		return "FIzz";
	}


}
