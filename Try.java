class ToAscii
{
    public void dispASCII()
    {
      char chA= 'A', chZ='Z', cha='a', chz= 'z';
      int ascA, ascZ, asca, ascz;
      ascA = (int) chA;
      ascZ = (int) chZ;
      asca = (int) cha;
      ascz = (int) chz;
      System.out.println(" The ASCII value of character A is "+ascA);
      System.out.println(" The ASCII value of character Z is "+ascZ);
      System.out.println(" The ASCII value of character a is "+asca);
      System.out.println(" The ASCII value of character z is "+ascz);
    }
}
public class Try
{
    public static void main(String args[])
    {
        ToAscii Object1;
        Object1 = new ToAscii();
        Object1.dispASCII();
    }
}