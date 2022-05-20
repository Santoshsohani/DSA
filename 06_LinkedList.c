// Deletion in an linked List.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

// function for Traversal in a Linked List.
void traversalLinkedList(struct Node *pointer)
{
    while (pointer != NULL)
    {
        printf("%d\n", pointer->data);
        pointer = pointer->next;
    }
}

// function to count Number of Nodes.
int countNodes(struct Node *ptr)
{
    int count = 1;
    while (ptr->next != NULL)
    {
        ptr = ptr->next;
        count++;
    }
    return count;
}

// function for Deletion of first node.
struct Node *deletionOfFirstNode(struct Node *head)
{
    struct Node *ptr = head;
    head = head->next;
    ptr->next = NULL;
    free(ptr);
    return head;
}

// fuction for deletion of last node.
void deleteLastNode(struct Node* head){
    struct Node *p = head, *q = head->next;
    while(q->next != NULL){
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
}

// fuction to delete Between nodes.
// Index for the Linked List is considered from 0
void deleteBetween(struct Node * head,int position){
    struct Node *p = head, *q = head->next;
    for (int i = 1; i < position-1; i++){
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    q->next = NULL;
    free(q);
}


int main()
{
    struct Node *head, *second, *third, *fourth;

    // Creation of Nodes
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    // Insertion of values and pointing to next node
    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = fourth;

    fourth->data = 40;
    fourth->next = NULL;

    traversalLinkedList(head);
    deleteBetween(head, 3);
    printf("\n");
    traversalLinkedList(head);
    return 0;
}