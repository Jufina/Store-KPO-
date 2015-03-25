package cashbox;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
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
    public int ID=0;//ID Для чеков!
    int idCashier;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CashBox");
        frame.setContentPane(new CashBox().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CashBox() {
       openCheck.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //labelCashier.setVisible(false); - для проверки
                ID++;
                openCheck(ID);  //Передача ID чека. Можно так же создать переменную номера чека для каждой кассы(увеличивающееся), которая будет отвечать за чеки!
            }
        });

        closeCheck.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                closeCheck(ID);  //Передача ID чека. Можно так же создать глобальную переменную, которая будет отвечать за чеки!
            }
        });
    }
    public void openCheck(int id) {   //Метод создания нового чека. Нужен ли вообще ID(один чек для одного кассового аппарата!!)
        Check check=new Check(id);
    }
    public double closeCheck(int id) { //Метод закрытия чека(возвращение стоимости товаров)
        //Пройти по всем чекам, чтобы найти тот. Либо придётся сохранять ссылку на последний созданный чек!
        /*return check.getCheckCost();*/
        return 0;
    }
}
