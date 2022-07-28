import java.io.Serializable;

public class ExceptionExample implements Serializable {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        String str =null;
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=1;
        arr[2]=3;

        System.out.println("Before Exception");
        //int c=a/b;
        //System.out.println(c);

       //System.out.println(str.length());
        try {
            arr[3]=4;
            System.out.println(str.length());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block is Executed");
        }

/*
* catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }*/
        System.out.println("Exception Occured");
    }
}
