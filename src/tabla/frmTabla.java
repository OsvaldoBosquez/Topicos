
package tabla;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class frmTabla extends javax.swing.JFrame {

    public DefaultTableModel modelo;
    public JComboBox combo;
    
    int columnValue = -1;    
    int columnNewValue = -1;

    /**
     * Creates new form Tabla
     */
    public frmTabla() {
        initComponents();
        cargarAutos();
        
        tblAutos.setRowHeight(25);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modelo);
        tblAutos.setRowSorter(sorter);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblAutos);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        modelo.addRow(new Object[]{
            "",
            //Inice 5 en el combo apunta a "Otra"
            combo.getItemAt(5).toString(),
            "Generico",
            2018,
            Color.black,
            false,
        });
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   
        int[] rows = tblAutos.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            modelo.removeRow(rows[i] - i);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTabla().setVisible(true);
            }
        });
    }
    
    private void cargarAutos() {
        
        Auto autos[] = {
            new Auto("VW", "Bocho", 1990, Color.darkGray, false),
            new Auto("Ford", "Fiesta", 2012, Color.BLUE, true),
            new Auto("Nissan", "Sentra", 2010, Color.WHITE, false),
            new Auto("VW", "Jetta", 2003, Color.GRAY, false),
            new Auto("Chevrolet", "Mustang", 1998, Color.MAGENTA, true)};
        

        String titulos[] = {
            "...",
            "Marca",
            "Modelo",
            "Año",
            "Color",
            "Vendido"
        };
        
        modelo = new DefaultTableModel(titulos, 0) {
            @Override
            public Class getColumnClass(int c) {
                return getValueAt(0, c).getClass();
            }
            
            @Override
            public boolean isCellEditable(int row, int col) {
                return col != 0;
            }
        };
        
        for (int i = 0; i < autos.length; i++) {
            modelo.addRow(new Object[]{
                "",
                autos[i].getMarca(),
                autos[i].getModelo(),
                autos[i].getAño(),
                autos[i].getColor(),
                autos[i].isVendido(),});
            
        }

        tblAutos.setModel(modelo);
        
        
        
       tblAutos.setDefaultRenderer(Color.class,
                                 new ColorRenderer(true));
        tblAutos.setDefaultEditor(Color.class,
                               new ColorEditor());
        
        TableColumn uno = tblAutos.getColumn("...");
        uno.setMaxWidth(20);
        
        combo = new JComboBox();
        combo.addItem("VW");
        combo.addItem("Chrysler");
        combo.addItem("Ford");
        combo.addItem("Toyota");
        combo.addItem("BMW");
        combo.addItem("Otra");
        
        tblAutos.getColumn("Marca").setCellEditor(new DefaultCellEditor(combo));
        
        SpinnerModel spinner2 = new SpinnerNumberModel(2018, 1980, 2020, 1);
        
        tblAutos.getColumn("Año").setCellEditor(new SpinnerEditor(spinner2));
        
        
        
        tblAutos.getColumnModel().addColumnModelListener(new TableColumnModelListener() {            
            @Override
            public void columnAdded(TableColumnModelEvent e) {
            }            
            
            @Override
            public void columnMarginChanged(ChangeEvent e) {
            }            
            
            @Override
            public void columnMoved(TableColumnModelEvent e) {                
                if (columnValue == -1) {
                    columnValue = e.getFromIndex();
                }                
                
                columnNewValue = e.getToIndex();                
            }            
            
            @Override
            public void columnRemoved(TableColumnModelEvent e) {
            }            
            
            @Override
            public void columnSelectionChanged(ListSelectionEvent e) {
            }
            
        });        
        
        tblAutos.getTableHeader().addMouseListener(new MouseAdapter() {            
            @Override
            public void mouseReleased(MouseEvent e) {                
                if (columnValue != -1 && (columnValue == 0 || columnNewValue == 0)) {
                    tblAutos.moveColumn(columnNewValue, columnValue);
                }                
                
                columnValue = -1;                
                columnNewValue = -1;                
            }            
        });        

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutos;
    // End of variables declaration//GEN-END:variables
    class SpinnerEditor extends AbstractCellEditor implements TableCellEditor {

        JSpinner spinner = new JSpinner();
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner, "#");
        
        SpinnerEditor(SpinnerModel spinner) {
            this.spinner.setEditor(editor);
            this.spinner.setModel(spinner);
        }
        
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            spinner.setValue(value);
            return spinner;
        }
        
        public Object getCellEditorValue() {
            return spinner.getValue();
        }
        
    }
}




