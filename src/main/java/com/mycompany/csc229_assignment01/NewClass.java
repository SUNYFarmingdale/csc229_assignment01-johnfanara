
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        //creates new instance of course
        Course course1 = new Course(1, "John", "CSC229");
        
        //prints course object
        System.out.println("Course ID: " + course1.ID);
        System.out.println("Course Name: " + course1.name);
        System.out.println("Course Code: " + course1.code);
        
    }
    
}
