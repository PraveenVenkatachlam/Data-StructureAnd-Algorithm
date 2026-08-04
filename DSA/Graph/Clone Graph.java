// ! 133. Clone Graph
//? TC O(V + E);
//?SC O(V)

class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
         if (node == null)
                return null;
        Node newNode = new Node(node.val);
        map.put(node, newNode);

        for (Node neighbor:node.neighbors) {
           
            if (map.containsKey(neighbor))
                newNode.neighbors.add(map.get(neighbor));
            else
                newNode.neighbors.add(cloneGraph(neighbor));

        }
        return newNode;
    }
}