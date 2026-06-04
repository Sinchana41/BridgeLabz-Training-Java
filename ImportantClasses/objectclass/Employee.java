package ImportantClasses.objectclass;

public class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString(){
       return employeeId+" : "+employeeName;
    }

    @Override
    public boolean equals(Object that){
      if((that instanceof Employee)){
      Employee employee = (Employee)that;
      if(this.employeeId == employee.employeeId && this.employeeName.equals(employee.employeeName))
        return true;
      else
        return false;
      }
      return false;
    }

    @Override
    public int hashCode(){
        return this.employeeId;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sinchana");
        Employee employee2 = new Employee(1, "Sinchana");
        System.out.println(employee1);//1 : Sinchana  
        System.out.println(employee1.hashCode());//1
        System.out.println(employee2.hashCode());//1
        System.out.println(employee1.equals(employee2));
    } 

}
