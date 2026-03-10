public class arrayOperations {
    public static void main(String[] args) {
        int [] arr1 = {1,3,2,98,6,45,34,21,567,6756,5,4};
        int n = arr1.length;
        int target = 1;
        boolean isFound = false;
    // Traversing with index
    for(int i = 0; i < n ; i++){
        System.out.print(arr1[i] + " ");

    }
    System.out.println();
    //traversing without indexing 
    for(int num : arr1){
        System.out.print(num + " ");
    }


    // Searching
    System.out.println();
    for(int i = 0; i < n ; i++ ){
        if (arr1[i]== target) {
            isFound = true;
            
        }

    }
    if (isFound == true) {
        System.out.println("Target is present in array!");
        
    }
    else  {
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
