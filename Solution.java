public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        HashMap<ListNode,Integer>mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return true;
            }
            mp.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
}