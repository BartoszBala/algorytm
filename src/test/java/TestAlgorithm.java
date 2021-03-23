import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAlgorithm {


  @Test
  public void TestAlgorithmFindMaxSumNumberNotNeigbours(){

    List<Integer> list1 = Arrays.asList(5);
    List<Integer> list2 = Arrays.asList(5,12);
    List<Integer> list3 = Arrays.asList(1,0);
    List<Integer> list4 = Arrays.asList(1,1);
    List<Integer> list5 = Arrays.asList(5,5,5);
    List<Integer> list6 = Arrays.asList(26,9,9,13,17,8,25);
    List<Integer> list7= Arrays.asList(2500,9,9,13,17,8,25);
    List<Integer> list8 = Arrays.asList(5,99,5);
    List<Integer> list9 = Arrays.asList(200,200,200,200,200);
    List<Integer> list10 = Arrays.asList(0,0,0,0,0);
    List<Integer> list11 = Arrays.asList(0,0,1,4,0);
    List<Integer> list12 = Arrays.asList(500,500,1,499,500);
    List<Integer> list13 = Arrays.asList(5,50,1,0,24,0,65,12,45);
    List<Integer> list14 = Arrays.asList(0);
    List<Integer> list15 = new ArrayList<>();

    assertEquals(5, AlgMain.findMaxSumOfNonNeighborsNumber(list1));
    assertEquals(12, AlgMain.findMaxSumOfNonNeighborsNumber(list2));
    assertEquals(1, AlgMain.findMaxSumOfNonNeighborsNumber(list3));
    assertEquals(1, AlgMain.findMaxSumOfNonNeighborsNumber(list4));
    assertEquals(10, AlgMain.findMaxSumOfNonNeighborsNumber(list5));
    assertEquals(77, AlgMain.findMaxSumOfNonNeighborsNumber(list6));
    assertEquals(2551, AlgMain.findMaxSumOfNonNeighborsNumber(list7));
    assertEquals(99, AlgMain.findMaxSumOfNonNeighborsNumber(list8));
    assertEquals(600, AlgMain.findMaxSumOfNonNeighborsNumber(list9));
    assertEquals(0, AlgMain.findMaxSumOfNonNeighborsNumber(list10));
    assertEquals(4, AlgMain.findMaxSumOfNonNeighborsNumber(list11));
    assertEquals(1001, AlgMain.findMaxSumOfNonNeighborsNumber(list12));
    assertEquals(184, AlgMain.findMaxSumOfNonNeighborsNumber(list13));
    assertEquals(0, AlgMain.findMaxSumOfNonNeighborsNumber(list14));
    assertEquals(0, AlgMain.findMaxSumOfNonNeighborsNumber(list15));



  }




}
