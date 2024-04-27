/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Workshop4 {

    /**
     * @param args the command line arguments
     */
    //AntiqueShop
    public static void main(String[] args) {
        // TODO code application logic here
        Item item=null;
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase.");
            System.out.println("2. Create a Statue.");
            System.out.println("3. Create a Painting.");
            System.out.println("4. Display the Item.");
            System.out.println("Input a choice.");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    item=new Vase();
                    ((Vase)item).InputVase();
                    break;
                case 2:
                    item=new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item=new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item!=null) {
                        if (item instanceof Vase) {
                            ((Vase)item).outputVase();
                        }
                        else if (item instanceof Statue) {
                            ((Statue)item).outputStatue();
                        }
                        else if (item instanceof Painting) {
                            ((Painting)item).outputPainting();
                        }
                        else {
                            System.out.println("You need to create an object");
                            break;
                        }
                    }
            }
        }
        while (choice <=4);
    }
    
}
