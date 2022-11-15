float penX;
float penY;
float penDirection;

void setup() {
  size(600, 600);
  background(255);
  penX = width / 2;
  penY = height / 2;
  noLoop();
}

void turn(float directions) {
  penDirection += directions;
}

void move(float amount) {
  float newX = penX + sin(radians(penDirection)) * amount;
  float newY = penY - cos(radians(penDirection)) * amount;
  
  line(penX, penY, newX, newY);
  
  penX = newX;
  penY = newY;
}

void mousePressed() {
  loop();
}

void mouseReleased() {
  noLoop();
}

void randomWalk(float amount) {
  turn(random(360));
  stroke(random(255), random(255), random(255));
  move(random(amount));
}

void draw() {
  randomWalk(20);
  //move(50);
  //turn(90);
  //move(50);
  //turn(90);
  //move(50);
  //turn(90);
  //move(50);
  //turn(90);
  
}
