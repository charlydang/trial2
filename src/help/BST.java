package help;

class BST 
{
  BTNode root;
  static int successor, predecessor;
  
  public BST() // No Arg Constructor
  {
    root = null; 
  }
  public void preOrder() // pre-order traversal
  {
	preOrder(root);
  }
  private void preOrder(BTNode n) // returns pre-order traversal recursively
  {
	if (n != null)
	{
	  System.out.print(n.getData() + " ");
	  preOrder(n.getLeft());
	  preOrder(n.getRight());
	}
  }
  public void inOrder() // in-order traversal
  {
	inOrder(root);
  }
  private void inOrder(BTNode n) // returns in-order traversal recursively
  {
	if (n != null)
	{
	  inOrder(n.getLeft());
	  System.out.print(n.getData() + " ");
	  inOrder(n.getRight());
	}
  }
  public void postOrder() // pre-order traversal
  {
	postOrder(root);
  }
  private void postOrder(BTNode n) // returns post-order traversal recursively
  {
    if (n != null)
    {
      postOrder(n.getLeft());
      postOrder(n.getRight());
      System.out.print(n.getData() + " ");
    }
  }
  public boolean isEmpty() // checks if tree is empty
  {
	return root == null;
  }
  public boolean find(int v) // searches for value
  {
	return find(root, v);
  }
  public boolean find(BTNode n, int v) // searches for value recursively
  {
	boolean there = false;
	while ((n != null) && !there)
	{
      int value = n.getData();
      if (v < value)
      {
    	n = n.getLeft();
      }
      else if (v > value)
      {
    	n = n.getRight();
      }
      else
      {
    	there = true;
    	break;
      }
      there = find(n, v);
	}
	return there;
  }
  public void add(int newData) // adds data
  {
	if (find(newData) == true)
	{
	  System.out.println(newData + " already exists, ignore.");
	}
	else
	{
		root = add(root, newData);
		System.out.print("\nIn-order: ");
	}
  }
  private BTNode add(BTNode node, int newData) // adds data recursively 
  {
	if (node == null)
		node = new BTNode(newData);
	else
	{
	  if (newData <= node.getData())
	  {
		node.left = add(node.left, newData);
	  }
	  else
	  {
		node.right = add(node.right, newData);
	  }
	}
	return node;
  }
  public void delete(int v) // removes data
  {
	if (isEmpty())
	{
	  System.out.println("Tree is empty. Please insert values.");
	}
	else if (find(v) == false)
    {
      System.out.println(v + " doesn't exist!");
    }
    else
    {
      root = delete(root, v);
      System.out.print("\nIn-order: ");
    }
  }
  private BTNode delete(BTNode root, int v)
  {
	BTNode a1, a2, n;
	if (root.getData() == v)
	{
	  BTNode lt, rt;
	  lt = root.getLeft();
	  rt = root.getRight();
	  if (lt == null && rt == null)
	  {
		return null;
	  }
	  else if (lt == null)
	  {
		a1 = rt;
		return a1;
	  }
	  else if (rt == null)
	  {
		a1 = lt;
		return a1;
	  }
	  else
	  {
		a2 = rt;
		a1 = rt;
		while (a1.getLeft() != null)
		{
		  a1 = a1.getLeft();
		}
		a1.setLeft(lt);
		return a2;
	  }
	}
	if (v < root.getData())
	{
      n = delete(root.getLeft(), v);
      root.setLeft(n);
	}
	else
	{
	  n = delete(root.getRight(), v);
	  root.setRight(n);
	}
	return root;
  }
  public static BTNode minimum(BTNode root)
  {
	if (root == null)
	{
		return null;
	}
	if (root.getLeft() != null)
	{
	  return minimum(root.getLeft());
	}
	return root;
  }
  public static BTNode successor(BTNode node)
  {
	if (node == null)
	{
	  return null;
	}
	if (node.getRight() != null)
	{
	  return minimum(node.getRight());
	}
	BTNode q = node.getParent();
	BTNode r = node;
	while(q != null && r == q.getRight())
	{
      r = q;
      q = q.getParent();
	}
	return q;
  }
  public static BTNode maximum(BTNode root)
  {
    if (root == null)
    {
      return null;
    }
    if (root.getRight() != null)
    {
      return maximum(root.getRight());
    }
    return root;
  }
  public static BTNode predecessor(BTNode node)
  {
	if (node == null)
	{
	  return null;
	}
	if (node.getLeft() != null)
	{
	  return maximum(node.getLeft());
	}
	BTNode q = node.getParent();
	BTNode r = node;
	while (q != null && r == q.getLeft())
	{
	  r = q;
	  q = q.getParent();
	}
	return q;
  }
}
