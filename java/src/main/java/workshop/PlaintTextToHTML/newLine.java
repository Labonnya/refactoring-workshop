package plainTxttoHTML;

public class newLine implements CharacterConvert {
    @Override
    public boolean checknConvert(char c) {
        char match = '\n';
        return (c==match);
    }

    @Override
    public String addconverted() {
        return "<br />";
    }
}
