/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iArre[] = new int[50];
        //LLENAR EL ARREGLO
        for (int i = 0; i < iArre.length; i++) {
            iArre[i] = (int) (Math.random() * 100) + 1;
        }
        //IMPRIMIR EL ARREGLO
        System.out.println("ARREGLO COMPLETO");
        for (int i = 0; i < iArre.length; i++) {
            System.out.print("[" + iArre[i] + "]");
        }
        System.out.println("");

        //LISTA DE NUMEROS PARES
        System.out.println("NUMEROS PARES");
        for (int i = 0; i < iArre.length; i++) {
            if (iArre[i] % 2 == 0) {/*Si el residuo de dividir a iArre[i] entre 2 
                                    es 0, entonces es un numero par.*/
                System.out.print("[" + iArre[i] + "]");
            }
        }
       
    }

}
