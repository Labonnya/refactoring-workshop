package workshop;

import java.util.List;

public class FizzBuzz {
    private List<PatternMatch> patternMatcher;
    public FizzBuzz(List<PatternMatch> patternMatcher) {
        this.patternMatcher = patternMatcher;
    }

    public String checkPattern(int number) {

        for (PatternMatch patternMatcher : patternMatcher) {
            if (patternMatcher.matchPattern(number)) {
               return patternMatcher.response();
        }
       }

        
    }
}
