    public class Order<T, V, K> {

        private T type;
        private V value;
        private K key;


        public Order(T type, V value, K key) {
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

        @Override
        public String toString() {
            return "Рабочий: \n" +
                    "На чем работает:" + type + ";\n"+
                    "Лет рабочему:" + value + ";\n"+
                    "Номер раб.места:" + key +".";
        }

    }

