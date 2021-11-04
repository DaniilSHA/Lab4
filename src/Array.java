public interface Array {
    boolean[] arrayBoolean = new boolean[1024];
    byte[] arrayByte = new byte[1024];

    boolean isElement(int index);
    void setElementTrue(int index);
    void setElement(int index, boolean value);
    void setElementFalse(int index);
    void invertingElement(int index);
    int countTrueElements();
    String toString();
}
