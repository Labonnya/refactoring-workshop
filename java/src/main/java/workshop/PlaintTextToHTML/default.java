package plainTxttoHTML;

 private string strReturn;
    @Override
    public boolean checknConvert(char c) {
        this.strReturn = String.valueOf(c);
        return true;
    }

    @Override
    public String addConverted () {
        return this.strReturn;
    }
}
