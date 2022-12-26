package workshop;


import java.util.List;


public class FizzBuzz {
	private static List<PatternMatch> patternMatchers;
	private static PatternMatch nullObjectPattern;
    public FizzBuzz(List<PatternMatch> patternMatchers, PatternMatch nullObjectPattern) {
		super();
		FizzBuzz.patternMatchers = patternMatchers;
		FizzBuzz.nullObjectPattern = nullObjectPattern;
	}

	public static String checkPattern(int number) {
        String strReturn = nullObjectPattern.response();
        
        for (PatternMatch patternMatcher : patternMatchers) {
        	if (patternMatcher.matchPattern(number)) 
            {
                strReturn = patternMatcher.response();
            }
		}
          
        return strReturn;
    }
}
