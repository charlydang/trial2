package help;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Project1
{
  public static void main(String[] args) throws NoSuchElementException
  {
    Scanner kb = new Scanner(System.in);
    
    BST tree = new BST();
    String s = null;
    System.out.println("Please enter the initial sequence of values: ");
    String numbers = kb.nextLine();
	String[] tokens = numbers.split("\\s+"); 
	int[] lol = new int[tokens.length]; 
	int i = 0;
	for (String token : tokens){
	lol[i++] = Integer.parseInt(token); 
	}
	
	for (int sa = 0; sa < lol.length; sa++) {
		tree.add(lol[sa]);				
		}
    //Scanner scan = new Scanner(System.in);
    
    System.out.print("\nPre-order: ");
    tree.preOrder();
    System.out.print("\nIn-order: ");
    tree.inOrder();
    System.out.print("\nPost-order: ");
    tree.postOrder();
    Object d;
	
        System.out.println("I Insert a value");
        System.out.println("D Delete a value");
        System.out.println("P Find predecessor");
        System.out.println("S Find successor");
        System.out.println("E Exit the program");
        System.out.println("H Display this message");
        System.out.print("Command? ");
        
        String input = kb.next();
        char order = input.charAt(0);
        char command = order;
        char[] good = new char[input.length() - 1];
         for( int l = 0; l < input.length() -1 ; l++) {
        	 good[l] = input.charAt(l + 2);
         }  
         String deezNuts = "";
         for (int y = 0; y < good.length; y++) {
        	 deezNuts += good[y];
         }
         System.out.println(deezNuts);
         
 
        int inputVal = Integer.parseInt(deezNuts);
        
        
        
  }

private static void successor(BTNode root) {
	
}

private static void predecessor(BTNode root) {
	
}

}