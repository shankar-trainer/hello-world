#include<stdio.h>

int main(){
    int variable;
    int *ptr = &variable;
    *ptr = 20;
    printf("%d", *ptr);
    return 0;
}
