public class maxElementArray {
    public static void main(String[] args) {
        int [] arr1 = {45, 12, 89, 3, 67, 24, 91, 8, 56, 30, 72, 14, 99, 6, 38, 81, 27, 5, 63, 18, 94, 41, 10, 76, 2, 58, 33, 87, 21, 69};
        int n = arr1.length;
        int max = arr1[0];
        int min = arr1[0];
        for(int i = 1; i < n; i++){
            if (arr1[i]> max) {
                max = arr1[i];
                }
            if (arr1[i]<min) {
                    min = arr1[i];
                    
                }
            } 
            System.out.println("Maximum element of array is " +max);
            System.out.println("Mimimum element of array is " +min);   
            }
        }  
