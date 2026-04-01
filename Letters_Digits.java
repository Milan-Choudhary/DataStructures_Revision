
import java.util.*;

public class Letters_Digits{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String word = input.next();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder other_characters = new StringBuilder();

        for(int i = 0; i<word.length(); i++){
            if(Character.isLetter(word.charAt(i))){
                letters.append(word.charAt(i));
            }
            else if(Character.isDigit(word.charAt(i))){
                digits.append(word.charAt(i));
            }
            else{
                other_characters.append(word.charAt(i));
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(other_characters);
        

        input.close();

    }
}