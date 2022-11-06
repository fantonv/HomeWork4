public class Main {
    public static void main(String[] args) {
        //Task 1
        byte age = 17;
        if (age >= 18) {
            System.out.println("Поздравлем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        //Task 2
        byte age2 = 32;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок может пойти в школу");
        } else {
            if (age2 >= 18 && age2 < 24){
                System.out.println("Человек закончил школу и может отправлятсья в университет");
            } else {
                if (age2 >= 24){
                    System.out.println("Человек окончил университет и может пойти на работу");
                }
            }
        }

        //Task 3
        int passengeres = 55;
        if (passengeres < 102){
            System.out.println("Места в вагоне есть");
        }else{
            System.out.println("Мест в вагоне нет");
        }
        if (passengeres < 60){
            System.out.println("места сидячие");
        }else {
            if (passengeres >=60 && passengeres < 102){
                System.out.println("места стоячие");
            }
        }
        }
    }