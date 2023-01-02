package caseStudy.Utils;

public class Regex {
    private static final String REGEX_VILLA_NAME = "^(SVVL)[-][0-9]{4}$";
    private static final String REGEX_ROOM_NAME = "^(SVRO)[-][0-9]{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Za-z]*$";
    private static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})[m][2]$";
    private static final String REGEX_RENTAL_COSTS = "^([1-9][\\d]*(.[\\d]*)?)|(0\\.[\\d]+)$";
    private static final String REGEX_MAX_PEOPLE = "^([1-9]|1[0-9])$";
    private static final String REGEX_NUMBER_OF_FLOORS = "^[1-9][\\d]*$";
    private static final String REGEX_RENTAL_TYPE = "^[A-Za-z]*$";

    public static boolean checkVillaName(String string) {
        return string.matches(REGEX_VILLA_NAME);
    }

    public static boolean checkRoomName(String string) {
        return string.matches(REGEX_ROOM_NAME);
    }

    public static boolean checkServiceName(String string) {
        return string.matches(REGEX_NAME_SERVICE);
    }

    public static boolean checkArea(String string) {
        return string.matches(REGEX_AREA);
    }

    public static boolean checkRentalCosts(String string) {
        return string.matches(REGEX_RENTAL_COSTS);
    }

    public static boolean checkMaxPeople(String string) {
        return string.matches(REGEX_MAX_PEOPLE);
    }

    public static boolean checkNumberOfFloors(String string) {
        return string.matches(REGEX_NUMBER_OF_FLOORS);
    }

    public static boolean checkRentalType(String string) {
        return string.matches(REGEX_RENTAL_TYPE);
    }
}
