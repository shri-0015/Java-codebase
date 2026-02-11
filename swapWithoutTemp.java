public class swapWithoutTemp {
    public static void main(String[] args) {
        int x = 12;
        int y= 10;
        System.out.println("Before Swap ->  X: " +x +  "Y: " +y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X: " +x +"Y: " + y);
    }
}
