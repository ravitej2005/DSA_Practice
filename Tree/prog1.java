import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
  int data;
  ArrayList<Node> children = new ArrayList<>();

  Node(int data) {
    this.data = data;
  }

  void addChildren(Node e) {
    this.children.add(e);
  }
}

class prog1 {
  // Size of the tree
  static int findSize(Node root, int size) {
    size++;
    for (Node e : root.children) {
      size = findSize(e, size);
    }
    return size;
  }

  // Finding max data from the tree (Solution1)
  static int findMaxData1(Node root, int max) {
    max = Math.max(max, root.data);
    for (Node e : root.children) {
      max = findMaxData1(e, max);
    }
    return max;
  }

  // Finding max data from the tree (Solution2)
  static int findMaxData2(Node root) {
    int max = root.data;
    for (Node e : root.children) {
      int childmax = findMaxData2(e);
      if (childmax > max) {
        max = childmax;
      }
    }
    return max;
  }

  // Finding height of the tree
  static int findHeight(Node root) {
    int height = -1;
    for (Node e : root.children) {
      int childrenHeight = findHeight(e);
      height = Math.max(height, childrenHeight);
    }
    return height + 1;
  }

  // Preorder Traversal
  static void preOrder(Node root) {
    System.out.print(root.data + " ");

    for (Node e : root.children) {
      preOrder(e);
    }
  }

  // Postorder Traversal
  static void postOrder(Node root) {
    for (Node e : root.children) {
      postOrder(e);
    }

    System.out.print(root.data + " ");
  }

  // Combined traversing
  static void combinedTraverse(Node root) {
    System.out.println("Node preorder " + root.data);
    for (Node e : root.children) {
      System.out.println("Edge preorder " + root.data + " => " + e.data);
      combinedTraverse(e);
      System.out.println("Edge postorder " + root.data + " => " + e.data);
    }
    System.out.println("Node postorder " + root.data);
  }

  // Level order traversal
  static void levelOrderTraveral(Node root) {
    Queue<Node> que = new LinkedList<>();
    que.add(root);
    while (!que.isEmpty()) {
      int i = 0;
      while (i < que.size()) {
        Node e = que.poll();
        System.out.print(e.data + " ");
        for (Node child : e.children) {
          que.add(child);
        }
        i++;
      }
    }
  }

  // Zig-zag level order printing
  static void zigZagLevelOrder(Node root) {
    Stack<Node> currentLevel = new Stack<>();
    Stack<Node> nextLevel = new Stack<>();
    boolean direction = true;
    currentLevel.push(root);
    while (!currentLevel.isEmpty()) {
      Node tmp = currentLevel.pop();
      System.out.print(tmp.data + " ");
      if (direction) {
        for (Node node : tmp.children) {
          nextLevel.push(node);
        }
      } else {
        for (int i = tmp.children.size() - 1; i >= 0; i--) {
          nextLevel.push(tmp.children.get(i));
        }
      }
      if (currentLevel.isEmpty()) {
        Stack<Node> temp = currentLevel;
        direction = !direction;
        currentLevel = nextLevel;
        nextLevel = temp;
        System.out.println();
      }
    }

  }

  // Reverse Arraylist
  static void reverseArrayList(ArrayList<Node> al) {
    int start = 0;
    int end = al.size() - 1;
    while (start < end) {
      Node temp = al.get(start);
      al.set(start, al.get(end));
      al.set(end, temp);
      start++;
      end--;
    }
  }

  // Mirror tree
  static void mirrorTree(Node root) {
    reverseArrayList(root.children);
    for (Node node : root.children) {
      mirrorTree(node);
    }
  }

  // Remove leaf node
  static void removeLeafNodes1(Node root) {
    ArrayList<Node> al = new ArrayList<>();
    for (Node eNode : root.children) {
      if (!eNode.children.isEmpty()) {
        al.add(eNode);
        removeLeafNodes1(eNode);
      }
    }
    root.children = al;
  }

  // Remove leaf node - 2nd way
  static void removeLeafNodes2(Node root) {
    for (int i = root.children.size() - 1; i >= 0; i--) {
      Node e = root.children.get(i);
      if (!e.children.isEmpty()) {
        removeLeafNodes2(e);
      } else {
        root.children.remove(e);
      }
    }
  }

  // Remove leaf node - 3rd way
  static void removeLeafNodes3(Node root) {
    for (int i = root.children.size() - 1; i >= 0; i--) {
      Node e = root.children.get(i);
      if (e.children.isEmpty()) {
        root.children.remove(e);
      }
    }
    for (Node eNode : root.children) {
      removeLeafNodes3(eNode);
    }
  }

  //Check if an element exists
  static boolean checkIfElementExists(Node root, int k){
    boolean ifExists = false;
    if (root.data == k) {
      return true;
    }
    for (Node eNode : root.children) {
      ifExists = checkIfElementExists(eNode,k);
      if (ifExists) {
        break;
      }
    }
    return ifExists;
  }

  // Node to root Path
  static String nodeToRoot(int k, Node root){
    String ans = "";
    if (root.data == k) {
      return ""+root.data+"";
    } 
    for (Node eNode : root.children) {
      String str = nodeToRoot(k, eNode);
      if(!str.isEmpty()){
        ans = root.data + "->" + str;
        break;
      }
    }
    return ans;
  }

  // Traversing and printing tree
  static void printTree(Node root) {
    StringBuilder sb = new StringBuilder("");
    sb.append(root.data);
    sb.append(" -> ");
    for (Node e : root.children) {
      sb.append(e.data);
      sb.append(" ");
    }
    System.out.println(sb);

    for (Node e : root.children) {
      printTree(e);
    }
  }

  // Creating tree
  static Node generateTree(int[] arr) {
    Node root = null;
    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (st.empty()) {
        root = new Node(arr[i]);
        st.add(root);
      } else {
        if (arr[i] == (-1)) {
          st.pop();
        } else {
          Node newNode = new Node(arr[i]);
          st.peek().addChildren(newNode);
          st.push(newNode);
        }
      }
    }
    return root;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, -1, 120, 60, -1, 70, -1, -1, 50, -1, -1, 80, 90, -1, 100, -1, -1, -1 };
    Node root = generateTree(arr);
    printTree(root);
    // System.out.println("Size of tree : "+findSize(root, 0));
    // System.out.println("Maximum data : "+findMaxData1(root, Integer.MIN_VALUE));
    // System.out.println("Maximum data : "+findMaxData2(root));
    // System.out.println("Height : "+findHeight(root));
    // System.out.print("Preorder Traversal => ");
    // preOrder(root);
    // System.out.println();
    // System.out.print("Postorder Traversal => ");
    // postOrder(root);
    // System.out.println();
    // System.out.println();
    // combinedTraverse(root);
    // levelOrderTraveral(root);
    // System.out.println("\nZig zag level order : ");
    // zigZagLevelOrder(root);

    // System.out.println("Mirroring tree");
    // mirrorTree(root);
    // printTree(root);

    // removeLeafNodes1(root);
    // removeLeafNodes2(root);
    // removeLeafNodes3(root);
    // printTree(root);

    // int k = 120;
    // System.out.println(checkIfElementExists(root, k));

    int k = 120;
    System.out.println(nodeToRoot(k, root));
  }
}