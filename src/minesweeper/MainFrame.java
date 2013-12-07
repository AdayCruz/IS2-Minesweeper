package minesweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    
    public MainFrame(){
        this.setTitle("Minesweeper");
        this.setMinimumSize(new Dimension(300,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(createMenuPanel(), BorderLayout.NORTH);
        this.add(createMainPanel());
        this.setVisible(true);
    }


    private JPanel createMenuPanel() {
        JPanel menu = new JPanel ();
        menu.setLayout (new FlowLayout(FlowLayout.LEFT));
        menu.add (new JMenu("File"));
        menu.add (new JMenu("Settings"));
        menu.add (new JMenu("About"));
        menu.setBackground(Color.WHITE);
        return menu;
    }

    private JPanel createMainPanel() {
        JPanel panel = new JPanel ();
        panel.setLayout (new FlowLayout());
        for (int i = 0; i < 12; i++) {
            JButton button = new JButton("Button "+Integer.toString(i));
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    showw(e);
                }
            });
            panel.add(button);
        }
        return panel;
    }
    
    private void showw(ActionEvent e){
        JButton button = (JButton)e.getSource();
        button.setLabel(button.getLabel()+" Pressed");
    }

}
