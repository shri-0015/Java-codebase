public class invertedRightAngleT {
    public static void main(String[] args) {
        int rows = 6;
        // int cols = 6;
        for (int i =1; i <=rows; i++){
            for (int j = 6; j >=i;j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
