#include <stdio.h>
#include <conio.h>

struct Characters
{
   char c;
   int freq;
};


 void main(){
    struct Characters ch[26];
    
    for(int i=0;i<26;i++){
        ch[i].c=i+'a';
       
        ch[i].freq=0;
    }
    char data;

    
    int total=0;
   FILE *fp=fopen("keyword.c","r");
   if(fp=='\0'){
    printf("file not found\n");
    exit(0);
   }else{
        while (fscanf(fp,"%s",data)!=EOF){
        for(int i=0;i<26;i++){
            if(data==ch[i].c){
                ch[i].freq++;
            }
        }
         
    }
        }
       
        
  
printf("character /t Occurrence");
 for(int i=0;i<26;i++){
           printf("%s /t %d",ch[i].c,ch[i].freq);
        }
    getch();
 }