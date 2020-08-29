package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String saved = s;
		char[] switcher = saved.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				switcher[i] = Character.toUpperCase(saved.charAt(i));
			} else {
				switcher[i] = Character.toLowerCase(saved.charAt(i));
			}
//			if (i % 2 == 0) {
//				switcher[i] = Character.toLowerCase(saved.charAt(i));
//			}
		}
		saved = String.valueOf(switcher);
		return saved;
	}

}

//String myName = "domanokz";
//char[] myNameChars = myName.toCharArray();
//myNameChars[4] = 'x';
//myName = String.valueOf(myNameChars);