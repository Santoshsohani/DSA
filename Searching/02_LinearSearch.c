// Linear search in C programming.

#include <stdio.h>

int linearSearch(int array[], int size, int element){
    for (int i = 0; i < size; i++)
    {
        if(array[i] == element){
            return i;
        }
    }
    return -1;
}

void main(){
    int array[] = {10, 20, 30, 401, 50};
    int size = sizeof(array) / sizeof(int);
    int ls = linearSearch(array, size, 40);
    printf("%d\n", ls);
}