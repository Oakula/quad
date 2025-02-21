/*
 * Classname: QuadrantUsr
 * Author: Callum Warrilow
 * Desc: User class to allow interaction with the QUAD app GUI
 */

// ----- IMPORT STATEMENTS -----
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

class MainFrame extends JFrame {

    // ----- CONSTRUCTOR -----
    public MainFrame(){
        super("QUAD");
        setMinimumSize(new Dimension(440,440));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        buildGUI();
        setVisible(true);
    } // end CONSTRUCTOR

    // ----- METHODS -----

    /* method that creates objects of each component of the and positions
    it into a grid shape */
    private void buildGUI(){
        // adding the TopMenu
        TopMenu topMenu = new TopMenu("File", "Edit", "Insert");
        setJMenuBar(topMenu);

        // add new set of quadrants
        Quadrant quad = new Quadrant();

        // set quadrants out in centre of JFrame
        GridBagConstraints quadC = new GridBagConstraints();
        quadC.gridx = 10;
        quadC.gridy = 8;
        quadC.weightx = 0;
        quadC.weighty = 0;

        add(quad, quadC);

    } // end buildGUI()
} // end MainFrame
