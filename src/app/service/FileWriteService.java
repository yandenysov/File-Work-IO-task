package app.service;

import app.utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public String handleFile(String filename, String text) {
        try(FileOutputStream fileOutput = new FileOutputStream(Constants.BASE_PATH + filename + ".txt")) {
            byte[] byteArr = text.getBytes();
            fileOutput.write(byteArr, 0, byteArr.length);
            return "Successfully filled the file with your input.";
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
    }
}
