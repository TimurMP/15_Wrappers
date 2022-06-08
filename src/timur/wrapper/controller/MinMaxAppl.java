package timur.wrapper.controller;

public class MinMaxAppl {
    public static void main(String[] args) {
        if (args.length == 0) {
            String[] arr = {"byte", "int", "short", "long", "char", "float", "double"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(maxAndMin(arr[i]) + "\n");
            }
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(maxAndMin(args[i]) + "\n");
            }
        }
    }


    public static String maxAndMin(String dataType) {
        String templateMin = dataType + "'s Min. value is ";
        String templateMax = "\n" + dataType +"'s Max. value is ";

        switch (dataType.toLowerCase()) {
            case "byte":
                return templateMin + Byte.MIN_VALUE + templateMax + Byte.MAX_VALUE;
            case "int":
                return templateMin + Integer.MIN_VALUE + templateMax + Integer.MAX_VALUE;
            case "short":
                return templateMin + Short.MIN_VALUE + templateMax + Short.MAX_VALUE;
            case "long":
                return templateMin + Long.MIN_VALUE + templateMax + Long.MAX_VALUE;
            case "char":
                return templateMin + (int) Character.MIN_VALUE + templateMax + (int) Character.MAX_VALUE;
            case "float":
                return templateMin + Float.MIN_VALUE + templateMax + Float.MAX_VALUE;
            case "double":
                return templateMin + Double.MIN_VALUE + templateMax + Double.MAX_VALUE;
        }
        return dataType + " - Wrong Type";
    }


//    public static String maxAndMin(String dataType) {
//        String type = dataType.substring(0, 1).toUpperCase() + dataType.substring(1).toLowerCase();
//
//        String str = "Byte's Min. value is " + type.MIN_VALUE
//                + "Byte's Max. value is " + type.MAX_VALUE;
//
//
//        return dataType;
//    }

}