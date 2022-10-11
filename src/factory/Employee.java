package factory;
public class Employee {

    private String name;
    private Double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, Double salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear  = hireYear;
    }


    Double tax(){
        if (salary<1000){
            return 0.0;
        }
        else if (salary>=1000){
            return  (salary/100) * 3;
        }
        return 0.0;
    }

    int bonus(){
        if (workHours>40){
            return (workHours-40)*30;

        }

        return 0;
    }
    Double raiseSalary(){
        int currentYear=2021;
        double salaryAfterCalculation=salary+bonus()-tax();
        if (currentYear-hireYear<10){
            return ((salaryAfterCalculation/100)*5);
        } else if (currentYear-hireYear<20) {
            return ((salaryAfterCalculation/100)*10);

        }else if (currentYear-hireYear>=20){
            return ((salaryAfterCalculation/100)*15);
        }

        return 0.0;
    }
    @Override
    public String toString() {

        double netSalary = (this.salary + bonus() - tax() + raiseSalary()) ;
        System.out.print("Name: " + this.name  +"\nİşe Giriş Yılı: " + this.hireYear + "\nÇalışma Saati: " + this.workHours
                + "\nMaaş: " + this.salary + "\nBonus: " + bonus() + "\nVergi: " + tax()
                + "\nZam: " + raiseSalary() + "\nNet Maaş: " + netSalary);



        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}