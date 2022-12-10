#include <stdio.h>
#include <conio.h>

 void main(){
    
    char operators[14][3]={'+','-','*','/','%','^','(',')','>','<','=','!','++','--'};

    char data[3];
    int total=0;
   FILE *fp=fopen("keyword.c","r");
   if(fp=='\0'){
    printf("file not found\n");
    exit(0);
   }else{
        while (fscanf(fp,"%s",data)!=EOF){
        
           for(int i=0;i<14;i++){
        
        if( strcmp(data,operators[i])){
           total++;
        }
    }
        }
       
        
   }
    
   
printf("Total Operators in file is %d",total);
    getch();
 }