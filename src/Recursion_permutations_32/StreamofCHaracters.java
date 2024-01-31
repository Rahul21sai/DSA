package Recursion_permutations_32;

public class StreamofCHaracters {
    public static void main(String[] args) {
        skip("","baabcedeadfh");
        System.out.println(skip1("babababababc" ));
        System.out.println(skipApple("ajaiwwjapple1apple2ernjebrhgbghsdjjdf"));
        System.out.println(skipAppnotApple("ajaiappwwjapple1apple2ernjebrhgbghsdjjdf"));

    }
    // mo return type
    static void skip(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch =='a'){
            skip(p,up.substring(1));

        }else {
            skip(p + ch,up.substring(1));
        }
    }
    //return type is string

    static String skip1(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip1(up.substring(1));
        }else{
            return ch + skip1(up.substring(1));
        }
    }
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));

        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
//    skip app not apple
static String skipAppnotApple(String up){
    if (up.isEmpty()){
        return "";
    }
    if (up.startsWith("app") && !up.startsWith("apple")){
        return skipAppnotApple(up.substring(3));

    }else{
        return up.charAt(0) + skipAppnotApple(up.substring(1));
    }
}
}
