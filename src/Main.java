import java.util.*;
public class Main {
    /*Создать обобщенный класс с тремя параметрами (T, V, K).Класс содержит три переменные
    типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие
    значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
     */
    public class OrderedPair<T, V, K> {
        private T type;
        private V value;
        private K key;


        public OrderedPair(T type, V value, K key) {
            this.type = type;
            this.value = value;
            this.key = key;
        }

        public T getType() {
            return type;
        }

        public V getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }
    }

    public void main(String[] args) {
        OrderedPair<String, Integer, Integer> x1= new OrderedPair<>("Computer",128, 1);
    }
}
