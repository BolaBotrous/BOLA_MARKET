package BOLA_MARKET;

import java.util.Scanner;

public class Admin {
    private final static String adminName="Bola";
    private final static String password="1234";

    public static boolean logIn(String admin,String pass)
    {
        if(admin.equals(adminName)&& pass.equals(password))
        {
            System.out.println("LOGGED IN SUCCESSFULLY");
            return true;
        }

        else
        {
            return false;
        }

    }


    public static void addToMenu()
    {
        Scanner i=new Scanner(System.in);
        String admin,pass;
        System.out.print("ENTER ADMIN_NAME: ");
        admin=i.next();
        System.out.print("ENTER PASSWORD: ");
        pass=i.next();
        if(logIn(admin,pass))
        {
            int another_p;
            do {


                String p_name;
                System.out.print("ENTER THE NAME: ");
                p_name = i.next();


                int id;
                System.out.print("ENTER THE ID: ");
                id = i.nextInt();


                double price;
                System.out.print("ENTER THE PRICE: ");
                price = i.nextDouble();

                int stock;
                System.out.print("ENTER THE NUMBER IN THE STOCK: ");
                stock = i.nextInt();

                Product p = new Product(id, p_name, price, stock);

                Menu.addToMenu(p);

                System.out.println("ADDED SUCCESSFULLY");
                System.out.println();
                System.out.println("ADD ANOTHER PRODUCT ???");
                System.out.println("1. YES\n2. NO");
                another_p=i.nextInt();
            }while (another_p==1);
        }


    }



}
