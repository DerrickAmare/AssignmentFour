public class Pangram{

    public static void pangram( String s){
        boolean flag=true;

       s=upperCaseConverter(s);

        int [] mark=new int [26];
        int index;
        s=s.replaceAll(" ","");
        for(int i=0; i< s.length();i++){

            index=s.charAt(i)-65;
            mark[index]++;

        }
        for(int i =0;i< mark.length;i++){
            if(mark[i]==0)
                flag=false;
        }

         if(flag){
             System.out.println("Your sentence is a Pangram");
         }else{
             System.out.println("Sorry! Your sentence is not a Pangram");
         }

    }
    public static String upperCaseConverter(String s){

        char ar[]=s.toCharArray();
        for(int i=0;i< ar.length;i++){
            if(ar[i]>=97 & ar[i]<=122){
                ar[i]-=32;

            }
        }

        return String.valueOf(ar);
    }

}


