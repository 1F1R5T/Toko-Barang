/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penyimpanan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1First
 */
public class Model_penyimpanan {

  
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_penyimpanan(){
        
        getTabel().addColumn("No");
        getTabel().addColumn("Nama");
        getTabel().addColumn("Jumlah");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Total");
       
    }
    
  


    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
     
}

