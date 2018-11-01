package model;

abstract class ClassePersonagem {
    private String tipo;
    private int defM;
    private int def;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefM() {
        return defM;
    }

    public void setDefM(int defM) {
        if("Magico".equals(this.tipo)){
            this.defM=defM*3;
        }else{
            this.defM=defM;
        }
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if("fisico".equals(tipo)) {
            this.def=def*2;
        }else {
            this.def=def;
        }
    }
   
}
