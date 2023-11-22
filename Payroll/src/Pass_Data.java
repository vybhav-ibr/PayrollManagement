
enum Pass_Data {
	ONE("eins",true),TWO("zwei",false),THREE("drei",false);
	private final String pass;
	private final boolean ad;

    Pass_Data(String pass, boolean b) {
        this.pass = pass;
        this.ad=b;
    }
    public String getPass() 
    {
        return pass;
    }
    public boolean getAd()
    {
    	return ad;
    }

    public static void main(String[] args)
    {
    	System.out.println(Pass_Data.ONE + " is " + Pass_Data.ONE.getPass());
    }
}
