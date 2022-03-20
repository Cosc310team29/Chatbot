package gui;
import java.awt.BorderLayout;
import java.util.Dictionary;
import java.awt.*;
import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class GUI {


    public GUI(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Click anywhere to start conversation");
        String textInput = "";

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chabot");
        frame.pack();
        frame.setVisible(true);
        for (int i = 0; i <30; i++){
        textInput = JOptionPane.showInputDialog(frame, "Enter Hello to chat: ");

        if (textInput.equalsIgnoreCase("Hello") || textInput.equalsIgnoreCase("Hey") || textInput.equalsIgnoreCase("Hi")) {
        	for (int j = 0; j <30; j++){
        	String option = JOptionPane.showInputDialog(frame, "what can I help you today?\r\n" + "1 issue with the item\r\n"
        			+ "2 item not yet received\r\n"
        			+ "3 comments to the item\r\n"
        			+ "4 for the person-person customer service\r\n");
        	if (option.equals("1")) {
                JOptionPane.showMessageDialog(frame, " Your item have an issue");
                j = 31;
        	}else if (option.equals("2")) {
                JOptionPane.showMessageDialog(frame, " Your item will be arrive in serval days");
                j = 31;
            }else if (option.equals("3")) {
            JOptionPane.showMessageDialog(frame, " We have recieved your comments");
            
            if (textInput.equalsIgnoreCase("What time is it") || textInput.equalsIgnoreCase("What day is it")){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime current = LocalDateTime.now();
                JOptionPane.showMessageDialog(frame, dtf.format(current));
                }
                j = 31;
    }else if (option.equals("4")) {
		JOptionPane.showMessageDialog(frame, " The number of customer service is (604)-617-7777");
		j=31;
}else {
	JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
}
        }
        }else {
        	JOptionPane.showMessageDialog(frame, "You wrote an invalid command, please try again ");
        }
    }
    

    JOptionPane.showMessageDialog(frame, "You wrote: " + reply);


}

    public static void main(String[] args){
   
        new GUI();
        //SpellChk spl = new SpellChk();
        //spl.Dictionary1(textInput);
    }
}
