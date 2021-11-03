public class IntArray implements Array{
    private int[] array = new int [1024];

    @Override
    public boolean isElement(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            return array[index]==1 ? true : false;
        }
    }

    @Override
    public void setElementTrue(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = 1;
        }
    }

    @Override
    public void setElementFalse(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = 0;
        }
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = value ? 1 : 0;
        }
    }

    @Override
    public void invertingElement(int index) {
        if (index < 0 | index >= array.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            array[index] = array[index] == 1 ? 0 : 1;
        }
    }

    @Override
    public int countTrueElements() {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) counter++;
        return counter;
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) line += "1";
            else line += "0";
        return line;
    }
}
