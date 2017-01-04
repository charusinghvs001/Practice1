/**
 * Created by BilNil on 1/2/2017.
 */
public class Class1 {
    public static void main(String... args){
        Class2 object1 = new Class2();
        String str= object1.crap("Billi");
        for(int i=0;i<5;i++) {
            System.out.println(str);
        }
        object1.crap2();
        int[] array1= new int[20];
        for(int i=0;i<20;i++) {
            array1[i] = i + 100;
        }
        for(int i=0;i<20;i++) {
            System.out.println(array1[i]);
        }
    }
}
