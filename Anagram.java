import java.util.Arrays;

public class Anagram {
    public void anagram( String s1,String s2){
        boolean flag=false;
        char [] word1= s1.toCharArray();

        Arrays.sort(word1);

        char[] word2=s2.toCharArray();
        Arrays.sort(word2);


        if(flag) {
            System.out.println("These words are Anagram of each other");
        } else{
            System.out.println("Sorry! These words are not Anagram of each other");}
    }
}
