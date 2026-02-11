public class arrayOperations {
    public static void main(String[] args) {
        int [] arr1 = {45, 12, 89, 3, 67, 24, 91, 8, 56, 30, 72, 14, 99, 6, 38, 81, 27, 5, 63, 18, 94, 41, 10, 76, 2, 58, 33, 87, 21, 69};
        int n = arr1.length;
        int target = 1;
        boolean isFound = false;
    // Traversing
    for(int i = 0; i < n ; i++){
        System.out.print(arr1[i] + " ");
    }
    // Searching
    System.out.println();
    for(int i = 0; i < n ; i++ ){
        if (arr1[i]== target) {
            System.out.println("Target is present in array!");
            isFound = true;
            
        }

    }
    if ( isFound == false) {
        System.out.println("Target Not Present!!!");
        
    }

    //2-D Array
    int [][] arr2 = {
        {1,2,3},
        {4,5,6},
        {7,8,9} };
    System.out.println(arr2[2][2]);
    }
}
