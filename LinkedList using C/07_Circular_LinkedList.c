// Circular Linked List and its operations.

#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

// Fuction for Traversal of circular Linked List.
void traversal(struct Node *head)
{
    struct Node *ptr = head;
    while (ptr->next != head)
    {
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
    printf("%d\n", ptr->data);
}

// function for counting number of nodes
int countNodes(struct Node *head)
{
    struct Node *ptr = head;
    int count = 1;
    while (ptr->next != head)
    {
        ptr = ptr->next;
        count++;
    }
    return count;
}

// Fucntion for insertion of nodes in a circular linked list.
struct Node *insertionInCLL(struct Node *head, int position, int data)
{
    if (position == 0)
    {
        struct Node *ptr = head;
        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = data;
        while (ptr->next != head)
        {
            ptr = ptr->next;
        }
        ptr->next = newNode;
        newNode->next = head;
        return newNode;
    }
    else if (position == (countNodes(head) + 1))
    {
        struct Node *ptr = head;
        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = data;
        while (ptr->next != head)
        {
            ptr = ptr->next;
        }
        ptr->next = newNode;
        newNode->next = head;
        return head;
    }
    else
    {
        struct Node *p = head, *q = head->next;
        struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = data;
        for (int i = 0; i < position - 1; i++)
        {
            p = p->next;
            q = q->next;
        }
        p->next = newNode;
        newNode->next = q;
        return head;
    }
}

// Deletion of Node in a circular Linked List
struct Node *deletionInCLL(struct Node *head, int position)
{
    if (position == 0)
    {
        struct Node *p = head, *q = head;
        while (p->next != head)
        {
            p = p->next;
        }
        p->next = q->next;
        q->next = NULL;
        free(q);
        return p->next;
    }
    else if (position == (countNodes(head) - 1))
    {
        struct Node *p = head, *q = head->next;
        while (q->next != head)
        {
            p = p->next;
            q = q->next;
        }
        p->next = head;
        free(q);
        return head;
    }else{
        struct Node *p = head, *q = head->next;
        for (int i = 0; i < position - 1; i++){
            p = p->next;
            q = q->next;
        }
        p->next = q->next;
        q->next = NULL;
        free(q);
        return head;
    }
}

// searching in a Circular linked list.
int searchInCLL(struct Node * head, int key){
    struct Node *ptr = head;
    for (int i = 0; i <= countNodes(head); i++){
        if(ptr->data == key){
            return 1;
            break;
        }
        ptr = ptr->next;
    }
    return -1;
}


void main()
{
    struct Node *head, *second, *third, *fourth;
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = fourth;

    fourth->data = 40;
    fourth->next = head;

    // Function call
    head = insertionInCLL(head,0,455);
    printf("%d\n", searchInCLL(head, 455));
    traversal(head);
}
