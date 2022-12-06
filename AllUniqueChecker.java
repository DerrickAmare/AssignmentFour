public class AllUniqueChecker {

    public static void allUniqueChecker(String s) {
        s = s.toLowerCase();
        char[] word = s.toCharArray();
        boolean flag = true;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {

                    if(i!=j) {
                        if (word[i] != word[j]) {
                            continue;
                        } else {
                            flag = false;

                        }
                    }

            }

        }
        if(flag){
            System.out.println("Yaay! this word has all unique characters.");
        }else{
            System.out.println("Sorry! This word is not filled with unique characters");
        }
    }
}
