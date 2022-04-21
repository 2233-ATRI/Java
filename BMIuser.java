import java.util.Scanner;
public class BMIuser {
    public static void main(String[] args) {
        BMI bmi1=new BMI("qihao",19,160,185);
        System.out.println("the BMIfor "+bmi1.getName()+" is "+bmi1.getBMI()+" "+bmi1.getStatus());
        BMI bmi2 = new BMI("wuqi",18,153,70);
        System.out.println("the BMIfor "+bmi2.getName()+" is "+bmi2.getBMI()+" "+bmi2.getStatus());
    }
}
class BMI{
    private String name;
    private int age;
    public double weight;
    public double height;
    public static final double KILOGRAM=0.45359237;
    public static final double METERS=0.0254;
    public BMI(String name,int age,double weight,double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name,double weight,double height){
        this(name,20,weight,height);
    }
    public double getBMI(){
        double bmi=weight*KILOGRAM/((height*METERS)*(height*METERS));
        return Math.round(bmi*100)/100.0;
    }
    public String getName(){
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
    public String getStatus(){
        double bmi=getBMI();
        if(bmi<18.5)
            return "underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<30){
            return "Overweight";
        }else{
            return "obese";
        }
    }
}
