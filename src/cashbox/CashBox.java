package cashbox;

import javax.swing.*;

/**
 * Created by Julia on 25.03.2015.
 */
public class CashBox {
    private JPanel panel1;
    private JTable table1;
    private JButton closeCheck;
    private JButton openCheck;
    private JButton putDiscountCard;
    private JButton enterCode;
    private JButton enterCount;
    private JTextArea labelCashier;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CashBox");
        frame.setContentPane(new CashBox().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CashBox() {
    }
}
