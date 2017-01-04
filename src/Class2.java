/**
 * Created by BilNil on 1/2/2017.
 */
public class Class2 {
    public String crap(String str1){
        //System.out.println(str1);
        return crap1(str1);
    }

    public String crap1(String str1){
        if(str1.equalsIgnoreCase("billi"))
            return "Hello "+str1;
        return str1;
    }

    public void crap2() {
        int j = 100;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " " + j);
            j--;
        }
    }
    public void ternary(String str1) {
        String s = str1.equals("billi") ? str1 : "crap";
        System.out.print(s);
    }
}
