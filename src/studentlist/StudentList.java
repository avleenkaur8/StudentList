\/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author AVLEEN KUR
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] StudentList = new Student[3];
        Student s1 = new Student();
        s1.setName("Avleen Kaur");
        Student s2 = new Student();
        s2.setName("Muskan");
        Student s3 = new Student();
        s3.setName("Yashika Tiwana");
        Student s4 = new Student();
        s4.setName("Yashika Tiwana");
        StudentList[0] =s1;
        StudentList[1] =s2;
        StudentList[2] =s3;
        StudentList[3] =s4;
        
        //fill in 4 student names before running
        for (Student s : StudentList) {
            System.out.println(s.getName());
        }
    }
    
}
