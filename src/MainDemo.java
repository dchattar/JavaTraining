
class MainDemo {
    public static void main(String[] args) {
        // Create instances of Printer
        Printer consolePrinter = new ConsolePrinter();
        Printer filePrinter = new FilePrinter();

        // Call the print method on each instance
        consolePrinter.print(); // Calls ConsolePrinter's print method
        filePrinter.print();    // Calls FilePrinter's print method

        // Call the printMessage method on each instance
        consolePrinter.printMessage(); // Calls Printer's printMessage method
        filePrinter.printMessage();    // Calls Printer's printMessage method
    }

    // Merge Sort function
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Split the array into two halves
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Merge function
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from either half
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Helper function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

abstract class Printer {
    abstract void print(); // Abstract method to be implemented by subclasses
    void printMessage() {
        System.out.println("This is a message from the Printer class.");
    }
}

class ConsolePrinter extends Printer { 
    @Override
    void print() {
        System.out.println("Printing to console");
    }  
}

class FilePrinter extends Printer {
    @Override
    void print() {
        System.out.println("Printing to file");
    }
}


