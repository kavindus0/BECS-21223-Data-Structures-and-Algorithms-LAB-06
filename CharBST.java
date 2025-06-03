
class CharBST {
    CharNode root;

    public void insert(char data) {
        root = insertRec(root, data);
    }

    private CharNode insertRec(CharNode node, char data) {
        if (node == null) return new CharNode(data);

        if (data < node.data)
            node.left = insertRec(node.left, data);
        else if (data > node.data)
            node.right = insertRec(node.right, data);

        return node;
    }

    public void preorder(CharNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(CharNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorder(CharNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
