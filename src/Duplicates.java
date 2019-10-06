
/**
 * @author Adam Kujan
 */

public class Duplicates {



    public static int findMostFrequentDuplicateValue(int[] values)
    {
        if (values.length == 0)
        {
            return -1;
        }

        int currentValue = -1;
        int currentCount = 0;
        int resultValue = -1;
        int resultCount = 0;

        for (int value : values)
        {
            if (currentValue == value)
            {
                currentCount++;

                if (currentCount > resultCount)
                {
                    resultValue = value;
                    resultCount = currentCount;
                }
            } else
            {
                currentValue = value;
                currentCount = 1;
            }
        }

        if (resultCount == 1)
        {
            return -1;
        }

        return resultValue;
    }

}
