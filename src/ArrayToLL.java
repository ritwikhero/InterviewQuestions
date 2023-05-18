public class ArrayToLL {
//    static Node root;

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 3, 3, 3, 2, 2, 2, 2, 2, 5, 5, 5, 5, 100, 100, 100, 5};
        int n = arr.length;
        Node ll = convertArrayToLL(arr, n);

        Node curr =ll;

        while(curr != null){
            System.out.print("|"+curr.data+" -> (count) "+ curr.count+ "| ->");
            curr = curr.next;
        }

    }

    public static Node convertArrayToLL(int[] arr, int n){
        if(arr == null || n == 0){
            return null;
        }

        Node head = new Node(arr[0],1);
        Node current = head;
        for(int i = 1; i < n; i++){
            if(arr[i] == current.data){
                current.count++;
            }
            else{
                Node newNode = new Node(arr[i],1);
                current.next = newNode;
                current = newNode;
            }
        }
        return head;
    }
}
class Node{
    int data;
    int count;
    Node next;

    Node(int data, int count){
        this.data = data;
        this.count = count;
        this.next = null;
    }
}