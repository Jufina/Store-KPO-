package cashbox;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
    List<Product> check;
    int idCashier; //=labelCashier

    public static void main(String[] args) {
        JFrame frame = new JFrame("CashBox");
        frame.setContentPane(new CashBox().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CashBox() {
        idCashier=Integer.parseInt(labelCashier.getText()); //ID Кассира = надписи на лейбеле
       openCheck.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                labelCashier.setVisible(false);
                openCheck();  //Передача ID чека.
            }
        });

        closeCheck.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                closeCheck();  //Передача ID чека.
            }
        });
    }
    public void openCheck() {   //Метод создания нового чека(создаём новый список из товаров)
        check=new ArrayList<Product>();
    }
    public void pushToCheck(Product product) { //Добавление товара в чек
        check.add(product);
    }
    public double closeCheck() {
        double costCheck=0;
        for(Product x:check) {
            costCheck+=x.getPrice();
        }
        check.clear();          // Очистка чека
        return costCheck;       //Возращение стоимости чека
    }
}
