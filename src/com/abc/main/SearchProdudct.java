package com.abc.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import com.abc.database.ProductDao;
import com.abc.model.Product;

public class SearchProdudct extends JFrame implements ActionListener {
    private ProductDao dao;
    private Product product;
    private JLabel jLabel[];
    private JTextField textField;
    private JPanel jPanel, jPanel2;
    private JButton b1[], b2;
    private String ar[] = {"Search By PrdId", "Search By Company Name",
            "Search By Product Type", "Search By Product Color",
            "Search By Quantity", "Search By Buy Price", "Search By Sell Price"};

    public SearchProdudct() throws HeadlessException, SQLException {
        dao = new ProductDao();
        jLabel = new JLabel[2];

        jLabel[0] = new JLabel("Search Page");
        jLabel[0].setFont(new Font(Font.DIALOG, Font.BOLD, 20));

        setLayout(new BorderLayout());
        jPanel = new JPanel();

        jPanel.add(jLabel[0]);
        add("North", jPanel);

        jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(6, 2));

        jLabel[1] = new JLabel("Enter Search Key");
        textField = new JTextField(10);

        b2 = new JButton("Cancel");

        jPanel2.add(jLabel[1]);
        jPanel2.add(textField);

        jPanel2.add(new JLabel(""));
        jPanel2.add(new JLabel(""));

        b1 = new JButton[7];
        for (int i = 0; i < b1.length; i++) {
            b1[i] = new JButton(ar[i]);
            b1[i].addActionListener(this);
            jPanel2.add(b1[i]);
        }

        jPanel2.add(b2);
        add("South", jPanel2);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        try {
            new SearchProdudct();
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        int prdid = 0;
        try {
            dao = new ProductDao();
            String s = textField.getText();
            if (s.isEmpty())
                JOptionPane.showMessageDialog(null, "product id is empty");
            else if (arg0.getActionCommand().equals("Search By PrdId")) {
                prdid = Integer.parseInt(s);
                Product searchProduct = dao.searchById(prdid);
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else
                    JOptionPane.showMessageDialog(null,
                            "product id found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + searchProduct.getPrdId() + "  "
                                    + searchProduct.getCname() + " "
                                    + searchProduct.getPrdType() + " "
                                    + searchProduct.getPrdColor() + " "
                                    + searchProduct.getQty() + " "
                                    + searchProduct.getBuyPrice() + " "
                                    + searchProduct.getSellPrice());
            } else if (arg0.getActionCommand().equals("Search By Company Name")) {
                List<Product> searchProduct = dao.searchByCname(s);
                if (searchProduct.size() == 0)
                    JOptionPane
                            .showMessageDialog(null, "product not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            } else if (arg0.getActionCommand().equals("Search By Product Type")) {
                List<Product> searchProduct = dao.searchByPrdType(s);
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            } else if (arg0.getActionCommand().equals("Search By Product Color")) {
                List<Product> searchProduct = dao.searchByPrdColor(s);
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            } else if (arg0.getActionCommand().equals("Search By Quantity")) {
                List<Product> searchProduct = dao.searchByQty(prdid);
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            } else if (arg0.getActionCommand().equals("Search By Buy Price")) {
                List<Product> searchProduct = dao.searchByBuyPrice(Float.parseFloat(s));
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            } else if (arg0.getActionCommand().equals("Search By Sell Price")) {
                List<Product> searchProduct = dao.searchBySellPrice(Float.parseFloat(s));
                if (searchProduct == null)
                    JOptionPane
                            .showMessageDialog(null, "product id  not found");
                else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Product p : searchProduct) {
                        stringBuffer.append("\n\n" + p.getPrdId() + "  "
                                + p.getCname() + " "
                                + p.getPrdType() + " "
                                + p.getPrdColor() + " "
                                + p.getQty() + " "
                                + p.getBuyPrice() + " "
                                + p.getSellPrice());
                    }
                    JOptionPane.showMessageDialog(null,
                            "product  found \n  PRDID CNAME PRDTYPE PRDCOLOR QTY BUYPRICE SELLPRICE\n"
                                    + stringBuffer);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "product id must be numeric");
        }
    }
}
