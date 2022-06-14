class Main {
  public static void main(String[] args) {

            int[] list = {10,9,8,7,6,5,4,3,2,1};

            bubbleSort(list);

        }

        public static void bubbleSort(int[] data) {
            int swap = 0, comparison = 0;
            boolean swapped = true;
            for (int out = data.length-1; out > 0; out--) {
              swapped = false;
                for (int in = 0; in < out; in++) {
                    comparison++;
                    if (data[in] > data[in + 1]) {
                        swapped = true;
                        int tmp = data[in];        // swap items
                        data[in] = data[in + 1];    //
                        data[in + 1] = tmp;        //
                        swap++;
                    }
                }
                for (int i = 0; i < data.length; i++)
                    System.out.print(data[i] + " ");
                System.out.println();
                if (swapped == false)
                  out = 0;
            }
            System.out.println("swaps=" + swap);
            System.out.println("Comparisons=" + comparison);
            
        }
}