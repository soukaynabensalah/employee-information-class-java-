
class Main {
    public static void main(String[] args) {
        Employee emp1 =  new Employee();
        emp1 name = "Ahmed";
        emp1 age = 30;
        emp1 sales = 10;
        emp1 bonushrs = 10000;
        emp1 basesalary = 20000;
        
        emp1.info();
        emp1.netsalary();
    }
}
class Employee (){
    string name;
    short age;
    short sales;
    short bonushrs;
    short basesalary;
    
    void info() {
        System.out.println("the name of employee is : " + name);
        System.out.println("the age is :  " + age + "ans");
        System.out.println("the sales are :  " + sales + " dh");
        System.out.println("the bonushrs is : " + " dh");
        System.out.println("the base salary is :  " + basesalary + " dh");
    }
    
    void netsalary() {
        System.out.println("the nert salary is : " + basesalqry + bonushrs + sales * 1000 + "dh");
    }
    
}
