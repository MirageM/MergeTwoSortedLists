public class MergeTwoListsRedo2{
	public ListNode mergeTwoLists(ListNode list1, ListNode list2){
		if(list1 != null && list2 != null){
			if(list1.val < list2.val){
				list1.next = mergeTwoLists(list1.next, list2);
			}
			else{
				list2.next = mergeTwoLists(list1, list2.next);
			}
		}
		if(list1 == null){
			return list2;
		}
		else{
			return list1;
		}
	}
}