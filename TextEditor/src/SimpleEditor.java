/**
 * @author Anthony Walker
 * @date 2.27.2014
 */

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.WindowConstants;
import java.awt.EventQueue;

public class SimpleEditor extends JFrame{
    public SimpleEditor(){
        initializeGUI();
    }
    
    public void initializeGUI(){
        mainPanel = new JScrollPane();
        textBox = new JTextArea();
        menuBar = new JMenuBar();
        
        file = new JMenu();
            JMenuItem newItem = new JMenuItem("New");
            JMenuItem open = new JMenuItem("Open");
            JMenuItem save = new JMenuItem("Save");
            JMenuItem saveAs = new JMenuItem("Save As...");
            JMenuItem print = new JMenuItem("Print...");
            file.add(open);
        edit = new JMenu();
        view = new JMenu();
        tools = new JMenu();
        help = new JMenu();
        
        file.setText("File");
        edit.setText("Edit");
        view.setText("View");
        tools.setText("Tools");
        help.setText("Help");
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        menuBar.add(tools);
        menuBar.add(help);
        
        setJMenuBar(menuBar);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override public void run(){
                new SimpleEditor().setVisible(true);
            }
        });
    }
    
    private JScrollPane mainPanel;
    private JTextArea textBox;
    private JMenuBar menuBar;
    
    private JMenu file;
    private JMenu edit;
    private JMenu view;
    private JMenu tools;
    private JMenu help;
}
