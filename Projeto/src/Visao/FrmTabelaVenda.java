/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visao;

import Controle.AtualizadoHora;
import Controle.ConectaBanco;
import Controle.ControleTroco;
import Controle.ControleVenda;
import Modelo.ModeloTabela;
import Modelo.ModeloTroco;
import Modelo.ModeloVenda;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Eduardo
 */
public class FrmTabelaVenda extends javax.swing.JFrame {
    
DecimalFormat formato;// Variavel global para DecimalFormat

ConectaBanco conn = new ConectaBanco();
 ModeloTroco mod =new  ModeloTroco(); 
 ControleTroco controle = new ControleTroco();
 ModeloVenda md = new ModeloVenda();
 ControleVenda control = new ControleVenda();
 int i=1,cont=0,y=1;
 
  float total=0; // variavel global para icrementar total do dia
 
    /**
     * Creates new form FrmTabelaVenda
     */
    public FrmTabelaVenda() {
        
        initComponents();
        
      
        
         formato = new DecimalFormat("#0.00"); // Cria um campo para pegar dois numeros apos o ponto.
        
         AtualizadoHora.start(Hora); // Para colocar a Hora no sistema
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        Data.setText(df.format(hoje));
        
        
        
         URL url = this.getClass().getResource("/Imagem/açai.png");  //coloca a imagem no lugar da tigela java
          Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
            this.setIconImage(imagemTitulo);
            
         JOptionPane.showMessageDialog(rootPane,"Atualize a tabela no botão Pesquisar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButtonPesquisar = new javax.swing.JToggleButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jToggleButtonDeletar = new javax.swing.JToggleButton();
        Data = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        DeletaUltimaLinha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Produtos Consumidos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("Barra de progresso");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jToggleButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N
        jToggleButtonPesquisar.setToolTipText("Clique aqui para pesquisar");
        jToggleButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesquisarActionPerformed(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 102));
        jProgressBar1.setToolTipText("Barra de progresso");

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(255, 153, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        jButton1.setToolTipText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButtonPesquisar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jToggleButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToggleButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jToggleButtonDeletar.setToolTipText(" Deletar tudo");
        jToggleButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDeletarActionPerformed(evt);
            }
        });

        Data.setText("Data");

        Hora.setText("Horario");

        DeletaUltimaLinha.setForeground(new java.awt.Color(204, 0, 0));
        DeletaUltimaLinha.setText("Deleta último pedido");
        DeletaUltimaLinha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255), 2));
        DeletaUltimaLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletaUltimaLinhaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Total:");

        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(Hora)
                        .addGap(97, 97, 97)
                        .addComponent(Data))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(DeletaUltimaLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Hora)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Data)))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeletaUltimaLinha)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDeletarActionPerformed
        // TODO add your handling code here:
        
        String[] options = {"Não", "Sim"};

        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja Deletar todos os produtos ?",
                "Confirmar",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        

        if (resposta == 0) {
        	
        	return;//Este é o Botao do NAO. Ira retornar para a Calculadora
        }
        
        if(resposta == 1){//Este é o Botao do SIM. Ira sair do seu Programa
            
            
     	JOptionPane.showMessageDialog(rootPane,"Aguarde ! Os produtos serão deletados ."); 
        int rep=0;//contador
        
        while(rep<100){// exclui 50 linhas de uma vez
         
        md=control.Uti();
         conn.execultasql("select * from venda where id_venda='"+md.getIdVenda()+"'");//apenas seleciona o ultimo para excluir
         
            control.Excluir(md);// para excluir
             preencherTabelaVendaNomeProdutos("select * from venda"); // agora preenche a tabela no banco
              jProgressBar1.setValue(rep); // faz a barra aumentar 100 % ao esvaziar a tabela
             rep++;// incrementa
             
        }
       
        
         JOptionPane.showMessageDialog(rootPane,"Produtos excluidos com sucesso!");
        }
        
    }//GEN-LAST:event_jToggleButtonDeletarActionPerformed

    private void jToggleButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPesquisarActionPerformed
        
        conn.conexao();
        
         preencherTabelaVendaNomeProdutos("select * from venda where nomepd_venda like'%"+jToggleButtonPesquisar.getText()+"%' ");
        try {
       
        
        conn.rs.first();
       // jTextFieldProduConsu.setText(String.valueOf(conn.rs.getString("nomepd_venda")));        
       
    } catch (SQLException ex) {
        Logger.getLogger(FrmTabelaVenda.class.getName()).log(Level.SEVERE, null, ex);
    }
    //  jTextFieldProduConsu.setText("");   // Limpa o texto
       
    }//GEN-LAST:event_jToggleButtonPesquisarActionPerformed

    private void DeletaUltimaLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletaUltimaLinhaActionPerformed
        // TODO add your handling code here:
        String [] options={"Não","Sim"};
        
        int resposta = JOptionPane.showOptionDialog(rootPane, "Tem certeza que você deseja deletar a última linha ?",
               "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(resposta==0){// Não retorna a tabela
            return ;
        }
      if(resposta==1){//sim deleta a última linha
        md=control.Uti();
         conn.execultasql("select * from venda where id_venda='"+md.getIdVenda()+"'");//apenas seleciona o ultimo para excluir
         
            control.Excluir(md);// para excluir
             preencherTabelaVendaNomeProdutos("select * from venda"); // agora preenche a tabela no banco
      }  
    }//GEN-LAST:event_DeletaUltimaLinhaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       // float total=0;
        float x;
        
       
         String preco = ""+jTable1.getValueAt(jTable1.getSelectedRow(),3);// preço para o jtxtFieldPreco
          
             
             
              x = Float.parseFloat(preco); // conversão do preco para float
              
              
              total=total+x; // variavel global incrementa             
              
             //jTextFieldTotal.setText(String.valueOf(total));
             jTextFieldTotal.setText(formato.format(total));//Imprime dois numeros apos o ponto.
             
            jProgressBar2.setValue((int) total);// Faz a barra do progresso incrementar os preços
          //  jProgressBar2.setMaximum((int)total);// faz a barra progredir ao somar os preços
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new FrmTabelaVenda().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /*
      public void preencherTabelaVendaNomeProdutos(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Qt","Mesa","Nome do Produto","Data","Hora"};
        
       String data = Data.getText();
       String dia, mes, ano; // Variaveis para armazenar data
       
       
       dia = ""+data.charAt(0)+data.charAt(1)+"/";
       mes = ""+data.charAt(3)+data.charAt(4);
       ano = "/"+data.charAt(6)+data.charAt(7)+data.charAt(8)+data.charAt(9);// mes dia e ano   
      
       
       int anoInt = Integer.parseInt("" + data.charAt(6)+data.charAt(7)+data.charAt(8)+data.charAt(9));// converte o ano para inteiro
       int mesInt = Integer.parseInt(mes);// converte o mes para inteiro
      
     String hora = Hora.getText();// Coloca a hora na tabela
        
        conn.conexao();
        conn.execultasql(sql);                
            try {
                conn.rs.first();
                do {
                  
                    
                  
                    if(mesInt < 10 ){
                    dados.add(new Object[]{i,conn.rs.getString("n_mesa"),conn.rs.getString("nomepd_venda"),dia + "0"+mesInt + "/" + anoInt,hora});
                   
                    i++;
                    }else{
                    
                    dados.add(new Object[]{i,conn.rs.getString("n_mesa"),conn.rs.getString("nomepd_venda"),dia + mesInt + "/" + anoInt,hora});
                   
                    i++;
                    }
                    
                    
                    
                }while(conn.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          jTable1.setModel(modelo);
          jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
          jTable1.getColumnModel().getColumn(0).setResizable(false);
          jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
          jTable1.getColumnModel().getColumn(1).setResizable(false);  
          jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
          jTable1.getColumnModel().getColumn(2).setResizable(false);  
          jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
          jTable1.getColumnModel().getColumn(3).setResizable(false);  
          jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
          jTable1.getColumnModel().getColumn(4).setResizable(false);  
          jTable1.getTableHeader().setReorderingAllowed(false);
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
          jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                                  
    
       
       }*/
    
    
     public void  preencherTabelaVendaNomeProdutos(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Qt","Mesa","Produto","Preço","Data","Hora"};
       
    
        
        conn.conexao();
        conn.execultasql(sql);                
            try {
                conn.rs.first();
                do {
                  
                    dados.add(new Object[]{i,conn.rs.getString("n_mesa"),conn.rs.getString("nomepd_venda"),conn.rs.getString("preco_venda"),conn.rs.getString("data_venda"),conn.rs.getString("hora_venda")});
                   
                    i++;
                   jProgressBar1.setValue(i);// faz a barra de progresso funcionar
                   
                    
                }while(conn.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          jTable1.setModel(modelo);
          jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
          jTable1.getColumnModel().getColumn(0).setResizable(false);
          jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
          jTable1.getColumnModel().getColumn(1).setResizable(false);  
          jTable1.getColumnModel().getColumn(2).setPreferredWidth(190);
          jTable1.getColumnModel().getColumn(2).setResizable(false);  
          jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
          jTable1.getColumnModel().getColumn(3).setResizable(false);  
          jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
          jTable1.getColumnModel().getColumn(4).setResizable(false); 
          jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
          jTable1.getColumnModel().getColumn(5).setResizable(false); 
          jTable1.getTableHeader().setReorderingAllowed(false);
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
          jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
       }
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
            java.util.logging.Logger.getLogger(FrmTabelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTabelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTabelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTabelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTabelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JButton DeletaUltimaLinha;
    private javax.swing.JLabel Hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JToggleButton jToggleButtonDeletar;
    private javax.swing.JToggleButton jToggleButtonPesquisar;
    // End of variables declaration//GEN-END:variables
}