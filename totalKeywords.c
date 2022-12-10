#include <stdio.h>
#include <conio.h>

 void main(){
    
    char keywords[32][16]={"int","if","else","switch","case","for","while","do","double","float","enum",
    "break","continue","return","struct","auto","long","register","typedef","char","extern","union","const",
    "short","unsigned","signed","void","default","goto","sizeof","volatile","static"};

    char data[10];
    int total=0;
   FILE *fp=fopen("keyword.c","r");
   if(fp=='\0'){
    printf("file not found\n");
    exit(0);
   }else{
        while (fscanf(fp,"%s",data)!=EOF){
          
           for(int i=0;i<32;i++){
        
        if( strcmp(data,keywords[i])){
           total++;
        }
    }
        }
       
        
   }
    
   
printf("Total keywords in file is %d",total);
    getch();
 }