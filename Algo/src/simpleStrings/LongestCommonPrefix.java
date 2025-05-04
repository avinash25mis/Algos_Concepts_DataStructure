package simpleStrings;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        String strs[]= {"kkkk", "kkkk","kkkk"};

        longestCommonPrefix(strs);
    }

        public static String longestCommonPrefix(String[] strs) {

        String smallest=strs[0];


            String pre="";
            for(String s:strs){

                for(int i=0; i<smallest.length() && i< s.length();i++){
                    if(s.charAt(i)==smallest.charAt(i)){
                        pre=pre+s.charAt(i);
                    }else {
                        break;
                    }

                }
                smallest=pre;
                pre="";
            }

            System.out.println(smallest);
            return smallest;
        }
    }

