public class Main {
    public static void main(String[] args) {
        // Создаем массив с маленькой вместимостью, чтобы проверить расширение
        SortedStringList list = new SortedStringList(3);

        System.out.println("--- Adding elements ---");
        
        list.add("Java");
        list.printAll(); // Проверяем порядок
        
        list.add("C");
        list.printAll(); // C короче Java, должно встать перед ней
        
        list.add("Python");
        list.printAll(); 
        
        list.add("JavaScript"); // Тут массив должен расшириться
        list.printAll();
        
        list.add("Go");
        list.printAll();

        System.out.println("\n--- Results ---");
        System.out.println("Max element (longest): " + list.getMax());
        System.out.println("Average length: " + list.getAverageLength());
    }
}
