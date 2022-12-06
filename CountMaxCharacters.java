public class CountMaxCharacters {

    public static void charCounter(String s) {

        s = s.toUpperCase();

        int index;
        int counter=-1;
        int[] mark = new int[26];
        char mostOccuring = ' ';
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {

            index = s.charAt(i) - 65;
            mark[index]++;
        }

           for(int i=0;i< mark.length;i++)
           for(int j=0;j< mark.length;j++){
           if(i!=j && counter
                   <mark[j]) {
               counter = mark[j];
               mostOccuring = (char) (j + 65);
           }
           }
       
        System.out.println(mostOccuring+" "+" has occured the most from all characters " +counter + " times");
    }
}