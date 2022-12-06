public class DuplicatePrinter {

    public void duplicatePrinter(String s){

        s=s.toLowerCase();
        char [] word= s.toCharArray();


        for(int i=0;i< word.length;i++){
            for(int j=i+1;j< word.length;j++){


                if( word[i]==word[j])

                    System.out.print(word[j]);

            }

        }
        System.out.println();
    }
}
