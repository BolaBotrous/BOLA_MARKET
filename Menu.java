package BOLA_MARKET;

import java.util.ArrayList;

public class Menu {
    private static ArrayList<Product>menuList=new ArrayList<>();
    public void showMenu()
    {
        System.out.println("OUR MENU FOR TODAY <3");
        for(int i=0;i<menuList.size();i++)
        {
            System.out.println((i+1)+"." + menuList.get(i).getName() + " WITH " + menuList.get(i).getStock() + " IN THE STOCK...THE PRICE IS: " + menuList.get(i).getProductPrice()+" $" );
        }
    }

    public static void addToMenu(Product p)
    {
        menuList.add(p);
    }

    public Product getProduct(int i)
    {
        return menuList.get(i-1);
    }
}
