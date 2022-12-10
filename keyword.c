#include <stdio.h>
#include <conio.h>

 void main(){
    
    char keywords[32][16]={"int","if","else","switch","case","for","while","do","double","float","enum",
    "break","continue","return","struct","auto","long","register","typedef","char","extern","union","const",
    "short","unsigned","signed","void","default","goto","sizeof","volatile","static"};

    char data[10];
    printf("Enter any String:\t");
    gets(data);
    printf(keywords[0]);
    int flag=0;
    for(int i=0;i<32;i++){
        
        if( strcmp(data,keywords[i])){
           flag=1;
        }
    }
    
    if(flag==1){
         printf(" It is keyword ");
    }else{
         printf(" It is not keyword ");
    }
    getch();
 }