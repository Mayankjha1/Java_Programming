package Arrays;

public class Same_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        // Are they same ?
        System.out.println(arr1 == arr2);
        //No they are not same because even the values are same but the values are in different location

        // but we can equal using this one
        int[] arr3 = arr1;
        System.out.println(arr1 == arr3);
        // Not this is equal because array 3  take values from array 1 location

    }
}
