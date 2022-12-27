package workshop;


import java.util.List;


public class FizzBuzz {
	private static List<PatternMatch> patternMatchers;
	
    public FizzBuzz(List<PatternMatch> patternMatcher) {
		
		FizzBuzz.patternMatchers = patternMatchers;
		
	}

	public static String checkPattern(int number) {
         String strReturn = String.valueOf(number);
        
        for (PatternMatch patternMatcher : patternMatchers) {
        	if (patternMatcher.matchPattern(number)) 
            {
                strReturn = patternMatcher.response();
            }
		}
          
        return strReturn;
    }
}
