public class HiddenWord {
    private String word;

    public HiddenWord(String word){
        this.word = "";
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i)>=97){
                this.word+=(char)(word.charAt(i)-32);
            }else{
                this.word+=(char)word.charAt(i);
            }
        }
    }

    public String getHiddenWord(){
        return this.word;
    }
    public String getHint(String guess){
        String ans = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) >= 97) {
                throw new IllegalArgumentException("Your guess ( " + guess + " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
            }
        }
        if(guess.length()!=this.word.length()){
            throw new IllegalArgumentException("Your guess ( "+ guess + " ) has " + guess.length() + " characters. The hidden word has " + word.length() +" characters. Your guess must be a word with " + word.length() +" characters!");
        }


        for (int i = 0; i < guess.length(); i++){
            if(guess.charAt(i)==this.word.charAt(i)){
                ans+=guess.charAt(i);
            }else if(this.word.indexOf(guess.charAt(i))>-1){
                ans+="+";
            }else{
                ans+="*";
            }
        }
        return ans;
    }
}
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class HiddenWord {
//
//    String word;
//
//    Set<String> cnt = new HashSet<String>();
//
//
//
//    public HiddenWord(String word){
//
//        word = word.toUpperCase();
//
//        for(int i = 0; i < word.length(); i ++){
//            cnt.add(""+word.charAt(i));
//        }
//
//        this.word = word;
//
//    }
//
//    public String getHiddenWord(){
//        return word;
//    }
//
//    public String getHint(String guess){
//        guess = guess.toUpperCase();
//
//        String ans = "";
//
//        for(int i = 0; i < guess.length(); i ++){
////
////            if(Character.isLowerCase(guess.charAt(i))){
////                return "Your guess ( "+guess+" ) does not contain all uppercase letters. Your guess must contain all uppercase letters!";
////            }
//            if(guess.charAt(i) == word.charAt(i)) {
//
//                ans +=  guess.charAt(i);
//
//            } else if ( cnt.contains(""+guess.charAt(i))){
//
//                ans += "+";
//
//            } else {
//                ans += "*";
//            }
//
//        }
//
//        return ans;
//
//    }
//
//
//
//}


