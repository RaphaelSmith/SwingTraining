import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.*;


public class training01 extends JFrame{

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        new training01();
}

    public training01(){
        this.setSize(300, 300);
        this.setVisible(true);
        this.setTitle("My Window");

        GridLayout manager = new GridLayout(4, 4);
        this.setLayout(manager);

        // JPanel myPanel = new JPanel();
        // this.add(myPanel);

        // JLabel myLabel = new JLabel("Hello World!");
        // myPanel.add(myLabel);

        JButton but1 = new JButton("Button 1");
        this.add(but1);
        JButton but2 = new JButton("Button 2");
        this.add(but2);
        JButton but3 = new JButton("Button 3");
        this.add(but3);
        JButton but4 = new JButton("Button 4");
        this.add(but4);




        this.validate();
        this.repaint();

}
    
}