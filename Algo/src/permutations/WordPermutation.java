package permutations;

public class WordPermutation {

    public static void main(String[] args) {
        String str="ABC";
        permute(str,0,str.length()-1);
    }



    private static void permute(String str, int l, int r) {
        if(l==r){
            System.out.println(str);
        }else{

            for(int i=l;i<=r;i++) {
                str=swap(str, l, i);
                permute(str, l+1, r);
                str=swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
       char temp;

       char word[]=str.toCharArray();
       temp=word[i];
       word[i]=word[l];
       word[l]=temp;

        return String.valueOf(word);
    }
}
