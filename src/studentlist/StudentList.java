package studentlist;

import java.util.Scanner;

/**
 * This class is for our first example
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // First we do our word reverse review
        
        System.out.println("Please enter a word");
       
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        
        char[] letters = new char[word.length()];
        
        // have a loop to populate the array
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }
        
        System.out.println("Here is the word from the array");
        
        // print out the array
        for(char letter: letters) {
            System.out.print(letter);
        }
        
        System.out.println("\nHere is the word reversed");
        
        // print out the word in reverse
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        // print a blank line
        System.out.println();
        
        System.out.println("Now we do the Student code");
        
        Student[] studentList = new Student[3];
        
        for (int i = 0; i < studentList.length; i++) {
        
            System.out.println("Enter the student name");
            String name = input.nextLine();
            Student student = new Student(name);
            studentList[i] = student; // put student in the array
        }
        
        System.out.println("Now we print them out");
        
        for (Student student: studentList) {
            System.out.println(student.getName());
        }
        
    }

}

