public class Some {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int r = y - x;//issue 1.a
        boolean z = r > 0;
        System.out.println( r + " is a result of subtracting two given numbers" + ", " + r + " > 0 - " + z );//issue 1.b
    }
}
