public class TraversalPractice {
  
  /**
   * Prints the odd values of the nodes in a tree.
   * Each value is printed on a separate line.
   * The nodes are traversed post-order.
   * 
   * @param node The root of the tree to print
   */
  public static void printOddNodes(Node<Integer> node) {

  }

  /**
   * Prints the values of the nodes that have exactly one child in a tree.
   * Each value is printed on a separate line.
   * The nodes are traversed pre-order.
   * 
   * @param <T> The type of value the nodes hold
   * @param node The root of the tree to print
   */
  public static <T> void printNodesWithOneChild(Node<T> node) {
    
  }

    /**
   * Returns the sum of the values of all nodes in a tree.
   * Edge Case:
   *   Returns 0 if node is null
   *  
   * @param node The root of the tree
   * @return the sum 
   */
  public static int treeSum(Node<Integer> node) {
    if(node == null)
    {
      return 0;
    }
    else
    {
      int leftTreeSum = treeSum(node.left);
      int rightTreeSum = treeSum(node.right);
      return leftTreeSum + rightTreeSum;
    }
  }

  /**
   * Returns the maximum value stored in a tree.
   * Assumes all values are positive.
   * Edge case:
   *   Returns 0 if node is null.
   * 
   * @param node The root of the tree
   * @return the max value
   */
  public static int maxVal(Node<Integer> node) {

  if (node == null) {
    return 0; //edge case 1
  } //end if
      
    int leftMaxNode = maxVal(node.left);
    int rightMaxNode = maxVal(node.right);
    return Math.max(node.value, Math.max(leftMaxNode, rightMaxNode));
  
  }//end maxVal

  /**
   * Returns the number of levels in the tree.
   * Edge cases:
   *   Returns 0 if node is null, returns 1 if there is only a root with no children.
   * 
   * @param <T> The type of value the nodes hold
   * @param node The root of the tree
   * @return The number of levels in the tree
   */
  public static <T> int numLevels(Node<T> node) {

  if (node == null) {
          return 0; //edge case 1
  }//end if
    int leftNode = numLevels(node.left);
    int rightNode = numLevels(node.right);
    return 1 + Math.max(leftNode, rightNode); //edge case 2- the +1 ensures that if the nodes are 0/null, it will still return 1

  }//end num levels

  public static void main(String[] args) {
    /*
     *         99
     *       /    \
     *     45      82
     *    /  \        \
     *   9   5       16
     */

     // Replace the below line to create a tree 
     // as represented in the diagram above
Node<Integer> smallTree = new Node<>(99, //root
     new Node<>(45, //left top node
         new Node<>(9, null, null),  // 9 left bottom node (45)
         new Node<>(5, null, null)   // 5 right bottom node (45)
), //end 45 branch
     new Node<>(82, //right top node
                            null, // 82 has no left bottom node
         new Node<>(16, null, null) // 16 is right bottom node (82)
     ) //end 82 branch

 ); //end small tree

    /*
     *              42
     *          /       \
     *       17           63
     *      /  \            \
     *     9    21           87
     *    /    /  \          /
     *   3    19   25     76
    */

    Node<Integer> largeTree = new Node<>(42,
        new Node<>(17, // 17 is left child of 42
                new Node<>(9, // 9 is the left child of 17
                        new Node<>(3, null, null), // 3 is the left child of 9
                        null), // no right child of 9
                new Node<>(21, // 21 is the right child of 17
                        new Node<>(19, null, null), // 19 is the left child of 21
                        new Node<>(25, null, null))), // 25 is the right child of 21
        new Node<>(63, // 63 is right child of 42
                null, // no left child of 63
                new Node<>(87, // 87 is right child of 63
                        new Node<>(76, null, null), // 76 is the left child of 87
                        null))); // no right child of 87
  }
}