package step2;

import java.math.BigDecimal;

public class NumberUtil {

    public static BigDecimal textToBigDecimal(String text) {
        if (!isNumeric(text)) {
            throw new IllegalArgumentException();
        }
        return new BigDecimal(text);
    }

    private static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

}
