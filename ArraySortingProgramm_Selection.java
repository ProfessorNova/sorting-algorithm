public class ArraySortingProgramm_Selection {
    public static void main (String[] args){

        //unsorted array
        int a[] = {3, 2, 6, 4};
        int temp = 0;

        //goes trough array
        for(int current = 0; current < a.length; current++) {
            int minIndex = current;

            //searches for the lowes value in array
            for(int i = current; i < a.length; i++){
                if (a[i] < a[minIndex]) {
                    minIndex = i;
                }
            }
            //swaps lowest array value with current array value
            temp = a[current];
            a[current] = a[minIndex];
            a[minIndex] = temp;
        }

        //prints out sorted array
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
