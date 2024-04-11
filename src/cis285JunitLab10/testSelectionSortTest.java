package cis285JunitLab10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testSelectionSortTest {

	private SelectionSort test = new SelectionSort();
	@Test
	public void test() {
		// fail("Not yet implemented");
		
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();

	}
	
	public testSelectionSortTest() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 0;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 10;
        
        int[] outputs = new int[5];
        outputs = test.basicSelectionSort(arr);
        
        System.out.println(Arrays.toString(outputs));
        System.out.println(Arrays.toString(Sortedarr));
        
        assertEquals(Arrays.toString(outputs), Arrays.toString(Sortedarr));
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    }


}
