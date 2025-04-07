//// student Attendance Managemnet System
//class Student {
//    private String student_id;
//    private String student_name;
//    Student(String student_id,String student_name){
//        this.student_id=student_id;
//        this.student_name=student_name;
//
//
//    }
//        public String getid(){
//        return student_id;
//        }
//        public  String getname(){
//        return student_name;
//        }
//}
//class Attendance{
//   private Student students;
//   private boolean present;
//
//   Attendance(Student students,boolean present){
//       this.students=students;
//       this.present=present;
//   }
//   public void checkattendace(){
//       if(present){
//           System.out.println("Student Attendance Management System");
//           System.out.println("Studentid:" + students.getid() );
//           System.out.println("Studentname:" + students.getname() );
//           System.out.println("Student status: present");
//       }else {
//           System.out.println("Studentid:" + students.getid() );
//           System.out.println("Studentname:" + students.getname() );
//           System.out.println("Student status: Absent");
//       }
//   }
//}
//public class Studentattendancemanagementsystem{
//    public static void main(String [] args){
//        Student ask= new Student("101","Adarsh kasaudhan");
//        Student ask1= new Student("102","Prakhar kasaudhan");
//        Attendance ask2 =new Attendance(ask,true);
//        Attendance ask3 =new Attendance(ask1,false);
//        ask2.checkattendace();
//        ask3.checkattendace();
//    }
//}