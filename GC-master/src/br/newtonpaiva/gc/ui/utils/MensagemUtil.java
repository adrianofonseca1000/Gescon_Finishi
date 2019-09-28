/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.gc.ui.utils;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author tarle
 */
public class MensagemUtil {
    public static void exibirDialogo(String key) {
        JOptionPane.showMessageDialog(null, 
                ResourceBundle.getBundle("MessageBundle").getString(key));
    }
}
