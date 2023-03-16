package javaCaffe;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class JavaCaffe extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; ///warning nume clasa
	
	
	
	protected JButton btnNewButton_1;
	protected JButton btnNewButton_1_1;
	protected JButton btnNewButton_1_2;
	protected JButton btnNewButton_1_3;
	protected JButton btnNewButton_1_4;
	protected JButton btnNewButton_1_5;
	protected JButton btnNewButton_2;
	protected JButton btnNewButton_2_1;
	protected JButton btnNewButton_2_2;
	protected JButton btnNewButton_2_2_1;
	protected JButton btnNewButton_2_2_1_1;
	protected JButton btnNewButton_3;
	
	
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCaffe frame = new JavaCaffe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	
	
	
	
/////functie care citeste din fisier un String si il returneaza/////
	private String reader() throws FileNotFoundException{ 
		
		
            // Create new file
            String path="C:\\Users\\mihai\\OneDrive\\Desktop\\PIP-Proiect\\Cafenea\\src\\transfer_file.txt";
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            
            String textFinal = "";
            
            while (myReader.hasNextLine()) {
            	textFinal = textFinal+myReader.nextLine()+"\n";
		      } 
		      myReader.close();
		      
		      return textFinal;
	}
	
	

	public JavaCaffe() {

		
		
		////////DESIGN APLICATIE////////
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 538);//Dimensiuna ferestrei
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel SideMenu = new JPanel();
		SideMenu.setBackground(new Color(32, 178, 170));
		SideMenu.setBounds(0, 0, 201, 496);//Dimensiuna ferestrei
		contentPane.add(SideMenu);
		SideMenu.setLayout(null);
		

		final JTextArea textArea = new JTextArea();   /////Ecran pagina ORDERS
		textArea.setFont(new Font("Microsoft Tai Le", Font.BOLD, 20));
		textArea.setBounds(211, 21, 278, 443);//Dimensiuna casetei de text 
		contentPane.add(textArea);
		textArea.setVisible(false);
		
		
		
		
		/////////BUTOANE EXTRA////////	
		btnNewButton_2 = new JButton("Zahar");				
		btnNewButton_2.setBackground(new Color(255, 250, 240));		//background buton
		btnNewButton_2.setFont(new Font("Bodoni MT", Font.PLAIN, 11));	//font buton
		btnNewButton_2.setBounds(389, 167, 89, 23);			//Dimensiuna butonului
		btnNewButton_2.setVisible(false);				//vizibilitate false
		btnNewButton_2.setFocusPainted(false);				//chenar de focus off
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2_1 = new JButton("Lapte");
		btnNewButton_2_1.setBackground(new Color(255, 250, 240));		//background buton
		btnNewButton_2_1.setFont(new Font("Bodoni MT", Font.PLAIN, 11));	//font buton
		btnNewButton_2_1.setBounds(389, 189, 89, 23);				//Dimensiuna butonului
		btnNewButton_2_1.setVisible(false);					//vizibilitate false
		btnNewButton_2_1.setFocusPainted(false);				//chenar de focus off
		contentPane.add(btnNewButton_2_1);
		
		btnNewButton_2_2 = new JButton("Caramel");
		btnNewButton_2_2.setBackground(new Color(255, 250, 240));	//background buton
		btnNewButton_2_2.setFont(new Font("Bodoni MT", Font.PLAIN, 11));//font buton
		btnNewButton_2_2.setBounds(389, 211, 89, 23);			//Dimensiuna butonului
		btnNewButton_2_2.setVisible(false);				//vizibilitate false
		btnNewButton_2_2.setFocusPainted(false);			//chenar de focus off
		contentPane.add(btnNewButton_2_2);
		
		btnNewButton_2_2_1 = new JButton("Ciocolata");
		btnNewButton_2_2_1.setBackground(new Color(255, 250, 240));		c
		btnNewButton_2_2_1.setFont(new Font("Bodoni MT", Font.PLAIN, 11));	//font buton
		btnNewButton_2_2_1.setBounds(389, 233, 89, 23);				//Dimensiuna butonului
		btnNewButton_2_2_1.setVisible(false);					//vizibilitate false
		btnNewButton_2_2_1.setFocusPainted(false);				//chenar de focus off
		contentPane.add(btnNewButton_2_2_1);
		
		btnNewButton_2_2_1_1 = new JButton("Biscuiti");
		btnNewButton_2_2_1_1.setBackground(new Color(255, 250, 240));
		btnNewButton_2_2_1_1.setFont(new Font("Bodoni MT", Font.PLAIN, 11));
		btnNewButton_2_2_1_1.setBounds(389, 255, 89, 23);
		btnNewButton_2_2_1_1.setVisible(false);
		btnNewButton_2_2_1_1.setFocusPainted(false);
		contentPane.add(btnNewButton_2_2_1_1);
		
		
		
		
		/////////BUTOANE BAUTURI////////
		btnNewButton_3 = new JButton("DONE");
		btnNewButton_3.setBackground(new Color(255, 250, 240));
		btnNewButton_3.setFont(new Font("Bodoni MT", Font.PLAIN, 11));
		btnNewButton_3.setBounds(399, 287, 69, 23);
		btnNewButton_3.setVisible(false);
		btnNewButton_3.setFocusPainted(false);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("Cafea Lunga");
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1.setBounds(211, 40, 158, 43);
		btnNewButton_1.setVisible(false);
		btnNewButton_1.setFocusPainted(false);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton("Cafea Scurta");
		btnNewButton_1_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1_1.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1_1.setBounds(211, 111, 158, 43);
		btnNewButton_1_1.setVisible(false);
		btnNewButton_1_1.setFocusPainted(false);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_1_2 = new JButton("Frappe");
		btnNewButton_1_2.setBackground(new Color(240, 255, 240));
		btnNewButton_1_2.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1_2.setBounds(211, 183, 158, 43);
		btnNewButton_1_2.setVisible(false);
		btnNewButton_1_2.setFocusPainted(false);
		contentPane.add(btnNewButton_1_2);
		
		btnNewButton_1_3 = new JButton("Latte Macchiato");
		btnNewButton_1_3.setBackground(new Color(240, 255, 240));
		btnNewButton_1_3.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1_3.setBounds(211, 256, 158, 43);
		btnNewButton_1_3.setVisible(false);
		btnNewButton_1_3.setFocusPainted(false);
		contentPane.add(btnNewButton_1_3);
		
		btnNewButton_1_4 = new JButton("Ceai");
		btnNewButton_1_4.setBackground(new Color(240, 255, 240));
		btnNewButton_1_4.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1_4.setBounds(211, 328, 158, 43);
		btnNewButton_1_4.setVisible(false);
		btnNewButton_1_4.setFocusPainted(false);
		contentPane.add(btnNewButton_1_4);
		
		btnNewButton_1_5 = new JButton("Ciocolata Calda");
		btnNewButton_1_5.setBackground(new Color(240, 255, 240));
		btnNewButton_1_5.setFont(new Font("Bodoni MT", Font.ITALIC, 18));
		btnNewButton_1_5.setBounds(211, 402, 158, 43);
		btnNewButton_1_5.setVisible(false);
		btnNewButton_1_5.setFocusPainted(false);
		contentPane.add(btnNewButton_1_5);
		
		setLocationRelativeTo(null);
		
		
		
		////////LISTENERS////////
		btnNewButton_2.addActionListener(this);			//Ascultatori pentru toate butoanele
		btnNewButton_2_1.addActionListener(this);
		btnNewButton_2_2.addActionListener(this);
		btnNewButton_2_2_1.addActionListener(this);
		btnNewButton_2_2_1_1.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_1_2.addActionListener(this);
		btnNewButton_1_3.addActionListener(this);
		btnNewButton_1_4.addActionListener(this);
		btnNewButton_1_5.addActionListener(this);
		
		
		
		
		/////////BUTON HOME////////
		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(new Color(240, 255, 240));		//background buton
		btnHome.setFont(new Font("Bodoni MT", Font.BOLD, 18));		//Font buton
		btnHome.addActionListener(new ActionListener() {		//ascultator buton HOME
			public void actionPerformed(ActionEvent e) { 		/////cand butonul HOME este apasat vizibilitatea 
				btnNewButton_1.setVisible(true);		/////butoanelor de mai jos va fi setata pe true
				btnNewButton_1_1.setVisible(true);
				btnNewButton_1_2.setVisible(true);
				btnNewButton_1_3.setVisible(true);
				btnNewButton_1_4.setVisible(true);
				btnNewButton_1_5.setVisible(true);
				btnNewButton_2.setVisible(true);
				btnNewButton_2_1.setVisible(true);
				btnNewButton_2_2.setVisible(true);
				btnNewButton_2_2_1.setVisible(true);
				btnNewButton_2_2_1_1.setVisible(true);
				textArea.setVisible(false);			/////cand butonul HOME este apasat vizibilitatea casetei de text va fi setata pe false
				btnNewButton_3.setVisible(true);
			}
		});
		btnHome.setBounds(32, 243, 137, 53);		//dimensionare buton
		btnHome.setFocusPainted(false);			//dezactivare focus buton
		SideMenu.add(btnHome);
		
		
		
		
		/////////BUTON ORDER////////
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.setBackground(new Color(240, 255, 240));		//background buton
		btnNewButton.setFont(new Font("Bodoni MT", Font.BOLD, 18));	//Font buton
		btnNewButton.addActionListener(new ActionListener() {		//ascultator buton ORDER
			public void actionPerformed(ActionEvent arg0) {		/////cand butonul ORDER este apasat vizibilitatea 
				btnNewButton_1.setVisible(false);				/////butoanelor de mai jos va fi setata pe false
				btnNewButton_1_1.setVisible(false);
				btnNewButton_1_2.setVisible(false);
				btnNewButton_1_3.setVisible(false);
				btnNewButton_1_4.setVisible(false);
				btnNewButton_1_5.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnNewButton_2_1.setVisible(false);
				btnNewButton_2_2.setVisible(false);
				btnNewButton_2_2_1.setVisible(false);
				btnNewButton_2_2_1_1.setVisible(false);
				textArea.setVisible(true);					/////cand butonul ORDER este apasat vizibilitatea casetei de text va fi setata pe true
				btnNewButton_3.setVisible(false);
				textArea.setText("");
				try {
					textArea.append(reader());				/////adaugam textul in caseta de text folosing functia reader()
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(32, 307, 137, 53);		//dimensionare buton
		btnNewButton.setFocusPainted(false);			//dezactivare focus buton
		SideMenu.add(btnNewButton);
		
		JLabel label = new JLabel("");			////label in care se afla imaginea din aplicatie
		Image img = new ImageIcon(this.getClass().getResource("/Java-icon.png")).getImage(); ///stabilire locatie imagine
		label.setIcon(new ImageIcon(img));		///setare imagine din label
		label.setBounds(32, -92, 315, 429);		///dimensionare label
		SideMenu.add(label);
		
		
		/////JAVA CAFFE//////
		txtJavaCaffe = new JTextField();				///logo-ul de sub HOME si ORDER e doar un text field
		txtJavaCaffe.setBorder(null);
		txtJavaCaffe.setBackground(new Color(32, 178, 170));		//setam culoare fontul si dimensiuniile dedesupt
		txtJavaCaffe.setFont(new Font("Palace Script MT", Font.BOLD, 50));
		txtJavaCaffe.setHorizontalAlignment(SwingConstants.CENTER);
		txtJavaCaffe.setText("Java Caffe");
		txtJavaCaffe.setBounds(0, 397, 201, 72);
		SideMenu.add(txtJavaCaffe);
		txtJavaCaffe.setColumns(10);
		

		
		
		
	}
	
	
	
	/////CODUL UNIC/////
	String code ="";		//codul cu pe care daca il decodam aflam comanda plasata
	
	
	/////JAVA CAFFE//////
	private JTextField txtJavaCaffe;	///aici a fost declarat textul de sub butoanele HOME si ORDER
	
	
	
	//////CREARE CODULUI UNIC IN FUNCTIE DE APASARILE PE BUTOANE///////
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnNewButton_1)		//daca apasam btnNewButton_1 string-ul code devine code+1 la fel si mai jos
			code=code+1;
		
		if(e.getSource() == btnNewButton_1_1)
			code=code+2;
			
		if(e.getSource() == btnNewButton_1_2)
			code=code+3;
			
		if(e.getSource() == btnNewButton_1_3)
			code=code+4;
			
		if(e.getSource() == btnNewButton_1_4)
			code=code+5;
			
		if(e.getSource() == btnNewButton_1_5)
			code=code+6;
		
		if(e.getSource() == btnNewButton_2)
			code=code+'a';
		
		if(e.getSource() == btnNewButton_2_1)
			code=code+'b';
		
		if(e.getSource() == btnNewButton_2_2)
			code=code+'c';
			
		if(e.getSource() == btnNewButton_2_2_1)
			code=code+'d';
			
		if(e.getSource() == btnNewButton_2_2_1_1)
			code=code+'e';
			
		if(e.getSource() == btnNewButton_3)
		{
			code=code+'x'; ///x-l e un indicator cu ajutorul caruia vom sti cand sa afisam comanda
			decoder(code); ///apelam functia care decodifica comanda
			code="";	   ///resetam codul unic
		}
			
			

	}
	
	
	////////FUNCTIE DE SCRIERE IN FISIER/////////
	
	private void writer(String content){
		
		try{
            // Create new file
            String path="C:\\Users\\mihai\\OneDrive\\Desktop\\PIP-Proiect\\Cafenea\\src\\transfer_file.txt";
            File file = new File(path);

            // daca locatia nu exista o cream automat
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.append(content);

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	
	
	
	////////FUNCTIE DE DECODARE COD UNIC PENTRU SCRIERE IN FISIER/////////

	private void decoder(String code2) {
		
		Bautura bautura = new Cafea_scurta();
		DecimalFormat dformat = new DecimalFormat("#.##");	///functie pt afisare pret in format #.##
		
		
		for (int i = 0; i < code2.length(); i++)		///aici incepe decodare codului nostru unic
		{
			switch (code2.charAt(i))
			{
			case '1':					///daca primul caracter este 1 facem o bautura noua folosing concrete component Cafea_Lunga()
				bautura = new Cafea_Lunga();
				break;
			case '2':
				bautura = new Cafea_scurta();
				break;
			case '3':
				bautura = new Frappe();
				break;
			case '4':
				bautura = new Latte_macchiato();
				break;
			case '5':
				bautura = new Tea();
				break;
			case '6':
				bautura = new Hot_Chocolate();
				break;
			case 'a':
				bautura = new Zahar(bautura);		///daca caracterul este a, adaugam zahar la bautura folosing concreteDecorator Zahar(bautura)
				break;
			case 'b':
				bautura = new Lapte(bautura);
				break;
			case 'c':
				bautura = new Caramel(bautura);
				break;
			case 'd':
				bautura = new Ciocolata(bautura);
				break;
			case 'e':
				bautura = new Biscuiti(bautura);
				break;
			case 'x':					///daca caracterul este x formam string-ul final cu ajutorul functiei writer care ne va scrie in textArea comanda noastra completa
				writer("Desc: "+bautura.getDesc()+"\n"+"Price: "+dformat.format(bautura.getPrice()));
				break;
			}
			
		}
		
	}
}
