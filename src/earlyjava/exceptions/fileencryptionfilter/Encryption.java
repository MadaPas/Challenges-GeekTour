package earlyjava.exceptions.fileencryptionfilter;

import java.io.*;

public class Encryption {

    public static void Encrypt(String text, int encKey, String fN) throws Exception {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fN));
        char[] array = new char[text.length()];
        StringBuilder enc = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            array[i] = (char) (text.charAt(i) + encKey);
        }

        for (char c : array)
            enc.append(c);

        o.writeObject(enc.toString());

        o.close();

    }
}
