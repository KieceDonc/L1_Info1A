import java.io.IOException;

public class Lire
{
    public static String S() {
        String string = "";
        try {
            char c;
            while ((c = (char)System.in.read()) != '\n') {
                if (c != '\r') {
                    string += c;
                }
            }
        }
        catch (IOException ex) {
            System.out.println("Erreur de frappe");
            System.exit(0);
        }
        return string;
    }
    
    public static byte b(String ToDisplay) {

        System.out.println(ToDisplay);
        byte byte1 = 0;
        try {
            byte1 = Byte.parseByte(S());
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return byte1;
    }
    
    public static short s(String ToDisplay) {

        System.out.println(ToDisplay);
        short short1 = 0;
        try {
            short1 = Short.parseShort(S());
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return short1;
    }
    
    public static int i(String ToDisplay) {

        System.out.println(ToDisplay);
        int int1 = 0;
        try {
            int1 = Integer.parseInt(S());
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return int1;
    }
    
    public static long l(String ToDisplay) {

        System.out.println(ToDisplay);
        long n = 0L;
        try {
            n = Integer.parseInt(S());
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return n;
    }
    
    public static double d(String ToDisplay) {

        System.out.println(ToDisplay);
        double doubleValue = 0.0;
        try {
            doubleValue = Double.valueOf(S());
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return doubleValue;
    }
    
    public static float f(String ToDisplay) {

        System.out.println(ToDisplay);
        float floatValue = 0.0f;
        try {
            floatValue = Double.valueOf(S()).floatValue();
        }
        catch (NumberFormatException ex) {
            System.out.println("Format num\ufffdrique incorrect");
            System.exit(0);
        }
        return floatValue;
    }
    
    public static char c(String ToDisplay) {

        System.out.println(ToDisplay);
        final String s = S();
        if (s.length() == 0) {
            return '\n';
        }
        return s.charAt(0);
    }
}