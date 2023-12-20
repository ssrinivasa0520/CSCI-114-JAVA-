class Manager extends Employee{
   private String department;

   public Manager(String aName, double aSalary, String aDepartment) {
       super(aName, aSalary);
       department = aDepartment;
   }

   public String toString() {
       return super.toString()+" department=" + department;
   }

   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((department == null) ? 0 : department.hashCode());
       return result;
   }

   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Manager other = (Manager) obj;
       if (department == null) {
           if (other.department != null)
               return false;
       } else if (!department.equals(other.department))
           return false;
       return true;
   }
  
}