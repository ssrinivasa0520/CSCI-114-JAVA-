class Employee{
   private String name;
   private double salary;
   public Employee(String aName, double aSalary) {
       super();
       name = aName; //Getting name input 
       salary = aSalary; //Getting salary input
   }
   public String toString() {
       return "name=" + name + ", salary=" + salary;
   }
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((name == null) ? 0 : name.hashCode());
       long temp;
       temp = Double.doubleToLongBits(salary);
       result = prime * result + (int) (temp ^ (temp >>> 32));
       return result;
   }
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Employee other = (Employee) obj;
       if (name == null) {
           if (other.name != null)
               return false;
       } else if (!name.equals(other.name))
           return false;
       if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
           return false;
       return true;
   }
  
  
}