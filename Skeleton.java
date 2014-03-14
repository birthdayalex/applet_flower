/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivz;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Windows
 */
public class Skeleton extends JFrame {

    /**
     * @param args the command line arguments
     */
    public Skeleton() {
        add(new Board());
        setTitle("Skeleton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Skeleton();
    }

}
