package linklist;

public class Node {
	private Integer value;
    Node left,right,down;

    public Node(int val) {
        this.setValue(val);
        this.left = null;
        this.down = null;
        this.right = null;
    }

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
