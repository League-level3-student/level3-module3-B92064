package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String outString = "";
        for(char c : s.toCharArray()) {
            outString = c + outString;
        }

        return outString;
	}

}
