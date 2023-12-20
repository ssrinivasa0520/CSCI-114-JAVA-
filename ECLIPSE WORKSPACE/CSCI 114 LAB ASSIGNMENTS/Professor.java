public class Professor extends Person2 {
   private String highestEducation;

   public Professor(String identifier, String name, int id, String hghEdu) {
       super(identifier, name, id);
       this.highestEducation = hghEdu;
       // TODO Auto-generated constructor stub
   }

   public String getHighestEducation() {
       return highestEducation;
   }

   public String toString() {
       return "Professor [highestEducation=" + highestEducation + "]";
   }

}