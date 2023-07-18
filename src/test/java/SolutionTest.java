import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test Case 1
        int expected1 = 0;
        int actual1 = solution.sumOfMultiples(1);
        assertEquals(expected1, actual1);

        // Test Case 2
        int expected2 = 0;
        int actual2 = solution.sumOfMultiples(2);
        assertEquals(expected2, actual2);

        // Test Case 3
        int expected3 = 3;
        int actual3 = solution.sumOfMultiples(3);
        assertEquals(expected3, actual3);

        // Test Case 4
        int expected4 = 3;
        int actual4 = solution.sumOfMultiples(4);
        assertEquals(expected4, actual4);

        // Test Case 5
        int expected5 = 8;
        int actual5 = solution.sumOfMultiples(5);
        assertEquals(expected5, actual5);

        // Test Case 6
        int expected6 = 14;
        int actual6 = solution.sumOfMultiples(6);
        assertEquals(expected6, actual6);

        // Test Case 7
        int expected7 = 21;
        int actual7 = solution.sumOfMultiples(7);
        assertEquals(expected7, actual7);

        // Test Case 8
        int expected8 = 21;
        int actual8 = solution.sumOfMultiples(8);
        assertEquals(expected8, actual8);

        // Test Case 9
        int expected9 = 30;
        int actual9 = solution.sumOfMultiples(9);
        assertEquals(expected9, actual9);

        // Test Case 10
        int expected10 = 40;
        int actual10 = solution.sumOfMultiples(10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
