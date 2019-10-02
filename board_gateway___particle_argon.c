void myHandler(const char *event, const char *data)
{
  Serial.println(data);
  Particle.publish("gamesetting", data ? data : "none", PRIVATE);
}

void setup() {
    Serial.begin(9600);
    Mesh.subscribe("nfc-tag", myHandler);
}

void loop() {
}