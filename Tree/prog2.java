//Binary Tree

import java.util.Stack;

class prog2 {
  static class Pair {
    Node e;
    int state = 1;

    Pair(Node e) {
      this.e = e;
    }
  }

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  // Size of binary tree - way 1
  static int findSize1(Node root, int k) {
    if (root == null) {
      return k;
    }
    k++;
    k = findSize1(root.left, k);
    k = findSize1(root.right, k);
    return k;
  }

  // Size of binary tree
  static int findSize2(Node root) {
    if (root == null) {
      return 0;
    }
    int k = 1;
    k += findSize2(root.left);
    k += findSize2(root.right);
    return k;
  }

  // Sum of binary tree
  static int sumOfTree(Node root) {
    if (root == null) {
      return 0;
    }
    int sum = root.data;
    sum += sumOfTree(root.left);
    sum += sumOfTree(root.right);
    return sum;
  }

  // Max in a binary tree
  static int maxDataInTree(Node root) {
    if (root == null) {
      return Integer.MIN_VALUE;
    }
    int max = root.data;
    max = Math.max(maxDataInTree(root.left), max);
    max = Math.max(maxDataInTree(root.right), max);
    return max;
  }

  // Height of binary tree
  static int heightOfBinaryTree(Node root) {
    if (root == null) {
      return -1;
    }
    int leftSideHeight = 1;
    int rightSideHeight = 1;
    leftSideHeight += heightOfBinaryTree(root.left);
    rightSideHeight += heightOfBinaryTree(root.right);
    return Math.max(leftSideHeight, rightSideHeight);
  }

  // Preorder traversal
  static void preOrderPrint(Node root) {
    if (root == null) {
      System.out.print("null ");
      return;
    }
    System.out.print(root.data + " ");
    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }

  // Inorder traversal
  static void inOrderPrint(Node root) {
    if (root == null) {
      System.out.print("null ");
      return;
    }
    inOrderPrint(root.left);
    System.out.print(root.data + " ");
    inOrderPrint(root.right);
  }

  // Postorder traversal
  static void postOrderPrint(Node root) {
    if (root == null) {
      System.out.print("null ");
      return;
    }
    postOrderPrint(root.left);
    postOrderPrint(root.right);
    System.out.print(root.data + " ");
  }

  // zig zag traversal

  // Printing tree (subtree wise)
  static void printTree(Node root) {
    if (root == null) {
      return;
    }
    StringBuilder sb = new StringBuilder("");

    if (root.left != null) {
      sb.append(root.left.data);
    } else {
      sb.append(".");
    }

    sb.append(" <- " + root.data + " -> ");

    if (root.right != null) {
      sb.append(root.right.data);
    } else {
      sb.append(".");
    }

    System.out.println(sb);
    printTree(root.left);
    printTree(root.right);
  }

  // Constructing tree
  static Node generateTree(Integer[] arr) {
    Node root = new Node(arr[0]);
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(root));
    int i = 1;
    while (!st.isEmpty()) {
      if (i < arr.length) {
        if (arr[i] != null) {
          Node newNode = new Node(arr[i]);
          if (st.peek().state == 1) {
            st.peek().e.left = newNode;
          } else if (st.peek().state == 2) {
            st.peek().e.right = newNode;
          }
          st.peek().state++;
          st.push(new Pair(newNode));
        } else {
          st.peek().state++;
        }
      }
      while (st.size() > 0 && st.peek().state == 3) {
        st.pop();
      }
      i++;
    }
    return root;
  }

  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 4, null, null, 5, null, null, 3, null, 6, null, null };
    Node root = generateTree(arr); // Question - 1
    printTree(root); // Question - 2
    System.out.println("Size of binary tree - way 1: " + findSize1(root, 0)); // Question - 3
    System.out.println("Size of binary tree - way 2: " + findSize2(root));
    System.out.println("Sum of binary tree : " + sumOfTree(root)); // Question - 4
    System.out.println();
    System.out.println("Max data in tree : " + maxDataInTree(root)); // Question - 5
    System.out.println("Height of tree : " + heightOfBinaryTree(root)); // Question - 6
    preOrderPrint(root); // Question - 7
    inOrderPrint(root); // Question - 7
    postOrderPrint(root); // Question - 8
  }
}