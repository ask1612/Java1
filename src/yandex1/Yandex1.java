package yandex1;

/**
 *
 * @author ASK
 */
public class Yandex1 {

    /**
     * @param args the command line arguments 
     * args[0] is the login  that must be  checked 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login log= new Login(args[0]);
        System.out.println(args[0]);
        System.out.println(log.getLog());
        if(log.check1())  System.out.println("Login  is successful! Variant 1");
        else System.out.println("Login is wrong!  Variant 1");
        if(log.check2())  System.out.println("Login  is successful! Variant 2");
        else System.out.println("Login is wrong!  Variant 2");
    }
}
