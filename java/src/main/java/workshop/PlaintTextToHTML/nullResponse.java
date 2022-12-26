package plainTextToHTMLConverter;

public class nullResponse implements CharacterConvert{
    @Override
    public boolean checknConvert(char c) {
        return false;
    }

    @Override
    public String addConverted() {
        return "";
    }
}
