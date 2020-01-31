import org.junit.Test;

import static org.junit.Assert.*;

public class TableauTest {

    @Test
    public void trierCroissantSSS() {
        int[] tab = {1,5,8,3,9,4};
        int[] expectedtab={1,3,4,5,8,9};

        Tableau.trierCroissantSSS(tab);

        assertArrayEquals(expectedtab,tab);
    }

    @Test
    public void decroissantSSS() {
        int[] tab = {1,5,8,3,9,4,2,6,7};
        int[] expectedtab={9,8,7,6,5,4,3,2,1};

        Tableau.DecroissantSSS(tab);

        assertArrayEquals(expectedtab,tab);
    }

    @Test
    public void print() {
    }

    @Test
    public void maximum() {
        //oracle1: max fin
        int[] tab = {5,6,9,2,7,10};
        int expectedResult = 10;
        int result = Tableau.maximum(tab);
        assertEquals(expectedResult, result);

        //oracle1: max début
         tab[0] = 55;
         expectedResult = 55;
         result = Tableau.maximum(tab);
        assertEquals(expectedResult, result);

        //oracle1: max millieu
        tab[tab.length % 2] = 100;
        expectedResult = 100;
        result = Tableau.maximum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void minimum() {
        //oracle1: max fin
        int[] tab = {15,16,19,12,17,10};
        int expectedResult = 10;
        int result = Tableau.minimum(tab);
        assertEquals(expectedResult, result);

        //oracle1: max début
        tab[0] = 5;
        expectedResult = 5;
        result = Tableau.minimum(tab);
        assertEquals(expectedResult, result);

        //oracle1: max millieu
        tab[tab.length % 2] = 1;
        expectedResult = 1;
        result = Tableau.minimum(tab);
        assertEquals(expectedResult, result);
    }

    @Test
    public void moyenne() {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        double expectedResult = 5.5;
        double result = Tableau.moyenne(tab);
        assertEquals(expectedResult,result,0);
    }

    @Test
    public void fouilleseq() {
        int[] tab = {1,3,5,2,7,9};
        int num = 5;
        int expectedResult = 2;
        int result = Tableau.fouilleseq(tab,num);
        assertEquals(expectedResult,result);
    }

    @Test
    public void trierDecroissantSSS() {
    }

    @Test
    public void testPrint() {
    }

    @Test
    public void testMaximum() {
    }

    @Test
    public void testMinimum() {
    }

    @Test
    public void testMoyenne() {
    }

    @Test
    public void testFouilleseq() {
    }
}