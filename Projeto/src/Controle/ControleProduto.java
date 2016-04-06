
package Controle;

import Modelo.ModeloProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ControleProduto {
    
    ConectaBanco cx = new ConectaBanco();
    
     public void Salvar(ModeloProduto mod){
   cx.conexao();
  
         try {
            // TODO add your handling code here:
            

            PreparedStatement pst = cx.conn.prepareStatement("insert into  produto(nome_produto,preco_produto) values(?,?)");
           // pst.setInt(1, mod.getIdProd()); não precisa no botão salvar
            pst.setString(1, mod.getNomeProd());
            pst.setDouble(2,mod.getPrecoProduto());
            
                     
            pst.execute();
            
           //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");   
           
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }
        cx.desconecta();            
     }
     
     
    public void Alterar (ModeloProduto mod){   
    cx.conexao();
    
    
        try {            
             
            PreparedStatement pst = cx.conn.prepareStatement("update produto set nome_produto=?,preco_produto=? where id_p=?");
           
            pst.setString(1, mod.getNomeProd());
            pst.setDouble(2,mod.getPrecoProduto());
            pst.setInt(3, mod.getIdProd());
            pst.execute();
             
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteração dos dados.\n Erro!"+ex);
       }
       cx.desconecta();
       
    }
     
     public void Excluir(ModeloProduto mod){
        cx.conexao();
            try {
                //JOptionPane.showMessageDialog(null,mod.getCod());
                PreparedStatement pst = cx.conn.prepareStatement("delete from produto where id_p=?");
                pst.setInt(1, mod.getIdProd());
                pst.execute(); 
                 
                 //JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!");
            }                        
      cx.desconecta();
}
     
     
    public ModeloProduto Primeiro(){
    ModeloProduto  mod = new ModeloProduto ();
    cx.conexao();
    
    cx.execultasql("select * from produto");
        try {
             cx.rs.first();
             mod.setIdProd(cx.rs.getInt("id_p"));             
             mod.setNomeProd(cx.rs.getString("nome_produto"));
             mod.setPrecoProduto(cx.rs.getDouble("preco_produto"));
         
            
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Procure o proximo !");
        }
        cx.desconecta(); // desconecta do no primeiro e no ultimo
        
        return mod;  
        
       }
    
    public ModeloProduto  Uti(){
    ModeloProduto  mod = new ModeloProduto ();
    cx.conexao();
    
     cx.execultasql("select * from produto");
        try {
             cx.rs.last();
             mod.setIdProd(cx.rs.getInt("id_p"));             
             mod.setNomeProd(cx.rs.getString("nome_produto"));
             mod.setPrecoProduto(cx.rs.getDouble("preco_produto"));
         
            
             
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Procure o anterior !");
        }
        cx.desconecta(); // desconecta no no primeiro e no ultimo
        
        return mod;  
       }
    
    public ModeloProduto  Ant(){
   ModeloProduto  mod = new ModeloProduto ();
    
    
     cx.execultasql("select * from produto");
        try {
             cx.rs.previous();
             mod.setIdProd(cx.rs.getInt("id_p"));             
             mod.setNomeProd(cx.rs.getString("nome_produto"));
             mod.setPrecoProduto(cx.rs.getDouble("preco_produto"));
         
            
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Procure o proximo !");
        }
        
        
        return mod;  
       }
    
    
     public ModeloProduto Prox(){
     ModeloProduto  mod = new ModeloProduto ();
    
    
     cx.execultasql("select * from produto");
        try {
             cx.rs.next();
             mod.setIdProd(cx.rs.getInt("id_p"));             
             mod.setNomeProd(cx.rs.getString("nome_produto"));
             mod.setPrecoProduto(cx.rs.getDouble("preco_produto"));
         
            
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Procure o anterior !");
        }
        
        
        return mod;  
        
       }
     
    
}
