package model;

public class Arma extends Item{
    private int atk;
    private String skill;
    private boolean itemMagico;

    public Arma(int atk, String skill, boolean itemMagico, String nome) {
        super(nome);
        this.atk = atk;
        this.skill = skill;
        this.itemMagico = itemMagico;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public boolean isItemMagico() {
        return itemMagico;
    }

    public void setItemMagico(boolean itemMagico) {
        this.itemMagico = itemMagico;
    }

    
    @Override
    public void setPreco(double preco) {
        if(this.itemMagico==true){
            super.setPreco(preco*5);
        }else{
            super.setPreco(preco);
        }
    }
    
    
    @Override
    public String toString(){
        return"Arma: " + " Nome: " + super.getNome() + " Skill: " + skill+ " Preco: "+ super.getPreco();
    }
    

      

    


}
