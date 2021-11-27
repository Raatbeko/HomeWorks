public class Student extends Human {
    long studentID;
    String whatCourseIsHeIn, whoIsStudyingAt, howDoesHeStudy;

    public void informationAboutStudent() {
        if (gender.equals("woman")) {
            System.out.println("Name-> " + name + "\n Age-> " + age + "\n Gender-> " + gender + "\nWhat course is he in ->" + whatCourseIsHeIn + "\nWho is study at ->" + whoIsStudyingAt +
                    "\nHow she study->" + howDoesHeStudy);

        } else {
            System.out.println("Name-> " + name + "\n Age-> " + age + "\n Gender-> " + gender + "\nWhat course is he in ->" + whatCourseIsHeIn + "\nWho is study at ->" + whoIsStudyingAt +
                    "\nHow he study->" + howDoesHeStudy);
        }
    }

}
