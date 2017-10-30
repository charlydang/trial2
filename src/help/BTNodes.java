package help;

class BTNode 
{
	int data;
	BTNode left, right, parent;

	public BTNode() // No-Arg Constructor
	{
	  left = null;
	  right = null;
	  data = 0;
	}
    public BTNode(int n) // Overload Constructor
	{
	  left = null;
	  right = null;
	  data = n;
	}
	public int getData() // Returns data
	{
	  return data;
	}
	public BTNode getLeft()  // Returns left node
	{
	  return left;
	}
	public BTNode getRight() // Returns right node
	{
	  return right;
	}
	public BTNode getParent() // Returns parent
	{
	  return parent;
	}
	public void setData(int newData) // Sets data to node
	{
	  data = newData;
	}
	public void setLeft(BTNode newLeft) // Sets left node
	{
	  left = newLeft;
	}
	public void setRight(BTNode newRight) // Sets right node
	{
	  right = newRight;
	}
}
