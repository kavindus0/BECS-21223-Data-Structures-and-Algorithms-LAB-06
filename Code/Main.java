
public class Main {
    public static void main(String[] args) {

        int[] seq1 = {69, 25, 62, 88, 10, 37, 99};
        IntBST bst1 = new IntBST();
        for (int num : seq1) bst1.insert(num);
        System.out.println("Sequence i:");
        System.out.print("Preorder: ");
        bst1.preorder(bst1.root); System.out.println();
        System.out.print("Inorder: ");
        bst1.inorder(bst1.root); System.out.println();
        System.out.print("Postorder: ");
        bst1.postorder(bst1.root); System.out.println("\n");

        int[] seq2 = {32, 24, 6, 2, 39, 41, 30, 145};
        IntBST bst2 = new IntBST();
        for (int num : seq2) bst2.insert(num);
        System.out.println("Sequence ii:");
        System.out.print("Preorder: ");
        bst2.preorder(bst2.root); System.out.println();
        System.out.print("Inorder: ");
        bst2.inorder(bst2.root); System.out.println();
        System.out.print("Postorder: ");
        bst2.postorder(bst2.root); System.out.println("\n");

        int[] seq3 = {120, 46, 7, 2, 31, 39, 23, 40};
        IntBST bst3 = new IntBST();
        for (int num : seq3) bst3.insert(num);
        System.out.println("Sequence iii:");
        System.out.print("Preorder: ");
        bst3.preorder(bst3.root); System.out.println();
        System.out.print("Inorder: ");
        bst3.inorder(bst3.root); System.out.println();
        System.out.print("Postorder: ");
        bst3.postorder(bst3.root); System.out.println("\n");

        char[] seq4 = {'S', 'K', 'R', 'B', 'C', 'M', 'W', 'A', 'Z', 'X', 'D'};
        CharBST bst4 = new CharBST();
        for (char ch : seq4) bst4.insert(ch);
        System.out.println("Sequence iv:");
        System.out.print("Preorder: ");
        bst4.preorder(bst4.root); System.out.println();
        System.out.print("Inorder: ");
        bst4.inorder(bst4.root); System.out.println();
        System.out.print("Postorder: ");
        bst4.postorder(bst4.root); System.out.println("\n");

        String[] seq5 = {"Mary", "Tom", "Bob", "Wily", "John", "Mike", "Harry", "Kate", "Sam", "Sue"};
        StrBST bst5 = new StrBST();
        for (String str : seq5) bst5.insert(str);
        System.out.println("Sequence v:");
        System.out.print("Preorder: ");
        bst5.preorder(bst5.root); System.out.println();
        System.out.print("Inorder: ");
        bst5.inorder(bst5.root); System.out.println();
        System.out.print("Postorder: ");
        bst5.postorder(bst5.root); System.out.println();
    }
}
