/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.ModeloVenda;
import Modelo.ModeloVendaControle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ControleVendaControle {
    
    
    
    
    

     ConectaBanco cx = new ConectaBanco();
    
     public void Salvar(ModeloVendaControle mod){
   cx.conexao();
  
         try {
            // TODO add your handling code here:
            

            PreparedStatement pst = cx.conn.prepareStatement("insert into  vendacontrole(nomepd_venda,n_mesa,data_venda,hora_venda,preco_vendac) values(?,?,?,?,?)");
          
            
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
     
     
   
     
     public void Excluir(ModeloVendaControle mod){
        cx.conexao();
            try {
                //JOptionPane.showMessageDialog(null,mod.getCod());
                PreparedStatement pst = cx.conn.prepareStatement("delete from vendacontrole where id_venda=?");
                pst.setInt(1, mod.getIdVenda());
                pst.execute(); 
                 
                 //JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
            } catch (SQLException ex) {
              //  JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!");
            }                        
      cx.desconecta();
}
     
     
   
     
        
    public ModeloVendaControle VendaPrimeiro(){
  ModeloVendaControle  mod = new ModeloVendaControle ();
    cx.conexao();
    
    cx.execultasql("select * from vendacontrole");
        try {
             cx.rs.last();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
           
             
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        cx.desconecta(); // desconecta do no primeiro e no ultimo
        
        return mod;  
        
       }
    
    
    
    
    public ModeloVendaControle  Uti(){
    ModeloVendaControle mod = new ModeloVendaControle();
    cx.conexao();
    
     cx.execultasql("select * from vendacontrole");
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
    
   
        
        
    
    
    
    
     public ModeloVendaControle  Ant(){
  ModeloVendaControle  mod = new ModeloVendaControle ();
    
    
      cx.execultasql("select * from vendacontrole");
        try {
             cx.rs.previous();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
            
             
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        
        
        return mod;  
       }
    
    
     public ModeloVendaControle Prox(){
    ModeloVendaControle  mod = new ModeloVendaControle ();
    
    
      cx.execultasql("select * from vendacontrole");
        try {
             cx.rs.next();
             mod.setIdVenda(cx.rs.getInt("id_venda"));  
             mod.setNomepd(cx.rs.getString("nomepd_venda"));    
             mod.setnMesa(cx.rs.getString("n_mesa"));    
             
            
             
        } catch (SQLException ex) {
            // JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!"+ex);
        }
        
        
        return mod;  
        
       }
      

    
}
