abstract class CourseType {
    String title;
    public CourseType(String title) { this.title = title; }
    public abstract void showDetails();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) { super(title); }
    public void showDetails() { System.out.println("Exam-based: " + title); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) { super(title); }
    public void showDetails() { System.out.println("Assignment-based: " + title); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) { super(title); }
    public void showDetails() { System.out.println("Research-based: " + title); }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    public void addCourse(T course) { courses.add(course); }
    public List<T> getCourses() { return courses; }

    public static void showAllCourses(List<? extends CourseType> list) {
        for (CourseType ct : list) ct.showDetails();
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math 101"));

        Course.showAllCourses(examCourses.getCourses());
    }
}
