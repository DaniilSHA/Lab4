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

        System.out.println("Работа byte массива".toUpperCase());

        ByteArray byteArray = new ByteArray();
        System.out.println(byteArray.toString());

        System.out.println("проверка элемента с заданным индексом 5 " + byteArray.isElement(5));
        System.out.println("проверка элемента с заданным индексом 17 " + byteArray.isElement(17));
        System.out.println("проверка элемента с заданным индексом 25 " + byteArray.isElement(25));
        System.out.println("проверка элемента с заданным индексом 30 " + byteArray.isElement(30));

        System.out.println("установка (в true) элемента с заданным индексом 5 ");
        byteArray.setElementTrue(5);
        System.out.println("проверка элемента с заданным индексом 5 " + byteArray.isElement(5));

        System.out.println("сброс (в false) элемента с заданным индексом 5 ");
        byteArray.setElementFalse(5);
        System.out.println("проверка элемента с заданным индексом 5 " + byteArray.isElement(5));

        System.out.println("установка элемента с заданным индексом 10 заданным логическим значением true");
        byteArray.setElement(10, true);
        System.out.println("проверка элемента с заданным индексом 10 " + byteArray.isElement(10));

        System.out.println("инвертирование элемента с заданным индексом 15");
        byteArray.invertingElement(15);
        System.out.println("проверка элемента с заданным индексом 15 " + byteArray.isElement(10));

        byteArray.setElement(19, true);
        byteArray.setElement(565, true);
        byteArray.setElement(701, true);
        byteArray.setElement(1023, true);
        byteArray.setElement(0, true);

        System.out.println("количество элементов, установленных в true: " + byteArray.countTrueElements());
        System.out.println(byteArray.toString());


    }
}
