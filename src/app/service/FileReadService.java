package app.service;

import app.utils.Constants;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {
    public String handleFile(String filename) {
        try(final BufferedReader br =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream(Constants.BASE_PATH +
                                    filename + ".txt")))) {
            String string;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = br.readLine()) != null) {
                stringBuilder.append(string).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
    }
}

