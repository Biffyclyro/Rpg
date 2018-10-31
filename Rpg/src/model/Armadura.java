package model;

public class Armadura extends Item {
    private int def;
    private int defM;    
    private String skill;
    private boolean itemMagico;

    public Armadura(int def, int defM, boolean itemMagico, String nome) {
        super(nome);
        this.def = def;
        this.defM = defM;       
        this.itemMagico = itemMagico;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDefM() {
        return defM;
    }

    public void setDefM(int defM) {
        this.defM = defM;
    }   
    

    public String getSkill() {
        return skill;
    }
    
    
    
    public void setSkill() {
        this.skill = "Item comum";
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

    
    
    
    
    
}
