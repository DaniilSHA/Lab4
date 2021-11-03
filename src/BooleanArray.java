import java.util.Arrays;

public class BooleanArray implements Array {
    
    @Override
    public boolean isElement(int index) {
        if (index < 0 | index >= arrayBoolean.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            return arrayBoolean[index];
        }
    }

    @Override
    public void setElementTrue(int index) {
        if (index < 0 | index >= arrayBoolean.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayBoolean[index] = true;
        }
    }

    @Override
    public void setElementFalse(int index) {
        if (index < 0 | index >= arrayBoolean.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayBoolean[index] = false;
        }
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 | index >= arrayBoolean.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayBoolean[index] = value;
        }
    }

    @Override
    public void invertingElement(int index) {
        if (index < 0 | index >= arrayBoolean.length) throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        else {
            arrayBoolean[index] = !arrayBoolean[index];
        }
    }

    @Override
    public int countTrueElements() {
        int counter = 0;
        for (int i = 0; i < arrayBoolean.length; i++)
            if (arrayBoolean[i] == true) counter++;
        return counter;
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < arrayBoolean.length; i++)
            if (arrayBoolean[i]) line += "1";
            else line += "0";
        return line;
    }
}
