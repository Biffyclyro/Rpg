package model;

import java.util.ArrayList;

public class Personagem {
    private String nome;
    private int lv;
    private int atk;
    private String classe;
    private Arma arma;
    private Armadura armadura;
    private final ArrayList<Item> inventario = new ArrayList();

    public Personagem(String nome, int lv, int atk, String classe, Arma arma, Armadura armadura) {
        this.nome = nome;
        this.lv = lv;
        this.atk = atk;
        this.classe = classe;
        this.arma = arma;
        this.armadura = armadura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk + arma.getAtk();
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    public void acidionarItem(Item item){
        this.inventario.add(item);
    }
    
    
    public ArrayList<Item> getInventario(){
        return this.inventario;
    }
    
    
    
    @Override
    public String toString(){
        return "Nome: " + nome + " Lv: " + lv + " Atk: "+ atk + " Classe: " + classe; 
    }
    
    
    
}
