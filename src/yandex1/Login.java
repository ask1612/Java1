package yandex1;

/**
 * ******************************************************************************
 class Login
 *
 * @author ASK
 * *****************************************************************************
 */
public class Login {

    private  final String Login;
    
    private static final String strSymbol = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//Only for Variant 2
    private static final String strNumber = "1234567890";//Only for Variant 2
    private static final String strDotMinus = ".-";//Only for Variant 2

    public Login(String log) {
        Login = log;
    }

    /**
     * *
     * check1
     *
     * @return
     */
    //Variant 1
    public boolean check1() {//Validate login
        boolean result = false;
        int lenght = (Login.length() <= 20) ? Login.length() : 0;//Check the length of input string
        for (int i = 0; i < lenght; i++) {//Check the symbols of input string
            if ((Login.charAt(i) >= 'A'
                    && Login.charAt(i) <= 'Z')
                    || (Login.charAt(i) >= 'a'
                    && Login.charAt(i) <= 'z')) {//Alphabetical symbol can stand in any position
                result = true;
            } else if (Login.charAt(i) >= '0'
                    && Login.charAt(i) <= '9'
                    && i > 0) {//Number may occupy any position except the first
                result = true;
            } else if ((Login.charAt(i) == '-'
                    || Login.charAt(i) == '.')
                    && i > 0
                    && i < lenght - 1) {//Dot and minus may occupy any position except the first and last
                result = true;
            } else {
                result = false;
                break;
            }

        }
        return result;
    }

    
    /**
     * check2
     * @return 
     */
    //Variant 2
    //abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.-"
    public boolean check2() {
        boolean result =  (Login.length()>0&&Login.length() <= 20 );//Check the length of input string
        if (result) {
            result &= (strSymbol.indexOf(Login.charAt(0)) != -1);//Check the first  symbol of input string
                result &= (strSymbol.indexOf(Login.charAt(Login.length()-1)) != -1
                        || strNumber.indexOf(Login.charAt(Login.length()-1)) != -1);//Check the  last symbol of input string
                for (int i = 1; i < Login.length()-1; i++) {//Check the other symbols of input string
                    result &= (strSymbol.indexOf(Login.charAt(i)) != -1
                            || strNumber.indexOf(Login.charAt(i)) != -1
                            || strDotMinus.indexOf(Login.charAt(i)) != -1);//Login has 2+ symbols
            }
        }
        return result;
    }

    
    
    
    /**
     * getLog
     *
     * @return
     */
    String getLog() {
        return Login;
    }
}
