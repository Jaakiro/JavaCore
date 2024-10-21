package org.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public WriteToFile(byte[] arr, String fileName) throws IOException {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (byte b : arr) {
                outputStream.writeByte(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
