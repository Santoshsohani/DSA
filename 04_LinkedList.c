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

// function call for traversal function.
    traversalLinkedList(head);

    return 0;
}