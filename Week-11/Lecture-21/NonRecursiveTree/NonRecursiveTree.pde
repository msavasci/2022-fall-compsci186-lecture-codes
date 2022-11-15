float penX;
float penY;
float penDirection;

void setup() {
  size(600, 600); // It creates a viawable (x, y) triangle to draw on.
  penX = width / 2;
  penY = height * 0.9;
  background(255); // sets the entire background to white.
  noLoop(); // tells Processing that once we start to draw, call draw() only one time; 
            // otherwise (by default) it is called repeatedly in an endless loop
}

void move(float amount) {
  float newX = penX + sin(radians(penDirection)) * amount;
  float newY = penY - cos(radians(penDirection)) * amount;
  
  line(penX, penY, newX, newY);
  
  penX = newX;
  penY = newY;
}

void turn(float degrees) {
  penDirection += degrees;
}

void tree1(float size) {
  move(size);
  move(-size);
}

void tree2(float size) {
    move(size);
    turn(-15);
    //move(size * 0.75);
    //move(-size * 0.75);
    tree1(size);
    turn(30);
    //move(size * 0.75);
    //move(-size * 0.75);
    tree1(size);
    turn(-15);
    move(-size);
}

void tree3(float size) {
    move(size);
    turn(-15);
    //move(size * 0.75);
    //move(-size * 0.75);
    tree2(size);
    turn(30);
    //move(size * 0.75);
    //move(-size * 0.75);
    tree2(size);
    turn(-15);
    move(-size);
}

void draw() {
  tree3(100);
}
