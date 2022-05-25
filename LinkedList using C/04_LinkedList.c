#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

// function for Traversal in a Linked List.
void traversalLinkedList(struct Node * pointer){
    while(pointer != NULL){
        printf("%d\n", pointer->data);
        pointer = pointer->next;
    }
}

// function to count Number of Nodes.
int countNodes(struct Node*ptr){
    int count = 1;
    while(ptr->next != NULL){
        ptr = ptr->next;
        count++;
    }
    return count;
}
// insertion in between
void insertionInBetween(int position, struct Node * h, int data){
    struct Node *newNode, *ptr = h;
    newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    for (int i = 1; i < position - 1; i++){
        ptr = ptr->next;
    }
    newNode->next = ptr->next;
    ptr->next = newNode;
}

// function for insertion at start.
struct Node * insertAtStart(struct Node * h,int data){
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->next = h;
    newNode->data = data;
    return newNode;
}

// function for insertion at end
void insertAtEnd(struct Node * head, int data){
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    struct Node *ptr = head;
    while (ptr->next != NULL)
    {
        ptr = ptr->next;
    }
    ptr->next = newNode;
    newNode->data = data;
    newNode->next = NULL;
}

// function to insert at after a particulat value.

void insertAfterValue(struct Node* h,int aftervalue, int data){
    struct Node *ptr, *newNode;
    newNode = (struct Node *)malloc(sizeof(struct Node));
    ptr = h;
    for (int i = 1; i <= countNodes(h); i++){
        if(ptr->data == aftervalue){
            break;
        }
        else{
            ptr = ptr->next;
        }
    }
    newNode->data = data;
    newNode->next = ptr->next;
    ptr->next = newNode;
}

int main(){
    struct Node *head, *second, *third, *fourth;

    // Creation of Nodes
    head = (struct Node*)malloc(sizeof(struct Node));
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

// function call for all the Insertion functions.
    insertAfterValue(head, 897, 456);
    traversalLinkedList(head);
    return 0;
}