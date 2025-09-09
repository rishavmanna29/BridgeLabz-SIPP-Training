abstract class JobRole {
    String applicantName;
    public JobRole(String applicantName) { this.applicantName = applicantName; }
    public abstract void evaluate();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
    public void evaluate() { System.out.println("Evaluating Software Engineer: " + applicantName); }
}

class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
    public void evaluate() { System.out.println("Evaluating Data Scientist: " + applicantName); }
}

class ProductManager extends JobRole {
    public ProductManager(String name) { super(name); }
    public void evaluate() { System.out.println("Evaluating Product Manager: " + applicantName); }
}

class Resume<T extends JobRole> {
    private List<T> applicants = new ArrayList<>();
    public void add(T applicant) { applicants.add(applicant); }
    public List<T> getApplicants() { return applicants; }

    public static void screenResumes(List<? extends JobRole> list) {
        for (JobRole jr : list) jr.evaluate();
    }
}

public class ResumeApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.add(new SoftwareEngineer("Alice"));

        Resume.screenResumes(seResumes.getApplicants());
    }
}
