void setup(){
  size(600, 600);
}
void draw(){
  for(int i=8; i>0; i--){
  if(i%2==0){
  fill(#FF0000);}
  else{
  fill(#000000);
}
ellipse(300, 300, i*50, i*50);
}
}