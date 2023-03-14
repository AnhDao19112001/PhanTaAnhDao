package case_study.utils.regex;

public class Regex {
    public static final String REGEX_VILLA = "^(SVVL)[-][0-9]{4}$";
    public static final String REGEX_ROOM = "^(SVRO)[-][0-9]{4}$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})[m][2]$";
    public static final String REGEX_RENTAL_COSTS = "^([1-9][\\d]*(.[\\d]*)?)|(0\\.[\\d]+)$";
    public static final String REGEX_MAX_PEOPLE = "^([1-9]|1[0-9])$";
    public static final String REGEX_NUMBER_OF_FLOORS = "^[1-9][\\d]*$";
    public static final String REGEX_RENTAL_TYPE = "^[A-Za-z]*$";
}
