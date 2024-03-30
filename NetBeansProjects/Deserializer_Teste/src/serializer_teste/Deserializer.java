/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializer_teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Murilo
 */
public class Deserializer implements Serializable {

    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        User user = null;
        String path = "C:\\Users\\Murilo\\Documents\\NetBeansProjects\\Deserializer_Teste\\src\\deserializer\\userInfo.ser";

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Murilo\\Documents\\NetBeansProjects\\Serializer_Teste\\userInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();

        System.out.println(user.nome);
        System.out.println(user.senha);
    }

}
