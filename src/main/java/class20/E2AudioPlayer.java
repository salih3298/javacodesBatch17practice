package class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
       // FileInputStream fis = new FileInputStream("C:\\Users\\salih\\IdeaProjects\\SDET Batch 17\\src\\main\\java\\class20\\OneRepublic.mp3");
        FileInputStream fis = new FileInputStream("C:\\Users\\salih\\IdeaProjects\\SDET Batch 17\\src\\main\\java\\class20\\Melike Şahin-DivaYorgun78f4.mp3");
        Player mp3Player=new Player(fis);
        mp3Player.play();
    }

}
