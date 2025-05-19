public class DsTest {




    /*
    *

    *
    * */

    public static void main(String[] args) {
        String  arr [] []={ {"A","B","C","E"},
                            {"A","B","C","E"},{
                            "A","D","E","E"}};
        String word ="ABCCED";
        findElement(arr,word);



    }

    private static boolean findElement(String[][] arr, String word) {

        if(word.charAt(0)==arr[0][0]){

         }

          return true;
        }






    static boolean findElementRecursion(String[][] arr, String word,int k,int foundCount, int i,int j){
        if(word.length() == foundCount ){
           return true;
        }
        if(i==-1|| j==-1 || i>=arr.length || j>=arr.length){
            return false;
        }

        if (arr[i][j].equals(word.charAt(k))){

           return findElementRecursion(arr,word,++k,++foundCount,++i,j);
        }

        if (!arr[i][j].equals(word.charAt(k))){
          return   findElementRecursion(arr,word,k,foundCount,++i,j);
        }
        if (!arr[i][j].equals(word.charAt(k))){
           return findElementRecursion(arr,word,k,foundCount,i,++j);
        }

        if (!arr[i][j].equals(word.charAt(k))){
           return findElementRecursion(arr,word,k,foundCount,--i,j);
        }
        if (!arr[i][j].equals(word.charAt(k))){
          return   findElementRecursion(arr,word,k,foundCount,i,--j);
        }


return false;
    }
}
