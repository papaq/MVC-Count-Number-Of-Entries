package ExploreArrays;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class ArraysController {

    private ArraysView theView;

    ArraysController(ArraysView view) {

        theView = view;

        theView.AddCountArrayListener(new CountListener());

    }


    private class CountListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String[] inputArray = theView.GetInputArray().trim().split(" ");

            int[] outputArray = ArrayCount.ArrayOfNumbers(inputArray);

            theView.SetOutputArray(Arrays.toString(outputArray));
        }
    }
}
