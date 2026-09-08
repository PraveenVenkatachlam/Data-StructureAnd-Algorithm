
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<treeNode>queue=new LinkedList<>();
        StringBuilder sb=new  StringBuilder();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node =queue.poll();
            if(node==null){
                sb.apped("#,");
                continue;
            }
            sb.append(node.val+"");
            sb.append(node.left);
            sb.append(node.right);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if(data==null) return null;
       Queue<treeNode>queue=new LinkedList<>();
       String[] value= data.split(",");
       TreeNode root =new TreeNode(Integer.parsInt(value[0]));
       queue.add(root);
       for(int i=1,i<value.length;i++){
        TreeNode curr=queue.poll();
        if(!value)
       }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));