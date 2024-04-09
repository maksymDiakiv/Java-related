import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //joptionpane pop up a standard dialog box that prompts users for a value or informs them of something
//        JOptionPane.showMessageDialog(null, "plain message", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "information message", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", "title", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "WARNING_MESSAGE", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "ERROR_MESSAGE", "title", JOptionPane.ERROR_MESSAGE);

    //JOptionPane.showConfirmDialog(null, "dd", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        //JOptionPane.showInputDialog("say my name");
        String[] responses = {"negro", "white", "slava ukraini"};
        JOptionPane.showOptionDialog(null, "text", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, responses, 0);

    }
}