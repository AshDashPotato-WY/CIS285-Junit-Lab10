package cis285JunitLab10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testSelectionSortTest {

	// 4 tests
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
	
	// testing a list of positive integers
	public void testPositive(){
        
        /** add tests to check for this unit test **/
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
        
        
        int[] outputs = new int[5];
        outputs = test.basicSelectionSort(arr);
        System.out.println(Arrays.toString(outputs));
        System.out.println(Arrays.toString(Sortedarr));
        
        assertEquals(Arrays.toString(outputs), Arrays.toString(Sortedarr));

    }
	
	// testing a list of negative integers
	public void testNegative(){
        
        /** Test data contains negative values only **/
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        int[] outputs = new int[5];
        outputs = test.basicSelectionSort(arr);
        System.out.println(Arrays.toString(outputs));
        System.out.println(Arrays.toString(Sortedarr));
        
        assertEquals(Arrays.toString(outputs), Arrays.toString(Sortedarr));
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
        
        assertEquals(Arrays.toString(Sortedarr), Arrays.toString(outputs));
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    	int[] arr1 = new int[5];
        arr1[0] = -8;
        arr1[1] = -9;
        arr1[2] = -8;
        arr1[3] = -10;
        arr1[4] = -2;
        
        int[] Sortedarr1 = new int[5];
        Sortedarr1[0] = -10;
        Sortedarr1[1] = -9;
        Sortedarr1[2] = -8;
        Sortedarr1[3] = -8;
        Sortedarr1[4] = -2;
        
        int[] arr2 = new int[5];
        arr2[0] = 2;
        arr2[1] = 6;
        arr2[2] = 4;
        arr2[3] = 4;
        arr2[4] = 1;
        
        int[] Sortedarr2 = new int[5];
        Sortedarr2[0] = 1;
        Sortedarr2[1] = 2;
        Sortedarr2[2] = 4;
        Sortedarr2[3] = 4;
        Sortedarr2[4] = 6;
        
        // test all negative numbers with duplicates
        int[] outputs1 = new int[5];
        outputs1 = test.basicSelectionSort(arr1);
        
        System.out.println(Arrays.toString(outputs1));
        System.out.println(Arrays.toString(Sortedarr1));
        
        assertEquals(Arrays.toString(Sortedarr1), Arrays.toString(outputs1));
        
        // test all positive numbers with duplicates
        int[] outputs2 = new int[5];
        outputs2 = test.basicSelectionSort(arr2);
        
        System.out.println(Arrays.toString(outputs2));
        System.out.println(Arrays.toString(Sortedarr2));
        
        assertEquals(Arrays.toString(Sortedarr2), Arrays.toString(outputs2));
        
        
    }


}
