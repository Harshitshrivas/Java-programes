public class longcommonpref {

    public  String commonPrefix(String str1, String str2){ // two string as input

        int n = Math.min(str1.length(), str2.length());
        StringBuilder res = new StringBuilder();

        for(int i =0; i< n; i++){
            if(str1.charAt(i) == str2.charAt(i)){   // check character by character
                res.append(str1.charAt(i));
            }else{
                break;
            }
        }
           return  res.toString();

    }

    public  String longestCommon(String str[]){  // array of string as input
      
        if(str.length ==0) return  "";
         String prefix = str[0];

         for(int i =1; i<str.length; i++){
            prefix = commonPrefix(prefix, str[i]);  // update prefix
         }
         return prefix;
    }

    public static void main(String[] args) {
        
        longcommonpref obj = new longcommonpref();  // create object of class
        String[] arr = {"flower", "flow", "flight"};
        String result = obj.longestCommon(arr);    // call the method using object
        System.out.println("Longest Common Prefix: " + result);
       
    }
}
