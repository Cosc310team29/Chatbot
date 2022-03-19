package gui;
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
        String textInput = JOptionPane.showInputDialog(frame, "Enter Hello to chat: ");
       JOptionPane.showMessageDialog(frame, "You wrote: " + textInput);
        System.out.println(textInput);
        if (textInput.equals("Hello")) {
        	String option = JOptionPane.showInputDialog(frame, "what can I help you today?\r\n" + "1 issue with the item\r\n"
        			+ "2 item not yet received\r\n"
        			+ "3 comments to the item\r\n"
        			+ "4 for the person-person customer service\r\n");
        	if (option.equals("1")) {
        		JOptionPane.showMessageDialog(frame, " Your item have an issue");
        	}else if (option.equals("2")) {
        		JOptionPane.showMessageDialog(frame, " Your item will be arrive in serval days");
        }else if (option.equals("3")) {
    		JOptionPane.showMessageDialog(frame, " We have recieved your comments");
    }else if (option.equals("4")) {
		JOptionPane.showMessageDialog(frame, " The number of customer service is (604)-617-7777");
}
        }else {
        	JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
        }
    }
    }
    public static void main(String[] args){
   
        new GUI();
        
    }


}
