package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import main.Lista;
import main.RadixVsCounting;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterfazPrincipal {
	private JLabel lblCountingSort,lblTime,lblRadixSort,lblTime_1,lblListaSinOrdenar;
	private JButton btnCrear,btnOrdenar;
	private JTextArea txtTimeCounting,txtAreaCounting, txtTimeRadix, txtAreaLista, textAreaRadix ;
	private JFrame frame;
	private JTextField txtIngreseElTamao;
	Lista arreglo;
	RadixVsCounting rc;
	/**
	 * Launch the application.
	 */
	
	public void executeInterfaz() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPrincipal window = new InterfazPrincipal();
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
	public InterfazPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 853, 0};
		gbl_panel.rowHeights = new int[]{0, 150, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblCountingSort = new JLabel("Counting Sort");
		lblCountingSort.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblCountingSort = new GridBagConstraints();
		gbc_lblCountingSort.anchor = GridBagConstraints.WEST;
		gbc_lblCountingSort.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountingSort.gridx = 0;
		gbc_lblCountingSort.gridy = 0;
		panel.add(lblCountingSort, gbc_lblCountingSort);
		
		lblTime = new JLabel("Time : ");
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblTime.gridx = 1;
		gbc_lblTime.gridy = 0;
		panel.add(lblTime, gbc_lblTime);
		
		txtTimeCounting = new JTextArea();
		GridBagConstraints gbc_txtTimeCounting = new GridBagConstraints();
		gbc_txtTimeCounting.insets = new Insets(0, 0, 5, 0);
		gbc_txtTimeCounting.fill = GridBagConstraints.BOTH;
		gbc_txtTimeCounting.gridx = 2;
		gbc_txtTimeCounting.gridy = 0;
		panel.add(txtTimeCounting, gbc_txtTimeCounting);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		txtAreaCounting = new JTextArea();
		txtAreaCounting.setLineWrap(true);
		scrollPane_1.setViewportView(txtAreaCounting);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{93, 0, 853, 0};
		gbl_panel_1.rowHeights = new int[]{0, 150, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblRadixSort = new JLabel("Radix Sort");
		lblRadixSort.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRadixSort.setForeground(Color.BLACK);
		lblRadixSort.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblRadixSort = new GridBagConstraints();
		gbc_lblRadixSort.anchor = GridBagConstraints.WEST;
		gbc_lblRadixSort.fill = GridBagConstraints.VERTICAL;
		gbc_lblRadixSort.insets = new Insets(0, 0, 5, 5);
		gbc_lblRadixSort.gridx = 0;
		gbc_lblRadixSort.gridy = 0;
		panel_1.add(lblRadixSort, gbc_lblRadixSort);
		
		lblTime_1 = new JLabel("Time : ");
		GridBagConstraints gbc_lblTime_1 = new GridBagConstraints();
		gbc_lblTime_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTime_1.gridx = 1;
		gbc_lblTime_1.gridy = 0;
		panel_1.add(lblTime_1, gbc_lblTime_1);
		
		txtTimeRadix = new JTextArea();
		GridBagConstraints gbc_txtTimeRadix = new GridBagConstraints();
		gbc_txtTimeRadix.insets = new Insets(0, 0, 5, 0);
		gbc_txtTimeRadix.fill = GridBagConstraints.BOTH;
		gbc_txtTimeRadix.gridx = 2;
		gbc_txtTimeRadix.gridy = 0;
		panel_1.add(txtTimeRadix, gbc_txtTimeRadix);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridwidth = 3;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 1;
		panel_1.add(scrollPane_2, gbc_scrollPane_2);
		
		textAreaRadix = new JTextArea();
		textAreaRadix.setLineWrap(true);
		scrollPane_2.setViewportView(textAreaRadix);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{68, 0, 0, 720, 0};
		gbl_panel_2.rowHeights = new int[]{20, 173, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblListaSinOrdenar = new JLabel("Lista Sin ordenar");
		lblListaSinOrdenar.setForeground(Color.RED);
		lblListaSinOrdenar.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblListaSinOrdenar = new GridBagConstraints();
		gbc_lblListaSinOrdenar.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaSinOrdenar.gridx = 0;
		gbc_lblListaSinOrdenar.gridy = 0;
		panel_2.add(lblListaSinOrdenar, gbc_lblListaSinOrdenar);
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCrear();
			}
		});
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrear.gridx = 1;
		gbc_btnCrear.gridy = 0;
		panel_2.add(btnCrear, gbc_btnCrear);
		
		btnOrdenar = new JButton("Ordenar");
		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrdenar();
			}
		});
		GridBagConstraints gbc_btnOrdenar = new GridBagConstraints();
		gbc_btnOrdenar.insets = new Insets(0, 0, 5, 5);
		gbc_btnOrdenar.gridx = 2;
		gbc_btnOrdenar.gridy = 0;
		panel_2.add(btnOrdenar, gbc_btnOrdenar);
		
		txtIngreseElTamao = new JTextField();
		txtIngreseElTamao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtIngreseElTamao.setText("");
			}
		});
		txtIngreseElTamao.setText("Ingrese el tama\u00F1o");
		GridBagConstraints gbc_txtIngreseElTamao = new GridBagConstraints();
		gbc_txtIngreseElTamao.insets = new Insets(0, 0, 5, 0);
		gbc_txtIngreseElTamao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIngreseElTamao.gridx = 3;
		gbc_txtIngreseElTamao.gridy = 0;
		panel_2.add(txtIngreseElTamao, gbc_txtIngreseElTamao);
		txtIngreseElTamao.setColumns(10);
		
		JScrollPane scrollListaSinOrdenar = new JScrollPane();
		GridBagConstraints gbc_scrollListaSinOrdenar = new GridBagConstraints();
		gbc_scrollListaSinOrdenar.fill = GridBagConstraints.BOTH;
		gbc_scrollListaSinOrdenar.gridwidth = 4;
		gbc_scrollListaSinOrdenar.gridx = 0;
		gbc_scrollListaSinOrdenar.gridy = 1;
		panel_2.add(scrollListaSinOrdenar, gbc_scrollListaSinOrdenar);
		
		txtAreaLista = new JTextArea();
		txtAreaLista.setLineWrap(true);
		scrollListaSinOrdenar.setViewportView(txtAreaLista);
		
	}
	
	void btnCrear() {
		arreglo= new Lista(Integer.parseInt(txtIngreseElTamao.getText()));
		rc= new RadixVsCounting();
		txtAreaLista.setText(rc.mostrarArreglo(arreglo.data));
	}
	void btnOrdenar() {
		ordenarCounting();
		ordenarRadix();
	}
	void ordenarCounting() {
		rc= new RadixVsCounting();
		long startTime = System.nanoTime();
		int[] copia=arreglo.data;
		int[] countingSort=rc.countingSort(copia, mayor(copia));
		long endTime = System.nanoTime() - startTime;
		txtTimeCounting.setText(endTime+ " NanoSeconds");
		txtAreaCounting.setText(rc.mostrarArreglo(countingSort));
	}
	void ordenarRadix() {
		rc= new RadixVsCounting();
		long startTime = System.nanoTime();
		int[] copia=arreglo.data;
		int[] radixSort=rc.radixSort(copia);
		long endTime = System.nanoTime()- startTime;
		txtTimeRadix.setText(endTime+ " NanoSeconds");
		textAreaRadix.setText(rc.mostrarArreglo(radixSort));
	}
	int mayor(int[] lista){
		int  mayor=lista[0];
		for (int i : lista) {
			if(mayor<i) {
				mayor=i;
			}
		}
		return mayor;
		
	}
	
	

}
