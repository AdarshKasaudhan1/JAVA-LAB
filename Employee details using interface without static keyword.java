interface Employee{
    void Employee_details();
}
class EMP1 implements Employee {//implementation class
    public void Employee_details(){
        String Name= "Adarsh Kasaudhan";
        String  salary= "20k";
        String Location="Bengaluru";
        String Company="Microsoft";
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee 1= "+Name);
        System.out.println("Employee Salary="+salary);
        System.out.println("Employee Location= "+ Location);
        System.out.println("Employee company= "+Company);
    }
}
interface Employee2{//interface method
    void  Employee_details2();//interface method or abstract class
}
class EMP2 implements Employee2 {//implementation class
    public void Employee_details2(){
        String Name= "Prakhar Kasaudhan";
        String  salary= "25k";
        String Location="Bengaluru";
        String Company="TCS";
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee 2= "+Name);
        System.out.println("Employee Salary="+salary);
        System.out.println("Employee Location= "+ Location);
        System.out.println("Employee company= "+Company);
    }
}
interface Employee3{//interface method
    void  Employee_details3();//interface method or abstract class
}
class EMP3 implements Employee3 {//implementatiom class
    public void Employee_details3(){
        String Name= "Ashif Khan";
        String  salary= "30k";
        String Location="Bengaluru";
        String Company="continental";
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee 3= "+Name);
        System.out.println("Employee Salary="+salary);
        System.out.println("Employee Location= "+ Location);
        System.out.println("Employee company= "+Company);
    }
}

interface Employee4{//interface method
    void  Employee_details4();//interface method or abstract class
}
class EMP4 implements Employee4 {//implementation class
    public void Employee_details4(){
        String Name= "Ankit Pradhan";
        String  salary= "25k";
        String Location="Bengaluru";
        String Company="Target";
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee 4 = "+Name);
        System.out.println("Employee Salary="+salary);
        System.out.println("Employee Location= "+ Location);
        System.out.println("Employee company= "+Company);
    }
}

interface Employee5{//interface method
    void  Employee_details5();//interface method or abstract class
}
class EMP5 implements Employee5 {//implementation class
    public void Employee_details5(){
        String Name= "Suraj gurjar";
        String  salary= "35k";
        String Location="bengaluru";
        String Company="Infosis";
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee 5= "+Name);
        System.out.println("Employee Salary="+salary);
        System.out.println("Employee Location= "+ Location);
        System.out.println("Employee company= "+Company);
    }
}
class variablesopl{
    public static void main(String[]args){
        EMP1 ask1=new EMP1();
        ask1.Employee_details();
        EMP2 ask2=new EMP2();
        ask2.Employee_details2();
        EMP3 ask3=new EMP3();
        ask3.Employee_details3();
        EMP4 ask4=new EMP4();
        ask4.Employee_details4();
        EMP5 ask5=new EMP5();
        ask5.Employee_details5();
    }
}


