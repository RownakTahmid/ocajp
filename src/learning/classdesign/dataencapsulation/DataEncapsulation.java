package learning.classdesign.dataencapsulation;

import java.util.*;

class Company{
    private String name;
    private List<String> employee = new ArrayList<>();
    public Company(String name){
        this.name = name;
    }
    public Company(){}
    public void addEmployee(String name){
        if (name == null){
            System.out.println("not a valid employee");
            return;
        }
        employee.add(name);
    }
    public String getName(){
        return name;
    }
    public List<String> getEmployee(){
        return employee;
    }
}
public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company("Tesla");
        company.addEmployee(null);
        company.addEmployee("Robert");
        company.addEmployee("Alan");
        Collections.sort(company.getEmployee());
        System.out.println(company.getName());
        System.out.println(Arrays.toString(company.getEmployee().toArray()));
    }
}
