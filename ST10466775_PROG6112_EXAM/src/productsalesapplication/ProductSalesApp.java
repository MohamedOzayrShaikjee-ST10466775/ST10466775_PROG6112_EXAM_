/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsalesapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author ST10466775 Mohamed Ozayr Shaikjee.
 */
// GUI's framework that i have done in preparation before exam 
// has been used in this file.
public class ProductSalesApp extends JFrame {
    // GUI components
    private JTextArea displayArea;
    private JLabel yearsLabel;
    private final int SALES_LIMIT = 500;

    // Simulated in-memory sales data (as if read from a database)
    // Each row represents a year; each column represents a product
    private int[][] salesData = {
        {300, 150, 700},  // Year 1: Microphone, Speakers, Mixing Desk
        {250, 200, 600}   // Year 2: Microphone, Speakers, Mixing Desk
    };

    public ProductSalesApp() {
        super("Product Sales Application");
        setLayout(new BorderLayout());

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton loadButton = new JButton("Load Product Data");
        JButton saveButton = new JButton("Save Product Data");
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        add(buttonPanel, BorderLayout.NORTH);

        //Text Area 
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Years Label 
        JPanel bottomPanel = new JPanel();
        yearsLabel = new JLabel("Years Processed: 0");
        bottomPanel.add(yearsLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        //BUTTON ACTIONS 
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadProductData(); // load from memory
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveProductData(); // save to file
            }
        });

        // FRAME SETTINGS
        //Google was COnsulted for this
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // LOAD PRODUCT DATA 
    private void loadProductData() {
        int totalSales = 0;
        int numSales = 0;
        int overLimit = 0;
        int underLimit = 0;

        // Process all data from memory
        for (int[] year : salesData) {
            for (int sale : year) {
                totalSales += sale;
                numSales++;
                if (sale > SALES_LIMIT)
                    overLimit++;
                else
                    underLimit++;
            }
        }

        double averageSales = (double) totalSales / numSales;
        int yearsProcessed = salesData.length;

        // Display results in the text area
        displayArea.setText(""); // clear previous
        displayArea.append("Total Sales: " + totalSales + "\n");
        displayArea.append("Average Sales: " + (int) averageSales + "\n");
        displayArea.append("Sales over limit: " + overLimit + "\n");
        displayArea.append("Sales under limit: " + underLimit + "\n");

        // Update label
        yearsLabel.setText("Years Processed: " + yearsProcessed);
    }

    //  SAVE PRODUCT DATA 
    private void saveProductData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.rxt"))) {
            writer.println(displayArea.getText());
            JOptionPane.showMessageDialog(this, "Data saved successfully to data.rxt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
        }
    }

    // MAIN METHOD 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProductSalesApp::new);
    }
}
