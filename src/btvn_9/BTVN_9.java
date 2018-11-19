package btvn_9;

public class BTVN_9 {

    private String str1 = "HELLO - 1";

    public String str2 = "HELLO - 2 - PUBLIC";

    String str3 = "HELLO - 3 - DEFAULT";

    protected String str4 = "HELLO - 4 - PROTECTED";
    
    void XXX(){
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    public static void main(String[] args) {
//        BTVN_9 test = new BTVN_9();
//        System.out.println(test.str2);
//        System.out.println(test.str3);
//        System.out.println(test.str4);
    }
}

class TEST{
    
    void XXX(){
        BTVN_9 test = new BTVN_9();
        System.out.println(test.str2);
        System.out.println(test.str3);
        System.out.println(test.str4);
    }
}
