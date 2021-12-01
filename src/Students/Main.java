package Students;

import Animals.Cat;
import Animals.Dog;
import Animals.Fish;
import Animals.Parrot;


public class Main {
    public static void main(String[] args) {

        animals();

        student();
    }

    public static  void animals(){
        System.out.println("Dog");
        Dog bobik = new Dog();
        bobik.setNameAnimal("Bobik");
        bobik.setBreedAnimal("Labrador");
        bobik.setAgeAnimal("2 year");
        bobik.setColorAnimal("Gray");
        bobik.aboutDog();
        System.out.println();


        System.out.println("Parrot");
        Parrot gosha = new Parrot();
        gosha.setNameAnimal("Gosha");
        gosha.setAgeAnimal("7 month");
        gosha.setBreedAnimal("jako");
        gosha.setColorAnimal("Green");
        gosha.setLifeInHomeOrWild("a pet");
        gosha.aboutParrot();
        System.out.println();


        System.out.println("Cat");
        Cat pushistick = new Cat();
        pushistick.setNameAnimal("Pushistic");
        pushistick.setAgeAnimal("1.5 year");
        pushistick.setBreedAnimal("British");
        pushistick.setColorAnimal("bold");
        pushistick.aboutCat();
        System.out.println();


        System.out.println("Fish");
        Fish vasy = new Fish();
        vasy.setNameAnimal("Vasy");
        vasy.setAgeAnimal("2 month");
        vasy.setBreedAnimal("Pike");
        vasy.setLifeInOceanOrSea("Sea");
        vasy.aboutFish();
        System.out.println("--------------------------------------------");
    }



    public static void student(){
        int ID = 1;

        Course course = new Course();
        course.setData("30.11.21");
        course.setNameOfTeacher("Baizhigit Karymbaev");
        course.setID(ID);
        course.idNumStudents();

        System.out.println();
        System.out.println("Student N°" + ID++);

        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].setFirstNameAndLastName("Aibek Sheishenov");
        students[0].setAge(17);
        students[0].setGender("Man");
        students[0].setDateOfBirth("14.06.04");
        aboutStudent(students[0].getFirstNameAndLastName(),students[0].getAge(),students[0].getGender(),students[0].getDateOfBirth());

        System.out.println();

        System.out.println("Student N°" + ID++);
        students[1] = new Student();
        students[1].setFirstNameAndLastName("Aijan Mederbekova");
        students[1].setAge(19);
        students[1].setGender("Woman");
        students[1].setDateOfBirth("11.01.02");
        aboutStudent(students[1].getFirstNameAndLastName(),students[1].getAge(),students[1].getGender(),students[1].getDateOfBirth());

        System.out.println();

        System.out.println("Student N°" + ID++);
        students[2] = new Student();
        students[2].setFirstNameAndLastName("Alexsei Tsvetikov");
        students[2].setAge(18);
        students[2].setGender("Man");
        students[2].setDateOfBirth("25.09.03");
        aboutStudent(students[2].getFirstNameAndLastName(),students[2].getAge(),students[2].getGender(),students[2].getDateOfBirth());

        System.out.println();

        Group group4 = new Group();
        group4.setStudent(students);
        group4.setCourse(3);
        group4.setDataOfBegin("13.09.22");
        group4.setFinish("24.07.23");
        System.out.println("Course-> " + group4.getCourse() + "\nDate of begin->" + group4.getDataOfBegin() + "\nDate of finish->" + group4.getFinish());

    }
    public static void aboutStudent(String firstNameAndLastName,int age,String gender,String dateOfBirth){
        System.out.println("Name-> " + firstNameAndLastName + "\nAge-> " + age + "\nGender-> " + gender + "\nData of birth->" + dateOfBirth);

    }
}
