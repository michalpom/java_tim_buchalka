public class SpeedConventer {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;}
        //}else {
          //  return kilometersPerHour/1.6
        //}
        return Math.round(kilometersPerHour/1.609);
        //return milesPerHour;
    }
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour<0){
            System.out.println("Invalid value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }

    }
}
