package timur.wrapper.controller;

public class MinMaxAppl {
    public static void main(String[] args) {
        if (args.length == 0) {
            String[] arr = {"byte", "int", "short", "long", "char", "float", "double"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(maxAndMin(arr[i]) + "\n");
            }

        }


    }


    public static String maxAndMin(String dataType) {
        String str;
        switch (dataType.toLowerCase()) {
            case "byte":
                str = "Byte's Min. value is " + Byte.MIN_VALUE
                        + "\nByte's Max. value is " + Byte.MAX_VALUE;
                return str;

            case "int":
                str = "Integer's Min. value is " + Integer.MIN_VALUE
                        + "\nInteger's Max. value is " + Integer.MAX_VALUE;
                return str;

            case "short":
                str = "Short's Min. value is " + Short.MIN_VALUE
                        + "\nShort's Max. value is " + Short.MAX_VALUE;
                return str;

            case "long":
                str = "Long's Min. value is " + Long.MIN_VALUE
                        + "\nLong's Max. value is " + Long.MAX_VALUE;
                return str;

            case "char":
                str = "Char's Min. value is " + (int) Character.MIN_VALUE
                        + "\nChar's Max. value is " + (int) Character.MAX_VALUE;
                return str;

            case "float":
                str = "Float's Min. value is " + Float.MIN_VALUE
                        + "\nFloat's Max. value is " + Float.MAX_VALUE;
                return str;

            case "double":
                str = "Double's Min. value is " + Double.MIN_VALUE
                        + "\nDouble's Max. value is " + Double.MAX_VALUE;
                return str;

        }

        return dataType + " - Wrong Type";
    }
}


//    public static String maxAndMin (String dataType){
//        String type = dataType.substring(0, 1).toUpperCase() + dataType.substring(1).toLowerCase();/
//
//        String str = "Byte's Min. value is " + type.MIN_VALUE
//        + "Byte's Max. value is " + type.MAX_VALUE;
//
//
//        return dataType;
//    }