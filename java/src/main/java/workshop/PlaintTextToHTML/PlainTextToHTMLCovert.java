
package plainTxttoHTML;

import refac.NullPrint;
import refac.patternMatcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {

    List<CharacterConvert> charconvert;

    public PlaintextToHtmlConverter(List<CharacterConvert> chrcon)
    {
        this.charconvert = chrcon;
    }

        public String toHtml() throws Exception {
            String text = read();
            String htmlLines = basicHtmlEncode(text);
            return htmlLines;
        }
    
        protected String read() throws IOException {
        Path filePath = Paths.get("sample.txt");
        byte[] fileByteArray = Files.readAllBytes(filePath);
        return new String(fileByteArray);
    }
       

        private String basicHtmlEncode(String source) {
           
            List<String> result = new ArrayList<>();
            List<String> convertedLine = new ArrayList<>();

            for(char characterToConvert : source.toCharArray())
            {
                for(CharacterConvert charcon: charconvert)
                {
                    if(charcon.checknConvert(characterToConvert))
                    {
                        convertedLine.add(charcon.addconverted());
                        break;
                    }         
          
            }
           
            String finalResult = String.join("<br />", result);
            return finalResult;
        }


        
