/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.Icon;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Botao extends javax.swing.JButton {

    private Icon icon;
    private Clip oClip;
    private AudioInputStream oStream;

    public Icon getIco() {
        return icon;
    }

    public void reproduzSom(URL som) {
        //funçao responsavel por reproduzir o som no jogo
        try {
            oClip = AudioSystem.getClip();

            oStream = AudioSystem.getAudioInputStream(som);
            oClip.open(oStream);
            oClip.loop(0);
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {

        }

    }

    public void stopWav() {
        try {
            oClip.stop();
            oStream.close();
        } catch (Exception ex) {
        }
    }

}
