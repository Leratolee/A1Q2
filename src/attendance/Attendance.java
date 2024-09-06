/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attendance;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Attendance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> emailsArr = new ArrayList<>();
        ArrayList<String> idArr = new ArrayList<>();
        ArrayList<String> attendanceArr = new ArrayList<>();
        ArrayList<String> postionArr = new ArrayList<>();
        ArrayList<String> namesArr = new ArrayList<>();
        ArrayList<String> surnamesArr = new ArrayList<>();
        ArrayList<Double> salaryArr = new ArrayList<>();
        //Store data in array
        String[] emails={"sipho@gmail.com","thabo@gmail.com","dipuo@gmail.com","mampho@gmail.com"};
        String[] names = {"Sipho","Thabo Alfred","Dipuo","Mampho"};
        String[] surnames = {"Sethu","Ditaba","Williams","Khumalo"};
        String[] id={"se1","di1","wi2","khu1"};
        String[] position = {"CEO","COO","CFO","CTO"};
        double[] salary = {15806800.00,12999999.99,13025665.05,13289856.96};
      
        String[] attendance = {"absent","absent","absent","absent"};
        
        
        //populate employees
        Employees emp=new Employees();

        //store data in arraylist
        for(int i = 0;i < id.length;i++){
            
            emailsArr.add(emails[i]);
            idArr.add(id[i]);
            namesArr.add(names[i]);
            surnamesArr.add(surnames[i]);
            postionArr.add(position[i]);
            salaryArr.add(salary[i]);
            attendanceArr.add(attendance[i]);
            
        }
        
        //mark attendance
        System.out.println("Hi registerer enter register");
        int register=1;
        register = scanner.nextInt();
        while(register != 0){
            
            System.out.print("Enter employee email or name to mark register: ");
            String email = scanner.next();
            
            
            for(int i = 0;i<id.length;i++){
                if(emailsArr.get(i).equals(email)){
            
                    
                    attendanceArr.add(i,"present");
                }
                 
            }
            
            System.out.println("Hi registerer enter register");
             register = scanner.nextInt();
        }
        
        for(int i =0;i<id.length;i++){
           
            System.out.println(surnamesArr.get(i)+" "+namesArr.get(i)+ " is "+attendanceArr.get(i));
           
        }
    }
    
}
