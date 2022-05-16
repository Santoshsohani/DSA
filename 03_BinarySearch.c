// Binary search in an array using C.
// Binary search is used only when the array is sorted.

#include<stdio.h>

int binarySearch(int arr[], int element, int low, int high){
    int mid = (low + high) / 2;
    while(low <= high){
        if(element == arr[mid]){
            return mid;
        }else if(element < arr[mid]){
            return binarySearch(arr, element, low, mid - 1);
        }else{
            return binarySearch(arr, element, mid + 1, high);
        }
    }
}

int main(){
    int array[] = {10, 20, 30, 45, 65, 75, 89, 250, 265, 589, 698, 789, 1000};
    int size = sizeof(array) / sizeof(int);
    int result = binarySearch(array, 75, 0, size);
    printf("%d\n", result);
    return 0;
}

