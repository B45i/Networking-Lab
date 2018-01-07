import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class StudentApplet extends Applet implements ActionListener, ItemListener {

	Label nameLabel 			= new Label("Name: ");
	Label contactAddressLabel 	= new Label("Contact Addrss: ");
	Label permAddressLabel 		= new Label("Premenent Address: ");
	Label isSameLabel			= new Label("Permanent address is same as contact address: ");
	Label genderLabel			= new Label("Gender: ");
	Label dummyLabel			= new Label("");

	
	TextField nameField 		= new TextField(2);

	TextArea contactArea 		= new TextArea(10, 10);
	TextArea permArea 			= new TextArea(10, 10);

	Checkbox isSameBox 			= new Checkbox("yes");
	CheckboxGroup genderGroup	= new CheckboxGroup();
	Checkbox maleCheckBox 		= new Checkbox("Male", genderGroup, true);
	Checkbox femaleCheckBox		= new Checkbox("Female", genderGroup, false);
	
	Button saveButton 			= new Button("Save");
	Button clearButton			= new Button("Clear");

	public void init() {
		setLayout(new GridLayout(8, 2));

		clearButton.addActionListener(this);
		isSameBox.addItemListener(this);

		add(nameLabel);
		add(nameField);

		add(contactAddressLabel);
		add(contactArea);

		add(isSameLabel);
		add(isSameBox);

		add(permAddressLabel);
		add(permArea);

		add(genderLabel);
		add(maleCheckBox);
		add(dummyLabel);
		add(femaleCheckBox);

		add(saveButton);
		add(clearButton);
	}
	

	public void actionPerformed(ActionEvent ae) {
			nameField.setText(" ");
			contactArea.setText(" ");;
			permArea.setText(" ");			

	}

	public void itemStateChanged(ItemEvent ie) {
		if(isSameBox.getState()) {
			permArea.setText(contactArea.getText());
		}
		else {
			permArea.setText(" ");
			
		}
	}
}

/*
<html>
<applet code="StudentApplet.class" width="400" height="400"> s</applet>
</html>
*/
