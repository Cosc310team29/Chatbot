import java.awt.BorderLayout;

import javax.swing.*;

public class GUI {


    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Click anywhere to start conversation");

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chabot");
        frame.pack();
        frame.setVisible(true);
        for (int i = 0; i <30; i++){
        String textInput = JOptionPane.showInputDialog(frame, "Enter text to chat: ");
       JOptionPane.showMessageDialog(frame, "You wrote: " + textInput);
        System.out.println(textInput);
        }
    }
    public static void main(String[] args){
   
        new GUI();
    }


}