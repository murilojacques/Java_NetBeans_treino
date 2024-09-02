/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.mavenproject3;

/**
 *
 * @author Murilo
 */
public class Mavenproject3 {
    
    
    public static void main(String[] args) {
        int[][] m = new int[3][3];

    m[0][0] = 1;
    m[0][1] = 2;
    m[0][2] = 3;

    m[1][0] = 4;
    m[1][1] = 5;
    m[1][2] = 6;

    m[2][0] = 7;
    m[2][1] = 8;
    m[2][2] = 9;

    for(int i=0; i<m.length; i++){
        System.out.println("");
        for(int j=0; j < m[i].length; j++){
            System.out.print(m[i][j]);
        }
    }

    }
}
