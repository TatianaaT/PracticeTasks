package Coding;

public class RemoveSpacesFromString {

    public static String removeExtraSpaces(String str){
        str=str.trim();
        for(int i=0; i<str.length(); i++){
            str= str.replace("  "," ");
        }
        return str;
    }

    public static void main(String[] args) {
        String exp= " I     love   Java ";
        System.out.println(removeExtraSpaces(exp));
    }
}


