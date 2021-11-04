public class ByteArray implements Array{

    @Override
    public boolean isElement(int index) {
        if (index < 0 | index >= arrayByte.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            return arrayByte[index]==1 ? true : false;
        }
    }

    @Override
    public void setElementTrue(int index) {
        if (index < 0 | index >= arrayByte.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayByte[index] = 1;
        }
    }

    @Override
    public void setElementFalse(int index) {
        if (index < 0 | index >= arrayByte.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayByte[index] = 0;
        }
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 | index >= arrayByte.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayByte[index] = value ? (byte)1 : (byte)0;
        }
    }

    @Override
    public void invertingElement(int index) {
        if (index < 0 | index >= arrayByte.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayByte[index] = arrayByte[index] == 1 ? (byte)0 : (byte)1;
        }
    }

    @Override
    public int countTrueElements() {
        int counter = 0;
        for (int i = 0; i < arrayByte.length; i++)
            if (arrayByte[i] == 1) counter++;
        return counter;
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < arrayByte.length; i++)
            if (arrayByte[i] == 1) line += "1";
            else line += "0";
        return line;
    }
}
