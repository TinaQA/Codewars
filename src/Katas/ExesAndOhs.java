package Katas;

public class ExesAndOhs {

    /*
    Check to see if a string has the same amount of 'x's and 'o's.
    The method must return a boolean and be case insensitive. The string can contain any char.

    Examples input/output:
    XO("ooxx") => true
    XO("xooxx") => false
    XO("ooxXm") => true
    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    XO("zzoo") => false
     */

    public class XO {

        public static boolean getXO (String str) {

            String[] arr = str.toLowerCase().split("");
            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals("o")){
                    count++;
                } else if(arr[i].equals("x")) {
                    count--; }
            }

            return count == 0;

        }
    }
}
