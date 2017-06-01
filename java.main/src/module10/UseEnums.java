package module10;

/**
 * Created by citsym on 29.05.17.
 */
public class UseEnums {



    public static void main(String[] args) {

//      int holidaysCount =  calculateHolidaysCountByMonthName(MonthEnum.ЯНВАРЬ);


        for (MonthEnum monthEnum : MonthEnum.values()) {
            System.out.println(monthEnum.getNameOfMOnth());
        }

        MonthEnum август = MonthEnum.valueOf("АВГУСТ");
        System.out.println("В " + август.getNameOfMOnth() + " " +  август.getHolidysCount());

        System.out.println("В " + MonthEnum.МAРТ.getNameOfMOnth() + " " + MonthEnum.МAРТ.getHolidysCount() + " праздников");
    }

//    private static int calculateHolidaysCountByMonthName(String monthName) {
//
//        switch (monthName){
//            case Months.ЯНВАРЬ:
//                return 5;
//            case ФЕВРАЛЬ:
//                return 2;
//            case МAРТ:
//                return 1;
//            default:
//                return 0;
//        }
//
//    }


//    private static int calculateHolidaysCountByMonthName(MonthEnum month) {
//
//        switch (month){
//            case ЯНВАРЬ:
//                return 5;
//            case ФЕВРАЛЬ:
//                return 2;
//            case МAРТ:
//                return 1;
//            default:
//                return 0;
//        }
//
//    }
}
