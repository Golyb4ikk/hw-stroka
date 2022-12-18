public class Main {
    public static void main(String[] args) {
        //zadacha 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
        //zadacha 2
        String upCase = fullName.toUpperCase();
        System.out.println(upCase);
        //zadacha 3
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println(fullName3);

    }
}