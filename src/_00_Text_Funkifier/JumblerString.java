package _00_Text_Funkifier;


import java.util.ArrayList;
import java.util.List;

public class JumblerString extends SpecialString {

	public JumblerString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		List<Character> characters = new ArrayList<Character>();
        for(char c:s.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(s.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
        return(output.toString());
    }
//		for(int i = 0; i< s.length(); i++) {
//			
//		}
//		return null;
	}


