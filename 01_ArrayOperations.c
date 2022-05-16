// Header Files 
#include <stdio.h>

int size = 4;
int capacity = 100;

// Traversal of an array.
void traversalArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Insertion of element into an array.
void insertion(int arr[],int element, int position){
    if(position >= capacity){
        printf("Element cannot be inserted\n");
    }else if(arr[position] = -1){
        arr[position] = element;
    }else{
        for (int i = size - 1; i >= position; i--){
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        size = size + 1;
    }
}

// Deletion of a value at particular position from an array.
int deletion(int arr[], int position, int size){
    if(position >= capacity){
        return -1;
    }else{
        for (int i = position + 1; i <= size - 1; i++){
            arr[i - 1] = arr[i];
        }
        size = size - 1;
        arr[size] = -1;
        return 1;
    }
}


int main()
{
    int arr[100] = {10, 20, 45, 25};
    traversalArray(arr, size);
    printf("%d\n", deletion(arr,0,size));
    traversalArray(arr, size);
    insertion(arr, 589, 3);
    traversalArray(arr, size);
    return 0;
}

