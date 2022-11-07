import java.util.Scanner;
import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(String i : input){
            nums.add(Integer.parseInt(i));
        }

        tree t = new tree(nums.get(0));

        for(int i = 1; i < nums.size(); i++){
            // add n to the tree
            Node n = new Node(nums.get(i));
            placeNode(t, n);
        }
        System.out.println(t.maxHeight);
    }
    public static void placeNode(tree t, Node n){
        Node curr = t.root;
        int height = 0;
        while(true){
            height++;
            //go right in the tree
            if(n.num < curr.num){
                if(curr.left != null){
                    curr = curr.left; // curr.left == null
                }else{
                    curr.left = n;
                    break;
                }
                
            }else if(n.num > curr.num){
                if(curr.right != null){
                    curr = curr.right; // curr.left == null
                }else{
                    curr.right = n;
                    break;
                }
                
            }else if(n.num == curr.num){
                if(curr.mid != null){
                    curr = curr.mid; // curr.left == null
                }else{
                    curr.mid = n;
                    break;
                }
                
            }
            if(height > t.maxHeight){
                t.maxHeight = height;
            }
        }
        
    }
}

class tree{
    Node root;
    int maxHeight;
    tree(int num){
        root = new Node(num);
        maxHeight = 0;
    }
    
}
class Node{
    Node right;
    Node left;
    Node mid;
    int num;

    Node(int num){
        this.num = num;
    }    
}
