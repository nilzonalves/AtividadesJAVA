package entities;

public class Employees {
    
    private int id;
    private String name;
    private double salary;
    
    public Employees(){        
    }    

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void increaseSalary(Double percentage){
        this.salary += salary * percentage /100; 
    }

    @Override
    public String toString(){
        return String.format("%d, %s, %.2f \n", getId(), getName(), getSalary());
    }    
}
