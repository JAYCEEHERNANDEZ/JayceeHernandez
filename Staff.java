public class Staff extends Person{
    protected String School;
    protected double Salary;

    public Staff(String Name, String Address, String School, int Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public String getSchool(){
        return School;
    }
    public double getSalary(){
        return Salary;
    }
}
