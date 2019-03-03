int x1=150; 
int x2=450;
void setup(){
  size(600, 600);
}
void draw(){
  background(#BCBCB8);
  for(int i=20; i>0; i--){
noFill();
    ellipse(x1, 300, i*10, i*10);
}
for(int i=20; i>0; i--){
noFill();
    ellipse(x2, 300, i*10, i*10);
}
x1++;
x2--;
if(x1>600){
  x1=0;
}
if(x2<0){
  x2=600;
}
}