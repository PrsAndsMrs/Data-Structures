/* 
Question:
Longest Substring Without Repeating Characters:
Write code below 
*/
public class LongestSubString{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input=scanner.nextLine();

        String longString= findLongestSubstring(input);
        System.out.print("The longest subString is: "+longString);
        scanner.close()

    }
    public static String findLongestSubstring(String str){
        for(int i=0;i<str.length(); i++){
            StringBuilder currentString=new StringBuilder();
            for(int j=i;j<str.length(); j++){
                if (currentString.indexOf(String.valueOf(str.charAt(j)))!=-1){
                    break;
                }
                currentString.append(str.charAt(j));

            }
        }
    }

}


