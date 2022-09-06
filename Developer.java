public class Developer{
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;

    public Developer(String platform, String interviewerName, int workingHours ){
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        this.developerName = "";
    }

        public String getPlatform(){
            return platform;
        }
        

        public String interviewerName(){
            return interviewerName;
        }
        
        public int workingHours(){
            return workingHours;
        }

        public String getDeveloperName(){
            return developerName;
        }

        public void setDeveloperName(String developerName){
            this.developerName = developerName;
        }

        public void display(){
            System.out.println("The platform is"+platform);
            System.out.println("The workinghour is"+ workingHours);
            System.out.println("The interviewername is"+interviewerName);
            if(developerName!=""){
                System.out.println("The developerName is"+ developerName);
            }
        }
    }