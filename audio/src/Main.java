// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        File file = new File("muson.wav");
        Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        String resposne = "";
        while (!resposne.equals("Q")){
            System.out.println("P == play S == stop R == reset Q == quit");
            System.out.print(" enter your choice");
            resposne = scanner.next();
            resposne = resposne.toUpperCase();

            switch (resposne){
                case ("P"): clip.start();
                break;
                case ("S"):   clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default: System.out.println("not a valid response");
            }
        }

    }
}