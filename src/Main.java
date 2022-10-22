public class Main {
    public static void main(String[] args) {

            //задание 1
            System.out.println("задание 1");
            String firstName = "Ivan";
            String middName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);


            //задание 2
            System.out.println("задание 2");

            String Name = "ivanov ivan ivanovich";

            String upperFullName = Name.toUpperCase();
            System.out.println("Данные Ф.И.О. сотрудника для заполнения анкеты - " + upperFullName);

            //задание 3
            System.out.println("задание 3");

            String fullName2 = "Иванов Семён Семёнович";
            String fixedFullName = fullName2.replace("ё" , "е");
        System.out.println("Данные Ф.И.О. сотрудника -" + fixedFullName);

        }

    }

