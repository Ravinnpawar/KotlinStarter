public class StringExample extends Object{
    public static void main(String[] args) {
        String str1="ABC";
        String str2="ABC";

        //str2="XYZ";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Condition is True");
        }else {
            System.out.println("Condition False");
        }
        //String str1=new String("XYZ");
    }
}
