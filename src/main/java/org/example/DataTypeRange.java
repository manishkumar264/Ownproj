public class DataTypeRange {
    public static void main(String[] args) {

        System.out.println("byte:");
        System.out.println("Size: " + Byte.BYTES + " bytes");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("\nshort:");
        System.out.println("Size: " + Short.BYTES + " bytes");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.println("\nint:");
        System.out.println("Size: " + Integer.BYTES + " bytes");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("Size: " + Long.BYTES + " bytes");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }
}

