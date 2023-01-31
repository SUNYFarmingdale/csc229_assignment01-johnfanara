/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    int ID;
    String name;
    String code;

//default constructor
    public Course(){
        this.ID = 0;
        this.name = "";
        this.code = "";
    }
//get ant set methods    
    public int getID(){
        return ID;
    }
    public void setID(int newID){
        this.ID = newID;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    
    public String getCode(){
        return code;
    }
    public void setCode(String newCode){
        this.code = newCode;
    }
    
 //overloaded constructor
    public Course(int ID, String name, String code){
        this.ID = ID;
        this.name = name;
        this.code = code;    
    }
    
}
