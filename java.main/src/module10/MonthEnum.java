package module10;

/**
 * Created by citsym on 29.05.17.
 */
public enum MonthEnum {
    МAРТ(1, "Март"), ФЕВРАЛЬ(2), ЯНВАРЬ(5), АПРЕЛЬ, МАЙ, ИЮНЬ, ИЮЛЬ, АВГУСТ;

    private int holidysCount;
    private String nameOfMOnth;

    MonthEnum(int holidysCount) {
        this.holidysCount = holidysCount;
    }

     MonthEnum(int holidaysCount, String nameOfMOnth) {
         this(holidaysCount);
         this.nameOfMOnth = nameOfMOnth;
     }


    public String getNameOfMOnth() {
        if (nameOfMOnth!=null) {
            return nameOfMOnth;
        } else {
            return name();
        }
    }

    public int getHolidysCount() {
        return holidysCount;
    }

    MonthEnum() {
    }

}
