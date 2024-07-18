package Views;

import Controllers.BicycleController;
import Models.Bicycle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BicycleView extends JFrame {
    private JTextField txtGear;
    private JTextField txtSpeed;
    private JButton btnAddBike;
    private JButton btnAccelerate;
    private JButton btnApplyBreak;
    private JLabel lblCurrentSpeed;
    private JPanel BackPanel;
    BicycleController controller;
    Bicycle bicycle;
public BicycleView() {
    btnAddBike.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int gear = Integer.parseInt(txtGear.getText());
            double speed  = Double.parseDouble(txtSpeed.getText());
            controller = new BicycleController();
            bicycle = controller.addBicycle(gear,speed);
            JOptionPane.showMessageDialog(rootPane,"The Bicycle is added successfully",
                    "Success",0);
            lblCurrentSpeed.setText(bicycle.toString());
        }
    });
    btnApplyBreak.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double decrement = Double.parseDouble(txtSpeed.getText());
            bicycle.applyBreak(decrement);
            JOptionPane.showMessageDialog(rootPane,"The break is applied","Success",0);
            lblCurrentSpeed.setText(bicycle.toString());
        }
    });
    btnAccelerate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double increment = Double.parseDouble(txtSpeed.getText());
            bicycle.speedUp(increment);
            JOptionPane.showMessageDialog(rootPane,"Speed Up !!","Success",0);
            lblCurrentSpeed.setText(bicycle.toString());
        }
    });
}

    public static void main(String[] args) {
        BicycleView ui = new BicycleView();
        ui.setContentPane(ui.BackPanel);
        ui.setTitle(" Bicycle Management ");
        ui.setSize(600,600);
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setVisible(true);
    }
}
