
package Controle;

import Modelo.ModeloVenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ControleVenda {
     ConectaBanco cx = new ConectaBanco();
    
     public void Salvar(ModeloVenda mod){
   cx.conexao();
  
         try {
            // TODO add your handling code here:
            

            PreparedStatement pst = cx.conn.prepareStatement("insert into  venda(nomepd_venda,n_mesa,data_venda,hora_venda,preco_venda) values(?,?,?,?,?)");
          
           
            pst.setString(1,mod.getNomepd());
            pst.setString(2,mod.getnMesa());  
            pst.setString(3,mod.getData());
            pst.setString(4,mod.getHora());
            pst.setFloat(5,mod.getPreco());
            pst.execute();
            
           //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");   
           
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }
        cx.desconecta();            
     }
     
     
    public void Alterar (ModeloVenda mod){   
    cx.conexao();
    
    
        try {            
             
            PreparedStatement pst = cx.conn.prepareStatement("update venda set preco_venda=?,preco1_venda=?,dinheiro_venda=?,troco_venda=? where id_venda=?");
           
            pst.setFloat(1, mod.getPreco());
            pst.setFloat(2, mod.getPreco1());
            pst.setFloat(3, mod.getDinheiro());
            pst.setFloat(4 ,mod.getTroco());
            pst.setInt(5, mod.getIdVenda());
            pst.execute();
             
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteração dos dados.\n Erro!"+ex);
       }
       cx.desconecta();
       
    }
     
     public void Excluir(ModeloVenda mod){
        cx.conexao();
            try {
                //JOptionPane.showMessageDialog(null,mod.getCod());
                PreparedStatement pst = cx.conn.prepareStatement("delete from venda where id_venda=?");
                pst.setInt(1, mod.getIdVenda());
                pst.execute(); 
                 
                 //JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
            } catch (SQLException ex) {
              //  JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!");
            }                        
      cx.desconecta();
}
     
     
    public ModeloVenda VendaPrimeiro(){
   ModeloVenda  mod = new ModeloVenda ();
    cx.conexao();
    
    cx.execultasql("select * from venda");
        try {
             cx.rs.first();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
           
            
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        cx.desconecta(); // desconecta do no primeiro e no ultimo
        
        return mod;  
        
       }
    
    public ModeloVenda  Uti(){
    ModeloVenda mod = new ModeloVenda ();
    cx.conexao();
    
     cx.execultasql("select * from venda");
        try {
             cx.rs.last();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
           
         
            
             
        } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        cx.desconecta(); // desconecta  no primeiro e no ultimo
        
        
        return mod;  
       }
    
    public ModeloVenda  Ant(){
   ModeloVenda  mod = new ModeloVenda ();
    
    
     cx.execultasql("select * from venda");
        try {
             cx.rs.previous();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
           
            
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        
        
        return mod;  
       }
    
    
     public ModeloVenda Prox(){
     ModeloVenda  mod = new ModeloVenda ();
    
    
      cx.execultasql("select * from venda");
        try {
             cx.rs.next();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
           
            
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        
        
        return mod;  
        
       }
     
}
