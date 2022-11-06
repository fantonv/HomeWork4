public class Main {
    public static void main(String[] args) {
        //Task 1
        byte age = 20;
        if (age >= 18) {
            System.out.println("Поздравлем с совершеннолетием!");
        }
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        //Task 2
        byte age2 = 24;
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Ребенок уже закончил школу и ему можно отправлятся в Университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Task 3
        byte passengeres = 70;
        if (passengeres < 102){
            System.out.println("место в вагоне есть");
        }
        if (passengeres >= 102){
            System.out.println("мест нет");
        }
        if (passengeres < 60 ){
            System.out.println("есть сидячие места");
        }
        if (passengeres >= 60 && passengeres < 102){
            System.out.println("есть стоячие места");
        }
    }
}