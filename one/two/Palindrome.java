public class Palindrome {
    public static void main(String[] args) {
        // Перебираем все аргументы командной строки
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            // Проверяем, является ли строка палиндромом
            if (isPalindrome(s)) {
                System.out.println(s + " - палиндром");
            } else {
                System.out.println(s + " - не палиндром");
            }
        }
    }
    
    // Метод для переворота строки
    public static String reverseString(String s) {
        String reversed = ""; // Создаем пустую строку для результата
        // Перебираем символы исходной строки с конца к началу
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Добавляем символы в обратном порядке
        }
        return reversed;
    }
    
    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s); // Переворачиваем строку
        return s.equals(reversed); // Сравниваем исходную и перевернутую строку
    }
}
