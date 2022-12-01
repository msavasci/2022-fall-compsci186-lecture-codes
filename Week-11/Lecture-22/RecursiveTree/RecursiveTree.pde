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

void tree(int levels, float size) {
  if (levels == 1) {
    move(size);
    move(-size);
  }
  else {
    move(size);
    turn(-90);
    tree(levels - 1, 0.75 * size);
    turn(180);
    tree(levels - 1, 0.75 * size);
    turn(-90);
    move(-size);
  }
}

void draw() {
  tree(6, 200);
}
