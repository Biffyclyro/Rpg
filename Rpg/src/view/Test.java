package view;

import model.Arma;
import model.Armadura;
import model.Item;
import model.Personagem;

public class Test {
    public static void main(String[] args) {
        
        Arma a1 = new Arma(12, "minha rola", true, "piroca");
        a1.setPreco(50);
        
        Armadura arm1 = new Armadura(200, 100, true, "Poshan");
        
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
        
        
        
        
        
        System.out.println(a1.getPreco());
        
        
        
        
        
        
        
        
        //System.out.println("");
    }
          
            
            
         
}
