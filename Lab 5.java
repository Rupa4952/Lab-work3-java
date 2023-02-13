 public class Employee {
     int empid;
     String empName;

     Employee(int id, String name) {
         this.empid = id;
         this.empName = name;
     }

     void info() {
         System.out.println("Id:" + empid + " Name: " + empName);
     }

     public static void main(String[] args) {
         Employee obj1 = new Employee(4952, "Rupa");
         Employee obj2 = new Employee(4855, "Anamika");
         obj1.info();
         obj2.info();

     }
 }
