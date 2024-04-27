/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample1;

/**
 *
 * @author ADMIN
 */
public class Book {
    private String title;
    private int price;

    public Book() {
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        char[] charArray = title.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        title = String.valueOf(charArray);
        System.out.println(title);
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        System.out.println(price);
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
