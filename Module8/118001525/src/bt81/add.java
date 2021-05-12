package bt81;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class add extends JDialog {
	public add()
	{
		this.setTitle("Th�m ");
		addControls();
		addEvents();
	}
	JTextField txt1,txt2,txt3;
	JButton btn;
	private void addEvents() {
		// TODO Auto-generated method stub
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nguoi o=new nguoi();
				o.setFirstName(txt1.getText());
				o.setLastName(txt2.getText());
				o.setYears(txt3.getText());
				philosopher.ds.add(o);
				philosopher.loadData();
				dispose();
			}
		});
	}
	private void addControls() {
		// TODO Auto-generated method stub
		Container con=getContentPane();
		con.setLayout(new BoxLayout(con,BoxLayout.Y_AXIS));
		txt1=new JTextField(15);
		txt2=new JTextField(15);
		txt3=new JTextField(15);
		btn=new JButton("Them");
		con.add(txt1);
		con.add(txt2);
		con.add(txt3);
		con.add(btn);
	}
	public void showWindown() {
		this.setSize(400, 350);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
