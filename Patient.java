public class Patient{
    private String patientName;
    private int age;
    private String medicalHistory;
    private String currentCondition;

    public String getPatientName(){
        return patientName;
    }
    public void setPatientName(String patientName){
       this.patientName=patientName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else {

            throw new IllegalArgumentException("Age can't be negative");
        }
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }
    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory=medicalHistory;
    }
    public String getCurrentCondition(){
        return currentCondition;
    }
    public void setCurrentCondition(String currentCondition){
        this.currentCondition=currentCondition;
    }

    public void patientInfo(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Age: "+age);
        System.out.println("Medical History: "+medicalHistory);
        System.out.println("Current Condition: "+currentCondition);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setPatientName("Ravi");
        p1.setAge(25);
        p1.setMedicalHistory("Diabetes");
        p1.setCurrentCondition("Stable");
        p1.patientInfo();
        Patient p2 = new Patient();
        p2.setPatientName("Harish");
        p2.setAge(30);
        p2.setMedicalHistory("Thyroid");
        p2.setCurrentCondition("Stable");
        p2.patientInfo();
        Patient p3 = new Patient();
        p3.setPatientName("Pavan");
        p3.setAge(42);
        p3.setMedicalHistory("Typhoid");
        p3.setCurrentCondition("Stable");
        p3.patientInfo();
    }
}