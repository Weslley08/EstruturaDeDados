package tipos;

public class Wrappers {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
        //Autoboxing

        
		Byte b1 = 127;   //byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c1 = 'A'; //char
        Character c2 = 15;

        Short s1 = 32767; //short
        Short s2 = -32768;

        Integer i1 = 2147483647;  //int
        Integer i2 = -2147483648;

        Long l1 = 9223372036854775807L; //long
        Long l2 = -9223372036854775808L;

        Float f1 = 65f; //float
        Float f2 = 65.0f;
        Float f3 = -0.5f;

        Double d1 = 1024.99;  //Double
        Double d2 = 10.2456;

        Boolean bo1 = true;  //boolean
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false");  //OK
        Boolean bo4 = Boolean.valueOf("true");   //OK
        
    }

}
