public class SeniorDeveloper extends Developer{
    private double  salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;

    public SeniorDeveloper(String platform, String interviewerName, int workingHours, double salary, int contractPeriod){
        super(platform, interviewerName, workingHours);
            this.salary = salary;
            this.contractPeriod = contractPeriod;
        
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;
    }

    public double getSalary(){
        return salary;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getStaffRoomNumber(){
        return staffRoomNumber;
    }
    
    public int getContractPeriod(){
        return contractPeriod;
    }

    public double getAdvanceSalary(){
        return advanceSalary;
    }

    public boolean getAppointed(){
        return appointed;
    }

    public boolean getTerminated(){
        return appointed;
    }

    public void setSalary(double salary){
            this.salary = salary;
    }

    public void setContractPeriod(int contractPeriod){
        this.contractPeriod = contractPeriod;
    }

    public void hireDeveloper(String developerName, String joiningDate, Double advanceSalary, String staffRoomNumber){
        if(appointed == true){
            System.out.println("The developer name is "+ developerName);
            System.out.println("The room number is "+ staffRoomNumber);
        }
        else{
            setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.staffRoomNumber = staffRoomNumber;
            this.advanceSalary = advanceSalary;
            this.appointed = true;
            this.terminated = false;
        }
    }

    public void contractTermination(){
        if(terminated==true){
            System.out.println("The contract is terminated");
        }
        else{
            super.setDeveloperName("");
                this.joiningDate = "";
                this.advanceSalary = 0.0;
                this.appointed = false;
                this.terminated = true;
            
        }
    }

    public void print(){
        System.out.println("The platform name is "+ super.getPlatform());
        System.out.println("The interviewer name is "+super.interviewerName());
        System.out.println("The salary of the developer name is "+ salary);
    }

    public void displayDetails(){
        super.display();

        if(appointed==true){
            System.out.println("The termination status is "+terminated);
            System.out.println("The joining date is "+joiningDate);
            System.out.println("The ");
        }
    }
}


