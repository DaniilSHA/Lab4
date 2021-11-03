public class Main {
    public static void main(String[] args) {
        System.out.println("Работа boolean массива".toUpperCase());

        BooleanArray booleanArray = new BooleanArray();
        System.out.println(booleanArray.toString());

        System.out.println("проверка элемента с заданным индексом 5 " + booleanArray.isElement(5));
        System.out.println("проверка элемента с заданным индексом 17 " + booleanArray.isElement(17));
        System.out.println("проверка элемента с заданным индексом 25 " + booleanArray.isElement(25));
        System.out.println("проверка элемента с заданным индексом 30 " + booleanArray.isElement(30));

        System.out.println("установка (в true) элемента с заданным индексом 5 ");
        booleanArray.setElementTrue(5);
        System.out.println("проверка элемента с заданным индексом 5 " + booleanArray.isElement(5));

        System.out.println("сброс (в false) элемента с заданным индексом 5 ");
        booleanArray.setElementFalse(5);
        System.out.println("проверка элемента с заданным индексом 5 " + booleanArray.isElement(5));

        System.out.println("установка элемента с заданным индексом 10 заданным логическим значением true");
        booleanArray.setElement(10, true);
        System.out.println("проверка элемента с заданным индексом 10 " + booleanArray.isElement(10));

        System.out.println("инвертирование элемента с заданным индексом 15");
        booleanArray.invertingElement(15);
        System.out.println("проверка элемента с заданным индексом 15 " + booleanArray.isElement(10));

        booleanArray.setElement(19, true);
        booleanArray.setElement(565, true);
        booleanArray.setElement(701, true);
        booleanArray.setElement(1023, true);
        booleanArray.setElement(0, true);

        System.out.println("количество элементов, установленных в true: " + booleanArray.countTrueElements());
        System.out.println(booleanArray.toString());

        System.out.println("Работа int массива".toUpperCase());

        IntArray intArray = new IntArray();
        System.out.println(intArray.toString());

        System.out.println("проверка элемента с заданным индексом 5 " + intArray.isElement(5));
        System.out.println("проверка элемента с заданным индексом 17 " + intArray.isElement(17));
        System.out.println("проверка элемента с заданным индексом 25 " + intArray.isElement(25));
        System.out.println("проверка элемента с заданным индексом 30 " + intArray.isElement(30));

        System.out.println("установка (в true) элемента с заданным индексом 5 ");
        intArray.setElementTrue(5);
        System.out.println("проверка элемента с заданным индексом 5 " + intArray.isElement(5));

        System.out.println("сброс (в false) элемента с заданным индексом 5 ");
        intArray.setElementFalse(5);
        System.out.println("проверка элемента с заданным индексом 5 " + intArray.isElement(5));

        System.out.println("установка элемента с заданным индексом 10 заданным логическим значением true");
        intArray.setElement(10, true);
        System.out.println("проверка элемента с заданным индексом 10 " + intArray.isElement(10));

        System.out.println("инвертирование элемента с заданным индексом 15");
        intArray.invertingElement(15);
        System.out.println("проверка элемента с заданным индексом 15 " + intArray.isElement(10));

        intArray.setElement(19, true);
        intArray.setElement(565, true);
        intArray.setElement(701, true);
        intArray.setElement(1023, true);
        intArray.setElement(0, true);

        System.out.println("количество элементов, установленных в true: " + intArray.countTrueElements());
        System.out.println(booleanArray.toString());


    }
}
