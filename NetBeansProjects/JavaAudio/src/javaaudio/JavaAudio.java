/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaaudio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioFileFormat.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author Murilo
 */
public class JavaAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String r = "";
        Scanner scanner = new Scanner(System.in);
        
        File file = new File("happy-mistake.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        while(!r.equals("F")){
           System.out.print("\nPlay = P; Stop = S; Reiniciar = R; Fechar = F;\n");
           System.out.println("Escreva o comando: ");
           r = scanner.nextLine();
           r = r.toUpperCase();
           
           switch(r){
               case("P"): clip.start();
                   break;
               case("S"): clip.stop();
                   break;
               case("R"): clip.setMicrosecondPosition(0);
                   break;
               case("F"): System.out.println("Fechando programa!");
               clip.close();
                   break;
               default: System.out.println("Comando não Reconhecido!");
           }
        }
        
        
        
        
        
    }
    
}
