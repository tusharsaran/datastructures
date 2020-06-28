<h2> Tree </h2>

<p> Till now we have looked into Linear Datastructure that is Datastructre in which data are stored in a sequential manner, it has logical start and a logical end, and each data has a previous or next element.</p>

Linear Data structure are:

- Array
- Linked List
- Stack
- Queue


Now we will look into a different datastructure called <b> `Tree` </b>.
<p>We use Tree Data structure in our day to day life. There are so many examples where we use tree data structure.
Lets see oe of the example here: </p>

<b> Let's say we are planning to buy a Computer device for mailing.. </b>
<br><br>

![](images/real_world_tree_example.png)

<br>

OR another example is of folder structure in computer

![](images/real_world_tree_example_2.png)

<br> 
Some more examples of tree:

![](images/tree_example.png)

<br>

<b>Tree: </b>  

- In computer science, a tree is a widely used abstract data type that simulates a hierarchical tree structure, with a root value and subtrees of children with a   
  parent node, represented as a set of linked nodes.
- A tree is a nonlinear data structure, compared to arrays, linked lists, stacks and queues which are linear data structures. 
- A tree can be empty with no nodes or a tree is a structure consisting of one root and zero or one or more subtrees.

<br> <br>
<b>Properties of tree: </b>

- Represents data in hierachicalform 
- Each node consist of 2 elements (Data and reference of subtree node)
- It has a root node and 2 subtree called left tree and right tree



<br><br>
<h3>Need of Tree in Data structure</h3>

<p>IS Array or Linked List not sufficient for data stucture ?</p> 
<p> Why do we need a tree and what advantage it will give that the other data structure specially Array and Linked List does not have. To understand this lets see the time complexity and the space complecity of Array and Linked List : </p>
<br>

![](../TimeComplexity/images/TimeComplexity_Array&LinkedList.png)

<br>

<p>In array, If you notice the space efficiency is not good i.e once you created an array you cannot increase the array. For that you have to create a new array with extra space and copy the current array and place it in the new array which is a very costly operation.</p>
<p> Similarly in Linked List some of the operations like insertion, deletion, searching, traversing is a costly operation (Time Complexity is O(n))</p> 
  
  
Because of these issue we need a data structure that is time efficient and therefore we will see how Tree will address these issues.


<h3> Terminologies in Tree </h3>

<b>Before we get into tree and see some examples, we need to understand some important technologies in Tree. Let's understand does terminologies.</b>

Here we used an empty tree as an example to understand the terminologies.

<br>

![](images/tree_example2.png)

<br>

- <b><i>Node:</i></b> a tree consists of one or more than one node/nodes. Each node consist of data of any type String, char, number etc. and the address reference of the next node (left and right both).

<br>

![](images/tree_node.png)
 
 <br>
 
 - <b><i>root:</i></b> is a node that does not have a parent

<br>

![](images/tree_root.png)

<br>

- <b><i>leaf:</i></b> is a node does not has a child. In the below example all the nodes that are leaf are marked in black color.

<br>

![](images/tree_leaf.png)

<br>

- <b><i>link or edge :</i></b> each node is connected to other nodes using lik or edge. The arrows refer in the trees are nothing but link also known as edges.

<p> In tree we have N(muliple) nodes. `And each node has N - 1 edges`. That means 1 edge of a parent and N nodes for children. 
For eg. for node 5 has one edge of node 2(parent node) and two edges of 9 and 10 (children)

<br>

![](images/tree_linkoredges.png)

<br>

- <b><i>parent:</i></b> is a node that has children. Here in the above example root or 1 is the parent of 2 and 3. Similarly 2 is  the parent of 4,5, 6 node and 3 is the parent of node 7 and 8 an so on..

<br>

![](images/tree_root_children.png)

<br>

- <b><i>children:</i></b> is a node that are part of the nodes or has parent. In this example 2 and 3 is the parent of root. 4,5,6 is the children of 2 and so on..

<br>

![](images/tree_root_children.png)

<br>

- <b><i>sibling:</i></b> are nodes that are part of same parent. Like 2 and 3 are siblings as they are sharing the same parent i.e. node 1.

![](images/tree_siblings.png)

<br>

- <b><i>ancestors:</i></b> is node that is parent, grand parent, great grand parent of a particular node. For node 4 -  node 2  is the parent and node 1 is the grand parent

<br>

![](images/tree_siblings.png)

<br>

- <b><i>descendent:</i></b> is a nodes that is a  child, grand child, great grand child of a particular node. For example node 4 is a descendent of 2 and 1.

<br>

![](images/tree_siblings.png)

<br>

- <b><i>subtree:</i></b> each tree has subtrees. If you below example we have 2 big subtrees:
  
  - left subtree represented in red color consist of nodes 2,4,5,6,9,10 
  - right subtree represented in yellow color consist of nodes 3,7,8,11
  - 1 is the root node.
  
Similarly we have some more subtrees like for node 3 we have left subtree (node 7, 11) and right subtree (node 8)
<br>

![](images/tree_subtree.png)

<br>

- <b><i>Depth of node(x):</i></b> is the length from root to node x or we can also say the number of edges to root x. Let say we have to calculate the depth of node 5 then it is 2

![](images/tree_linkoredges.png)

<br>

- <b><i>Depth of root:</i></b> is always 0


<br>

![](images/tree_linkoredges.png)


<br>

- <b><i>Height of node(x):</i></b> is the number of edges in the longest path from node x to the the leaf.

For e.g. Height of 3 is 2 as 3 has two leaf 8 and 11 the longest path of leaf is 11. Therefore the height is 2 (due to 2 edges from 3 to 11)

<br>

![](images/tree_linkoredges.png)


<br>

- <b><i>Height of tree:</i></b> is the number of edges in the longest path from root to the the leaf.

For e.g. Height of 1 is 3  as 11 is the longest path and it has 3 edges.

<br>

![](images/tree_linkoredges.png)


<br><br>

<h3>Some of the applications where we use tree </h3>

- Storing data in heirarchical mannr-  like file system.
- Organize data for quick search, insertion or deletion  using Binary search trees as it uses Time complexity of O(log n)
- Special type of Tree called `Trie` used to store Dictionary, it is really fast and used for Dynamic spell checking.
- Network routing algorithm


<h2> Binary Tree</h2>

Trees that has zero, one or 2 nodes are known as Binary tree.

<br>
  
![](images/binary_tee.png)

<br>

      - If you see the above diagram root has 2 children also know as left child or right child.
      - Similary root children(both) has 2 children each.
      - Node in Orange color in the extreme left has one child only that is the right child. So 
      in the code we will add the reference for the left child as `NULL`. Similarly if you notice 
     - Node in Orange color in the extreme right also has one child that is the left child so for  
      right we will add the reference in node as null.
     - All the leaf nodes in black color consist of zero node.



<p> there are trees that are completely vased on Binary tree like:
  
  - Binary Search Tree
  - Heap Tree
  - AVL
  - Red-Black tree
  - Syntax tree
  - Huffman Coding tree
  etc...
  
<br>
<b>Why to learn Trees </b>

- It is a prerequisite for other trees like BST, AVL, Heap tree etc..
- Used for solving problems like
    - Huffman coding
    - Heap(priority Queue)
    - Expression parsing
    
 <br> <br>   
<h3> Types Of Binary Tree </h3>

- <b>Strict Binary Tree<b> : A tree in which the nodes consists of 2 children (left and right child) or none.
  
  <br>
  
![](images/strict_binary_tee.png)

<br>

- <b>Full Binary Tree<b> : A tree in which all the non leaf nodes consists of 2 nodes(right tree and left tree) and all the leaf node be at same level.
  
  <br>
  
![](images/full_binary_tee.png)


<br>

- <b>Complete Binary Tree<b> : A tree in which all the non leaf nodes consists of 2 nodes(right tree and left tree) and all the leaf node be at same level.
  
  <br>
  
![](images/full_binary_tee.png)
