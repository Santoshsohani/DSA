// Doubly Linked List abd its operations.

#include <stdio.h>
#include <stdlib.h>

struct Node{
    struct Node *prev;
    struct Node *next;
    int data;
};

// Traversal in Double Linked List
void traversalInDLL(struct Node * head){
    struct Node *ptr = head;
    while(ptr->next != NULL){
        printf("%d\n", ptr->data);
        ptr = ptr->next;
    }
    printf("%d\n", ptr->data);
}

// Counting Number of Nodes in Double Linked List.
int countNodes(struct Node * head){
    struct Node *ptr = head;
    int count = 1;
    while(ptr->next != NULL){
        count++;
        ptr = ptr->next;
    }
    return count;
}

// Insertion in a Double Linked List.
struct Node * insertionInDLL(struct Node*head,int data, int position){
    if(position == 0){
        struct Node *newNode, *ptr = head;
        newNode = (struct Node *)malloc(sizeof(struct Node));
        ptr->prev = newNode;
        newNode->next = ptr;
        newNode->prev = NULL;
        newNode->data = data;
        return newNode;
    }else if(position == countNodes(head)+1){
        struct Node *ptr = head;
        struct Node* newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = data;
        while(ptr->next != NULL){
            ptr = ptr->next;
        }
        ptr->next = newNode;
        newNode->prev = ptr;
        newNode->next = NULL;
        return head;
    }else{
        struct Node *p = head, *q = head->next;
        struct Node* newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = data;
        for (int i = 0; i < position - 1; i++){
            p = p->next;
            q = q->next;
        }
        p->next = newNode;
        newNode->prev = p;
        newNode->next = q;
        q->prev = newNode;
        return head;
    }
}

// Deletion in an Double LinkedList.
struct Node* deletionInDLL(struct Node * head, int position){
    if(position == 0){
        struct Node *p = head, *q = head->next;
        p->next = NULL;
        q->prev = NULL;
        free(p);
        return q;
    }else if(position  == countNodes(head)-1){
        struct Node *p = head, *q = head->next;
        while(q->next != NULL){
            p = p->next;
            q = q->next;
        }
        p->next = NULL;
        q->prev = NULL;
        free(q);
        return head;
    }else{
        struct Node *p = head, *q = head->next;
        for (int i = 0; i < position - 1; i++){
            p = p->next;
            q = q->next;
        }
        struct Node *r = q->next;
        p->next = q->next;
        r->prev = p->next;
        q->next = NULL;
        q->prev = NULL;
        free(q);
        return head;
    }
}

int main(){

    struct Node *head, *second, *third, *fourth;
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    // Linking the Nodes
    head->data = 10;
    head->prev = NULL;
    head->next = second;

    second->data = 20;
    second->prev = head;
    second->next = third;

    third->data = 30;
    third->prev = second;
    third->next = fourth;

    fourth->data = 40;
    fourth->prev = third;
    fourth->next = NULL;

    // Function Call
    head = deletionInDLL(head, 1);
    traversalInDLL(head);

    return 0;
}