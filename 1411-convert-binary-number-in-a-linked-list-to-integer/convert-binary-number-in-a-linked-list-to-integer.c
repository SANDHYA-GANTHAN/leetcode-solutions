/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode *temp=NULL;
    int result=0;
    temp=head;
    while(temp!=NULL)
    {
        result=result*2+temp->val;
        temp=temp->next;
    }
    return result;
}