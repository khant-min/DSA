public class Main {
    public static void main(String[] args) {
        // linear search = Iterate through a collection one element at a time
        
        int[] array = {3, 4, 1, 9, 2, 9, 5};

        int index = linearSearch(array, 10);

        if (index != -1) {
            System.out.println("Value found at: " + index);
        } else {
            System.out.println("Value not found :)");
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return 1;
            }
        }
        return -1;
    }
}