package com.pluralsight.Utility;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipts {

    public static void saveReceipt(String receipt) {
        // Ensure the receipts directory exists
        File directory = new File("receipts");
        if (!directory.exists()) {
            directory.mkdir();
        }


        String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

        try (FileWriter writer = new FileWriter(new File(directory, filename))) {
            writer.write(receipt); // Write the receipt to the file
            System.out.println("-------------Receipt saved as " + filename + "--------------"); // Inform the user about the saved receipt
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt: " + e.getMessage());
        }
    }
}

