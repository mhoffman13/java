package main.java.app;

/**
 *
 * @author Umesh
 */
import java.awt.EventQueue;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import main.java.app.view.TabOption;

public class MainAppView extends JFrame {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	private JTabbedPane window;

	/**
	 * Creates new form MartaJFrame
	 */
	public MainAppView() {
		initComponents();
		conn = MySQLConnect.ConnectDB();
		update_table();
	}

	private void update_table() {
		try {
			String sql = "select * from customer";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			// Table_Customer.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private void initComponents() {

		window = new JTabbedPane();

		List<TabOption> tabs = TabOption.getTabOptions();
		List<JPanel> tabPanels = new ArrayList<JPanel>();
		
		// iterate over tabOptions and add tabs
		for (TabOption option : tabs) {
			JPanel tabPanel = new JPanel();
			JScrollPane scrollPane = new JScrollPane();
			JTable table = new JTable();

			table.setModel(new DefaultTableModel(new Object[][] {
					{ null, null, null, null }, { null, null, null, null },
					{ null, null, null, null }, { null, null, null, null } },
					new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
			scrollPane.setViewportView(table);

			/** panel layout */
			GroupLayout panelLayout = new GroupLayout(tabPanel);
			tabPanel.setLayout(panelLayout);
			panelLayout.setHorizontalGroup(panelLayout.createParallelGroup(
					GroupLayout.Alignment.LEADING).addGroup(
					panelLayout
							.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
									1024, Short.MAX_VALUE).addContainerGap()));
			panelLayout.setVerticalGroup(panelLayout.createParallelGroup(
					GroupLayout.Alignment.LEADING).addGroup(
					panelLayout
							.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
									555, Short.MAX_VALUE).addContainerGap()));
			/** add tab */
			window.addTab(option.getDisplayName(), tabPanel);
			tabPanels.add(tabPanel);
		}
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(window));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(window, javax.swing.GroupLayout.PREFERRED_SIZE, 486,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		pack();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		 // If Nimbus is not available, stay with the
		 // default look and feel.
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainAppView.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainAppView.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainAppView.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainAppView.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainAppView().setVisible(true);
			}
		});
	}
}
