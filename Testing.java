public class Testing {

    public static void main(String[] args) {

        CuckooHashing Cuck1 = new CuckooHashing(new StringHashMethods());

        for (int i=0;i<31;i++) {
            Cuck1.insert(i + "");

            System.out.println(i+"-----\n"+Cuck1.toString());
        }
        Cuck1.remove("16");
        System.out.println("remove-----\n"+Cuck1.toString());
        Cuck1.undo();
        System.out.println("undo-----\n"+Cuck1.toString());
        //Cuck1.remove("16");
        //System.out.println("remove-----\n"+Cuck1.toString());
        Cuck1.undo();
        System.out.println("undo-----\n"+Cuck1.toString());

        /*BTree<Integer> tr = new BTree<>(3);
        int[] arr = {11, 12, 10, 13, 9, 14, 8, 15, 7, 16, 6, 17, 5, 18, 4, 19, 3, 20, 2, 21, 1, 22, 23};
        //for (int i=1;i<arr.length;i=i+1)
        //    tr.add(arr[i]);
        for (int i = 0; i < arr.length; i++)
            tr.insert2pass(arr[i]);
        System.out.println(tr.toString());

        tr.delete(23);
        System.out.println(tr.toString());

        tr.delete(5);
        System.out.println(tr.toString());

        tr.delete(8);
        System.out.println(tr.toString());

        tr.delete(4); //TODO: combined
        System.out.println(tr.toString());


        tr.delete(16);
        System.out.println(tr.toString());
        tr.delete(15);
        System.out.println(tr.toString());
*/
    }

}

