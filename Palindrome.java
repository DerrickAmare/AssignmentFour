public class Palindrome {

    public static void palindrome(String s){

        char [] word= s.toCharArray();
      boolean flag= true;
  int j;

        for(int i=0;i< word.length;i++){
            for( j= word.length-1;j>0;j--){

                if(word[i]==word[j]){
                    break;
                }

            }
            if(j==0){
                flag=false;
                System.out.println("Sorry! This word is not a palindrome.");
            }
        }
          if(flag){
              System.out.println("This word is a palindrome.");
          }


    }
}
