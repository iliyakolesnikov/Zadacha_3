public class SortedStringList {
    private String[] array;
    private int size;       // Текущее количество элементов
    private int capacity;   // Вместимость массива

    // Конструктор с начальной вместимостью
    public SortedStringList(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = new String[capacity];
        this.size = 0;
    }

    // Метод добавления (вставка в нужное место для сохранения порядка)
    public void add(String str) {
        if (size >= capacity) {
            resize(); // Увеличиваем массив, если места нет
        }

        // 1. Ищем позицию для вставки (первый элемент, который длиннее нашего)
        int index = size; // По умолчанию ставим в конец
        for (int i = 0; i < size; i++) {
            if (array[i].length() > str.length()) {
                index = i;
                break;
            }
        }

        // 2. Сдвигаем элементы вправо, освобождая место
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        // 3. Вставляем строку
        array[index] = str;
        size++;
    }

    // Метод возврата максимального элемента
    public String getMax() {
        if (size == 0) return null;
        // Так как массив отсортирован по возрастанию, самый длинный элемент — последний
        return array[size - 1];
    }

    // Метод расчета средней длины
    public double getAverageLength() {
        if (size == 0) return 0;
        double totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += array[i].length();
        }
        return totalLength / size;
    }

    // Вспомогательный метод для увеличения массива
    private void resize() {
        capacity *= 2;
        String[] newArray = new String[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    
    // Для вывода в консоль при тесте
    public void printAll() {
        System.out.print("Array state: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "(" + array[i].length() + ") ");
        }
        System.out.println();
    }
}
