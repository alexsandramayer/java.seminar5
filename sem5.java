package seminar5;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;
// import java.util.Random;

// Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
// public class sem5 {
//     public static void main (String[] args){
//         Map<String, List<String>> book = new HashMap<>();
//         book.put("John", List.of("8 927 555 77 77", "8 965 425 85 65"));
//         book.put("Petr", List.of("8 937 856 85 56", "8 917 456 54 58"));
//         book.put("Max", List.of("8 954 247 55 38", "8 927 852 21 23"));

//         menu(book);
//     }
//     public static String scan(){
//         Scanner scanner = new Scanner(System.in);
//         String scan = scanner.nextLine();
        
//         return scan;
//     }

//     public static void find(Map<String, List<String>> phoneBook){
//         System.out.print("Имя абонента: ");
//         String name = scan();
//         System.out.println("Имя: "+ name +"\nТелефон(ы): "+ phoneBook.get(name));
//     }

//     public static void allBook(Map<String, List<String>> AllBook){
//         for (var item : AllBook.entrySet()){
//             System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
//         }
//     }

//     public static Map<String, List<String>> add(Map<String, List<String>> book){
//         System.out.print("Имя абонента: ");
//         String name = scan();
//         List<String> data = new ArrayList<>();
//         while (true){
//             System.out.println("Если номеров больше нет, введите '5'");
//             System.out.print("Введите номер: ");
//             String nomer = scan();
//             if (nomer.equals("5")) {
//                 break;
//             } else {
//                 data.add(nomer);
//             }
//         }
//         book.put(name, data);

//         return book;
//     }

//     public static Map<String, List<String>> menu(Map<String, List<String>> book) {
//         while (true){
//             System.out.println( "    --------------\n   Телефонная Книга\n    --------------\n" +
//                 "        Меню: \n1. Найти контакт \n2. Добавить контакт"+
//                 " \n3. Печать телефонной книги \n4. Выход");
//             System.out.print("\nвыберите пункт меню-> ");
//             String comands = scan();
//             if (comands.equals("4")){
//                 break;
//             } else {
//                 switch (comands) {
//                     case "1":
//                         find(book);
//                         break;
//                     case "2":
//                         add(book);
//                         break;
//                     case "3":
//                         allBook(book);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         return book;
//     }
// }


// Задача 2. Пусть дан список сотрудников:
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, 
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.

// public class sem5{
//     public static void main (String[] args){
//         Map<String, Integer> listWorkers = new HashMap<>();
//         String workers = 
//                 "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова " +
//                 "Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова " +
//                 "Марина Светлова Мария Савина Мария Рыкова Марина Лугова " +
//                 "Анна Владимирова Иван Мечников Петр Петин Иван Ежов ";

//         String[] NamesSurnames = workers.split(" ");
//         for (int i = 0; i < NamesSurnames.length; i += 2){
//             if (listWorkers.containsKey(NamesSurnames[i])){
//                 listWorkers.replace(NamesSurnames[i], listWorkers.get(NamesSurnames[i]) + 1);
//             } else{
//                 listWorkers.put(NamesSurnames[i], 1);
//             }
//         }
//         System.out.println("\nСписок имен:");
//         System.out.println(listWorkers);

//         System.out.println("\nСписок имен по популярности:");
//         listWorkers.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
//             .forEach(System.out::println);
//     }
// }





