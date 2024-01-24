/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *Hello this has been edited from remote
 * @author T450
 */
public class Student {
    private int sId;
    private String name;
    private String Address;

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getsId() {
        return sId;
    }

    public String getAddress() {
        return Address;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int sId, String name) {
        this.sId = sId;
        this.name = name;
    }
    

}
