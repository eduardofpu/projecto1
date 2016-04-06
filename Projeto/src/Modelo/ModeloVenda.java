/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Eduardo
 */
public class ModeloVenda {
    

    private int idVenda;
    private String data;
    private float preco;
    private float preco1;
    private float dinheiro;
    private float troco;
    private String nomepd;
    private String nMesa;
    private String hora;
    private int qt;

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getnMesa() {
        return nMesa;
    }

    public void setnMesa(String nMesa) {
        this.nMesa = nMesa;
    }

    

    public String getNomepd() {
        return nomepd;
    }

    public void setNomepd(String nomepd) {
        this.nomepd = nomepd;
    }
    

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco1() {
        return preco1;
    }

    public void setPreco1(float preco1) {
        this.preco1 = preco1;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

   

   
    

    
    


    
}
