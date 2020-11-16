package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Menu extends JFrame implements ActionListener{
    JFrame f;
    JTextArea tf;

    Menu(){
        f=new JFrame();
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        String [] dishTypes = {"", "Tomato soup", "Chicken soup", "Carbonara", "Fruit salad", "Pizza margherita"};
        JComboBox dishList = new JComboBox(dishTypes);
        dishList.addActionListener(this);
        p.add(dishList, BorderLayout.PAGE_START);
        tf = new JTextArea("Informacje o daniu");
        tf.setEditable(false);
        p.add(tf, BorderLayout.SOUTH);
        f.add(p);

        f.setSize(350,150);
        f.setVisible(true);
        f.setTitle("Menu");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String dishName = (String)cb.getSelectedItem();
        SimpleFactory sf = new SimpleFactory();
        Dish dish = sf.createDish(dishName);
        tf.setText( String.format( "Name: %s \nPrice: %.2f zł \nWeight: %d g \nIngredients: %s",
                dish.getName(), dish.getPrice(), dish.getWeight(), dish.getIngredient() ) );


    }
}
