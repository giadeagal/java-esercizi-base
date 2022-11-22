public class ArrayTest {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        pop(list, 4);
    }

    public static int[] pop(int[] listToPop, int poppable) {
        //Creo nuovo array vuoto
        int[] poppedList = new int[listToPop.length-1];

        //Popolo il nuovo array
        for ( int i = 0; i < listToPop.length-1; i++) {
            if (i < poppable-1) {
                poppedList[i] = listToPop[i];
            } else if (i > poppable-1 && i != poppable-1) {
                poppedList[i] = listToPop[i];
            }
        }
        for(int i = 0; i< poppedList.length; i++) {
            System.out.println(poppedList[i]);
        }

        //Restituisco il nuovo array popolato
        return poppedList;
    }
}
