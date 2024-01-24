/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author T450
 */
public class PartTimeStudent extends Student{
    private int numOfCourses;

    public PartTimeStudent(int numOfCourses, int sId, String name) {
        super(sId, name);
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
    
}
