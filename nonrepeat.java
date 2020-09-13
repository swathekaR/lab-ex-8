/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling2;

/**
 *
 * @author user
 */
public class nonrepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
  String str1 = "gibblegabbler";
  System.out.println("The given string is: " + str1);
  for (int i = 0; i < str1.length(); i++) {
   boolean unique = true;
   for (int j = 0; j < str1.length(); j++) {
    if (i != j && str1.charAt(i) == str1.charAt(j)) {
     unique = false;
     break;
    }
   }
   if (unique) {
    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
    break;
   }
  }
 }
}
    
    