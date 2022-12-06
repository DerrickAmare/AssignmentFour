public class DuplicateRemover {

    public static void duplicateRemover(String s){


        char [] word= s.toCharArray();
        boolean flag= true;

        for(int i=0;i< word.length;i++){
            for(int j=0;j< word.length;j++){

                    // do sth about the space
                if(i!=j && word[i]==word[j])
                   word[j] =' ';

            }

        }
     for(char x: word){
         System.out.print(x);
     }
    }
}
