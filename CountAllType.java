public class CountAllType {

    public static void countAll(String s){


        int countVowel=0,countSpecial=0,countConst=0,countNumber=0,countOperators=0;

        s=lowerCaseConverter(s);


         for(int i=0;i< s.length();i++)
         {
             if((s.charAt(i)>=97 && s.charAt(i) <=122)|| (s.charAt(i)>=65 && s.charAt(i)<=90)){
                  if( s.charAt(i) =='a'||s.charAt(i)=='e'||s.charAt(i)=='i' ||s.charAt(i)=='o'||s.charAt(i)=='u'){
                      countVowel++;
                  }else{
                      countConst++;
                  }
             }else if((s.charAt(i)>=33 && s.charAt(i)<=47 )|| (s.charAt(i)>=91 && s.charAt(i)<=96)){
                 countSpecial++;
             } else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
                 countNumber++;
             }else if(s.charAt(i)>=58&& s.charAt(i)<=64){
                 countOperators++;
             }else{
               continue;
             }
         }


        System.out.println("The number of Vowels in this data is "+ countVowel);
        System.out.println("The number of Constants in this data is "+ countConst);
        System.out.println("The number of Special Characters in this data is "+ countSpecial);
        System.out.println("The amount of number in this data is "+ countNumber);
        System.out.println("The number of operators in this data is "+ countOperators);


    }
    public static String lowerCaseConverter(String s){

        char ar[]=s.toCharArray();
        for(int i=0;i< ar.length;i++){
            if(ar[i]>=65 & ar[i]<=90){
                ar[i]+=32;

            }
        }

        return String.valueOf(ar);
    }
}
