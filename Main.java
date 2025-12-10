public class Main {
    public static void main(String[] args) {
        // Создаем массив с маленькой вместимостью, чтобы проверить расширение
        SortedStringList list = new SortedStringList(3);

        System.out.println("--- Adding elements ---");
        
        list.add("Java");
        list.printAll();
        
        list.add("C");
        list.printAll(); 
        
        list.add("Python");
        list.printAll(); 
        
        list.add("JavaScript");
        list.printAll();
        
        list.add("Go");
        list.printAll();

        System.out.println("\n--- Results ---");
        System.out.println("Max element (longest): " + list.getMax());
        System.out.println("Average length: " + list.getAverageLength());
    }
}
