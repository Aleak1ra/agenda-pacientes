/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

import javax.swing.SwingUtilities;
import view.PainelGeral;


/**
 *
 * @author Alexandre Gonçalves
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new PainelGeral().setVisible(true);
            }
        });
    }
    
}
