import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Import statements to import the Java Swing and AWT Package

public class Main
{ // Public class labelled Main

    public static void main(String[] args) // Implemetation of the main method
    {
        JFrame f = new JFrame("Billing System");// Creation of the GUI frame

        f.setBounds(600, 700, 700, 600);

        JLabel Label = new JLabel();// Creation of labels

        Label.setBounds(20, 150, 200, 50);

        JLabel l1 = new JLabel("Customer Name");

        l1.setBounds(20, 80, 200, 30);

        JTextField text1 = new JTextField();// Creation of textfields where input is obtained

        text1.setBounds(280, 80, 150, 30);

        JLabel l2 = new JLabel("Address");

        l2.setBounds(20,130,200,30);// Setting the sizes of all labels and textfields

        JTextField text2 = new JTextField();

        text2.setBounds(280,130,150,30);

        JLabel l3 = new JLabel("Electricity Meter Number");

        l3.setBounds(20,180,200,30);

        JTextField text3 = new JTextField();

        text3.setBounds(280,180,150,30);

        JLabel l4 = new JLabel("Gas Meter Number");

        l4.setBounds(20,230,200,30);

        JTextField text4 = new JTextField();

        text4.setBounds(280,230,150,30);

        JLabel l5 = new JLabel("Electricity Initial Meter Reading");

        l5.setBounds(20,280,200,30);

        JTextField text5 = new JTextField();

        text5.setBounds(280,280,150,30);

        JLabel l6 = new JLabel("Electricity Final Meter Reading");

        l6.setBounds(20,330,200,30);

        JTextField text6 = new JTextField();

        text6.setBounds(280,330,150,30);

        JLabel l7 = new JLabel("Gas Initial Meter Reading");

        l7.setBounds(20,380,200,30);

        JTextField text7 = new JTextField();

        text7.setBounds(280,380,150,30);

        JLabel l8 = new JLabel("Gas Final Meter Reading");

        l8.setBounds(20,430,200,30);

        JTextField text8 = new JTextField();

        text8.setBounds(280,430,150,30);

        JButton b = new JButton("Total Invoice");
        b.setBounds(200, 520, 200, 30);

        b.addActionListener(new ActionListener() { // Adding an action listener
            @Override
            public void actionPerformed(ActionEvent e) 
            {

                String customerName = text1.getText();

                String address = text2.getText();

                String electricityMeterNumber = text3.getText();

                String gasMeterNumber = text4.getText();

                String electricityInitialReading = text5.getText();

                String electricityFinalReading = text6.getText();

                String gasInitialReading = text7.getText();
                
                String gasFinalReading = text8.getText();
                
                double total = calculateTotal(electricityInitialReading, electricityFinalReading, gasInitialReading, gasFinalReading);
                // Calculating the total invoice

                JOptionPane.showMessageDialog(f, "Total Invoice for " + customerName + ": $" + total, "Invoice", JOptionPane.INFORMATION_MESSAGE);
                // Producing a small dialog where the invoice is printed

            }
        });

        f.add(Label); f.add(l1); f.add(l2); f.add(l3); f.add(l4); 
        f.add(l5); f.add(l6); f.add(l7); f.add(l7); f.add(l8); f.add(b); f.add(text1);
        f.add(text2); f.add(text3); f.add(text4); f.add(text5);
        f.add(text6); f.add(text7); f.add(text8);

        f.add(b);
        // Ensure all labels, textfields nad button appear on the frame

        f.setLayout(null);
        f.setVisible(true);
    }

    
    private static double calculateTotal(String electricityInitial, String electricityFinal, String gasInitial, String gasFinal) {
        //class that calculates the invoice to be printed
        double electricityCost = (Double.parseDouble(electricityFinal) - Double.parseDouble(electricityInitial)) * 0.10;

        double gasCost = (Double.parseDouble(gasFinal) - Double.parseDouble(gasInitial)) * 1.50;

        return electricityCost + gasCost;
    }
}
