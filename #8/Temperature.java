package Lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextField textField;
    private final JRadioButton celsiusToFahrenheit;
    private final JRadioButton fahrenheitToCelsius;
    private final JLabel resultLabel;

    public Temperature() {
        super("Temperature Converter");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel();
        JLabel label = new JLabel("Enter temperature:");
        textField = new JTextField(20);
        inputPanel.add(label);
        inputPanel.add(textField);
        mainPanel.add(inputPanel);

        celsiusToFahrenheit = new JRadioButton("Celsius to Fahrenheit", true);
        fahrenheitToCelsius = new JRadioButton("Fahrenheit to Celsius");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(celsiusToFahrenheit);
        buttonGroup.add(fahrenheitToCelsius);

        JPanel radioPanel = new JPanel();
        radioPanel.add(celsiusToFahrenheit);
        radioPanel.add(fahrenheitToCelsius);
        mainPanel.add(radioPanel);

        JPanel convertPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result:");
        convertPanel.add(convertButton);
        convertPanel.add(resultLabel);
        mainPanel.add(convertPanel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input = Double.parseDouble(textField.getText().trim());
                    if (celsiusToFahrenheit.isSelected()) {
                        double fahrenheit = (input * 9 / 5) + 32;
                        resultLabel.setText(String.format("Result: %.1f °F", fahrenheit));
                    } else {
                        double celsius = (input - 32) * 5 / 9;
                        resultLabel.setText(String.format("Result: %.1f °C", celsius));
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter a number.");
                }
            }
        });

        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400, 200);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
    	Temperature frame = new Temperature();
        frame.setVisible(true);
     }
}