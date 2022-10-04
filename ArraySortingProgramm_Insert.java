public class ArraySortingProgramm_Insert {
    public static void main (String[] args){

        //unsorted array
        int a[] = {4, 2, 6, 1};
        int temp = 0;

        //goes trough array
        for(int current = 1; current < a.length; current++){
            int i = current;
            //swaps number until a[i-1] < a[i]
            while(i > 0 && a[i] < a [i-1]){
                temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                i--;
            }
        }

        //prints out sorted array
        for(int j = 0; j < a.length; j++){
            System.out.print(a[j] + " ");
        }
    }
}
