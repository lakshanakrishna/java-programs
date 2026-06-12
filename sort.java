public class sort{
    public static void main(String args[]){
        int[]arr={40,58,20,32,45};
        for (int i = 0; i < 5-1; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        }
    }

