
package Controle;

import Modelo.ModeloTroco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ControleTroco {
    ConectaBanco cx = new ConectaBanco();
    
    
    
     public void Salvar(ModeloTroco mod){
   cx.conexao();
  
         try {
            // TODO add your handling code here:
            

            PreparedStatement pst = cx.conn.prepareStatement("insert into  troco (troco) values(?)");
           
            pst.setFloat(1,mod.getTroco());
           
                     
            pst.execute();
            
           //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");   
           
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }
        cx.desconecta();            
     }
     
     
   
     
     public void Excluir(ModeloTroco mod){
        cx.conexao();
            try {
                //JOptionPane.showMessageDialog(null,mod.getCod());
                PreparedStatement pst = cx.conn.prepareStatement("delete from troco where id_troco=?");
                pst.setInt(1, mod.getIdTroco());
                pst.execute(); 
                 
                 //JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!");
            }                        
      cx.desconecta();
}
     
      public ModeloTroco  Uti(){
    ModeloTroco mod = new ModeloTroco();
    cx.conexao();
    
     cx.execultasql("select * from troco");
        try {
             cx.rs.last();
             mod.setIdTroco(cx.rs.getInt("id_troco")); 
             mod.setTroco(cx.rs.getFloat("troco"));
             
             
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        cx.desconecta(); // desconecta do no primeiro e no ultimo
        
        
        return mod;  
       }
    
}
