package view;

import model.Arma;
import model.Armadura;
import model.Item;
import model.Personagem;

public class Test {
    public static void main(String[] args) {
        
        Arma a1 = new Arma(12, "Furia", true, "Dragao e Tigre");
        a1.setPreco(50);
        
        Armadura arm1 = new Armadura(200, 100, true, "Poshan");
        arm1.setSkill();
        arm1.setPreco(200);
        
        Personagem p1 = new Personagem("fulano", 50, 300, "fisica", a1, arm1);
        
        Item i1 = new Item("garra cega");
        i1.setPreco(20);
        p1.acidionarItem(i1);
        Item i2 = new Item("erva emenagoga");
        i2.setPreco(10);
        p1.acidionarItem(i2);
        Item i3 = new Item("metal");
        i3.setPreco(30);
        p1.acidionarItem(i3);
        Item i4 = new Item("essencia");
        i4.setPreco(40);
        p1.acidionarItem(i4);
        Item i5 = new Item("cadju");
        i5.setPreco(50);
        p1.acidionarItem(i5);
        
        
        exibePersonagem(p1);
        
        
        
    }
    
    
    private static void exibePersonagem(Personagem p){
        
        System.out.println(p);
        System.out.println("Arma: " +p.getArma());
        System.out.println("Armadura: " + p.getArmadura());
        System.out.println("\n");
        System.out.println("Inventario:");
        for(Item i : p.getInventario()){
            inventario(i);
        }
        
        
    }
    
    
    private static void inventario(Item i){
        System.out.println("Nome: " + i.getNome() + " Preco: " + i.getPreco());
    }
          
            
            
         
}
