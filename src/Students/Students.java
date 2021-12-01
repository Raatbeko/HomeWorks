package Students;


class Student{
    private String dateOfBirth;
    private String firstNameAndLastName;
    private String gender;
    private int age;
    public void setDateOfBirth(String inputDateOfBrith){

        dateOfBirth = inputDateOfBrith;
    }
    public void setFirstNameAndLastName(String inputFirstNameAndLastName){
        firstNameAndLastName = inputFirstNameAndLastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setGender(String inputGender){
        gender = inputGender;
    }
    public void setAge(int inputAge){
        if (inputAge <= 0){
            System.out.println("Error");
        }else
        age = inputAge;
    }


}
