public class swapwithtemp {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        System.out.println("X: "+x + "Y: " +y);
        int temp = x;
        x = y;
        y = temp;

        System.out.println("X: " +x  + "Y: " +y);
    }
}
