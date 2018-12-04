/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman;

import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author QUANG
 */
public class Music {
      public static void play(String sound) {
        Runnable runnable = () -> {
            //tao khoi lenh
            try {
                ClassLoader loader = Thread.currentThread().getContextClassLoader();
                URL url = loader.getResource("./amThanh/" + sound + ".wav");
                String path = url.getPath();
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File(path)));
                
                if (sound.equals("background")) clip.loop(Clip.LOOP_CONTINUOUSLY);
                
                clip.start();
                
            } catch (Exception exc) {
                exc.printStackTrace(System.out);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
