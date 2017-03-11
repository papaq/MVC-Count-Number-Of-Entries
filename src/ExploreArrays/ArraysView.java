package ExploreArrays;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class ArraysView extends JFrame{

    private JTextField inputArray = new JTextField(20);
    private JButton buttonCountArray = new JButton();
    private JTextField outputArray = new JTextField(20);

    ArraysView() {

        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(350,150);
        this.setMinimumSize(new Dimension(350, 150));
        this.setTitle("Count number of values");

        JLabel labelInput = new JLabel("Input your array", SwingConstants.CENTER);
        JLabel labelOutput = new JLabel("Output array is:", SwingConstants.CENTER);

        panel.setLayout(new GridBagLayout());

        buttonCountArray.setText("Count values");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelInput, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelOutput, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(inputArray, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(outputArray, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(buttonCountArray, gbc);



        this.add(panel);
    }

    String GetInputArray() {

        return inputArray.getText();
    }

    void SetOutputArray(String str) {

        outputArray.setText(str);
    }

    void AddCountArrayListener(ActionListener listenForButtonCount) {

        buttonCountArray.addActionListener(listenForButtonCount);
    }

}
