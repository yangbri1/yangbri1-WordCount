
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        // if(in.contains(" "))
        // call String.toCharArray() to convert given 'in' String into an array of characters
        char[] charAry = in.toCharArray();
        // initialize int 'wordCount' to count number of words detected in given String 'in'
        // Note: In English structure each word is delimited by a space => reason for initialization to value 1
        int wordCount = 1;
        // for-each to iterate through each char in 'charAry'
        for(char ch : charAry){
            // check if current elem is of space
            if(ch == ' '){
                // prefix increment to count space
                ++wordCount;
            }
        }
        /* below while block also works */
        // while(itr < in.length()){
            // if(in.charAt(itr) == ' '){
            //     wordCount++;
            // }
            // itr++;
        // }
        return wordCount;
    }
}
