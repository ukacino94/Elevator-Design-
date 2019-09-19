package elavator_simulation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;

public class Elevator_design {

	private JFrame frame;
	private JTextField txtElevatorInterface;
	private JTextField txtCapacitylb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elevator_design window = new Elevator_design();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Elevator_design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(600, 600, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(209, 242, 141, -76);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(388, 65, 123, 53);
		frame.getContentPane().add(scrollPane);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("4");
		tglbtnNewToggleButton.setBackground(Color.PINK);
		scrollPane.setViewportView(tglbtnNewToggleButton);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(226, 65, 158, 53);
		frame.getContentPane().add(scrollPane_4);
		
		JToggleButton tglbtnDoorOpen = new JToggleButton("DOOR OPEN <|>");
		tglbtnDoorOpen.setBackground(Color.GREEN);
		scrollPane_4.setViewportView(tglbtnDoorOpen);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(226, 129, 158, 51);
		frame.getContentPane().add(scrollPane_5);
		
		JToggleButton tglbtnDoorClose = new JToggleButton("DOOR CLOSE >|<");
		tglbtnDoorClose.setBackground(Color.RED);
		scrollPane_5.setViewportView(tglbtnDoorClose);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(388, 129, 123, 53);
		frame.getContentPane().add(scrollPane_1);
		
		JToggleButton toggleButton = new JToggleButton("3");
		toggleButton.setBackground(Color.PINK);
		scrollPane_1.setViewportView(toggleButton);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(388, 193, 123, 53);
		frame.getContentPane().add(scrollPane_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("2");
		toggleButton_3.setBackground(Color.PINK);
		scrollPane_2.setViewportView(toggleButton_3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(388, 259, 123, 53);
		frame.getContentPane().add(scrollPane_3);
		
		JToggleButton toggleButton_1 = new JToggleButton("1");
		toggleButton_1.setBackground(Color.PINK);
		scrollPane_3.setViewportView(toggleButton_1);
		
		txtElevatorInterface = new JTextField();
		txtElevatorInterface.setBackground(Color.LIGHT_GRAY);
		txtElevatorInterface.setText("ElEVATOR INTERFACE");
		txtElevatorInterface.setBounds(322, 11, 123, 32);
		frame.getContentPane().add(txtElevatorInterface);
		txtElevatorInterface.setColumns(10);
		
		JToggleButton tglbtnEmergencyCall = new JToggleButton("EMERGENCY CALL");
		tglbtnEmergencyCall.setBackground(Color.RED);
		tglbtnEmergencyCall.setBounds(226, 193, 158, 53);
		frame.getContentPane().add(tglbtnEmergencyCall);
		
		JToggleButton tglbtnAlarm = new JToggleButton("ALARM");
		tglbtnAlarm.setBackground(Color.GREEN);
		tglbtnAlarm.setBounds(226, 259, 158, 53);
		frame.getContentPane().add(tglbtnAlarm);
		
		JList list = new JList();
		list.setBounds(262, 348, 1, 1);
		frame.getContentPane().add(list);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.RED);
		comboBox_1.setToolTipText("Dyscalculia");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Dyscalculia Aid ", "Floor One ", "floor Two ", "floor Three ", "floor Four"}));
		comboBox_1.setBounds(226, 323, 158, 72);
		frame.getContentPane().add(comboBox_1);
		
		txtCapacitylb = new JTextField();
		txtCapacitylb.setText("Capacity: 2500LB");
		txtCapacitylb.setBounds(388, 323, 123, 72);
		frame.getContentPane().add(txtCapacitylb);
		txtCapacitylb.setColumns(10);
	}
}
