package List_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class List_4a extends JFrame {

	private JPanel contentPane;
	private JTextField txttags;
	private JTextField txtclasses;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List_4a frame = new List_4a();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public List_4a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IDs = new JLabel("- Qtde de Seletores IDs");
		IDs.setBounds(40, 21, 148, 14);
		contentPane.add(IDs);
		
		JLabel Classes = new JLabel("- Qtde de Seletores Classes");
		Classes.setBounds(40, 69, 168, 14);
		contentPane.add(Classes);
		
		JLabel Tags = new JLabel("- Qtde de Seletores Tags");
		Tags.setBounds(40, 125, 168, 14);
		contentPane.add(Tags);
		
		JButton Calcular = new JButton("C\u00E1lcular");
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int classe = Integer.parseInt(txtclasses.getText());
				int ism = Integer.parseInt(txtid.getText());
				int tg = Integer.parseInt(txttags.getText());
				int c,id, Total;
				
				c=classe*10;
				id=ism *100;
				Total = (id+c+tg);
				
				JOptionPane.showMessageDialog(null, "A Quantidade total de pontos é: " + Total + "\n IDs = " + id + "\nClasses = " + c + "\nTags = " + tg);
				
			}
		});
		Calcular.setForeground(Color.BLACK);
		Calcular.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		Calcular.setBounds(139, 209, 168, 41);
		contentPane.add(Calcular);
		
		txttags = new JTextField();
		txttags.setBounds(40, 150, 117, 20);
		contentPane.add(txttags);
		txttags.setColumns(10);
		
		txtclasses = new JTextField();
		txtclasses.setBounds(40, 94, 117, 20);
		contentPane.add(txtclasses);
		txtclasses.setColumns(10);
		
		txtid = new JTextField();
		txtid.setBounds(40, 38, 117, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
	}
}
