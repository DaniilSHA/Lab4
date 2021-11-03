import java.util.Arrays;

public class BooleanArray implements Array {
    private boolean[] array = new boolean[1024];

    @Override
    public boolean isElement(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            return array[index];
        }
    }

    @Override
    public void setElementTrue(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = true;
        }
    }

    @Override
    public void setElementFalse(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = false;
        }
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = value;
        }
    }

    @Override
    public void invertingElement(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = !array[index];
        }
    }

    @Override
    public int countTrueElements() {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == true) counter++;
        return counter;
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < array.length; i++)
            if (array[i]) line += "1";
            else line += "0";
        return line;
    }
}
