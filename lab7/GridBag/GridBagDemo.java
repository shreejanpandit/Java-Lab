import java.awt.*;
// import java.awt.GridBagConstraints;

class GridBagDemo
{
	GridBagDemo()
	{
		Frame f = new Frame("Form");
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(new GridBagLayout());
		gbc.insets = new Insets(2, 2, 2, 2); 

		Label name = new Label("Names:");
		Label bio = new Label("Bio:");
		Label cL = new Label("country:");
		Label hbb = new Label("Hobbies:");
		Label gen = new Label("Gender:");

		TextField nameF = new TextField();
		TextArea bioA = new TextArea();
		Choice country=new Choice();  
		Checkbox c1 = new Checkbox("Coding");  
		Checkbox c2 = new Checkbox("Dancing"); 
		CheckboxGroup cbg = new CheckboxGroup();  
		Checkbox c3 = new Checkbox("Male",cbg,true);  
		Checkbox c4 = new Checkbox("Female",cbg,false);  
		Checkbox c5 = new Checkbox("Others",cbg,false);  

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.gridx = 0;
		gbc.gridy = 0;
    	name.setBounds(10,10,120,100);
    	nameF.setBounds(50,50,120,120);
		f.add(name, gbc);
		gbc.gridx = 1;
		f.add(nameF, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;  
    	gbc.gridy = 1;
    	bio.setBounds(10,10,120,100);
    	bioA.setBounds(50,50,120,120);
		f.add(bio, gbc);
		gbc.gridx = 1;
		f.add(bioA, gbc);

		// For choice 
		gbc.gridx = 0;
		gbc.gridy = 3;
		cL.setBounds(10,10,120,100);
		f.add(cL,gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		country.setBounds(50,50,120,120);
		country.add("Nepal");  
        country.add("India");  
        country.add("China");
        gbc.gridx = 1;
        f.add(country,gbc);

        //  For Hobbies
        gbc.gridx = 0;
		gbc.gridy = 5;
		hbb.setBounds(10,10,120,100);
		f.add(hbb,gbc);

		gbc.gridx = 5;
		gbc.gridy = 5;
		c1.setBounds(10,10,120,120);
		c2.setBounds(10,10,120,120);
		gbc.gridx = 1;
		f.add(c1,gbc);

		gbc.gridx = 6;
		gbc.gridy = 6;
		gbc.gridx = 1;
		f.add(c2,gbc);

		// Fro Gender
		gbc.gridx = 0;
		gbc.gridy = 7;
		cL.setBounds(10,10,120,100);
		f.add(gen,gbc);

		gbc.gridx = 8;
		gbc.gridy = 8;
		c3.setBounds(10,10,120,120);
		c4.setBounds(10,10,120,120);
		gbc.gridx = 1;
		f.add(c3,gbc);

		gbc.gridx = 9;
		gbc.gridy = 9;
		gbc.gridx = 1;
		f.add(c4,gbc);

		gbc.gridx = 10;
		gbc.gridy = 10;
		gbc.gridx = 1;
		f.add(c5,gbc);


		f.setSize(600,600);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new GridBagDemo();
	}
}