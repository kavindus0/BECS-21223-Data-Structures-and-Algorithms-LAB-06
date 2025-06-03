

class StrBST {
    StrNode root;

    public void insert(String data) {
        root = insertRec(root, data);
    }

    private StrNode insertRec(StrNode node, String data) {
        if (node == null) return new StrNode(data);

        if (data.compareTo(node.data) < 0)
            node.left = insertRec(node.left, data);
        else if (data.compareTo(node.data) > 0)
            node.right = insertRec(node.right, data);

        return node;
    }

    public void preorder(StrNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(StrNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void postorder(StrNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
