/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.mavenproject5;

/**
 *
 * @author Murilo
 */
public class Mavenproject5 {
    private static int id;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        id = 5;
        System.out.println(id);
        
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Mavenproject5.id = id;
    }
}
