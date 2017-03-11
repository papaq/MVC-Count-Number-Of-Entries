package ExploreArrays;

import java.util.Arrays;

public class ArraysMVC {
    public static void main(String[] Args) {

        /*
        int intArr[] = {1, 2, 1, 3, 2, 3};
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(ArrayCount.ArrayOfNumbers(intArr)));

        String strArr[] = {"cat", "dog", "han", "cat"};
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(ArrayCount.ArrayOfNumbers(strArr)));
        */

        ArraysView view = new ArraysView();
        ArraysController controller = new ArraysController(view);

        view.setVisible(true);
    }
}
