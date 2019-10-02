#include "RFID.h"

#define SS_PIN      A2
#define RST_PIN     D2
#define MOSI_PIN    D3
#define MISO_PIN    D4
#define SCK_PIN     D5

RFID RC522(SS_PIN, RST_PIN, MOSI_PIN, MISO_PIN, SCK_PIN);


void setup()
{ 
  Serial.begin(9600);
  
  RC522.init();
}

bool flag = false;

void loop()
{
  uint8_t i;

  if (RC522.isCard())
  {
    flag = false;
    String address = "";
    RC522.readCardSerial();

    Serial.println("Card detected:");

    for(i = 0; i <= 4; i++)
    {
      Serial.print(RC522.serNum[i],HEX);
      address += String(RC522.serNum[i],HEX);
      Serial.print(" ");
    }
    
    Serial.println();
    Serial.println(address);
    Mesh.publish("nfc-tag", address);
  }
  else {
      if (!RC522.isCard()) {
          Serial.println("Card NOT detected");
          if( !flag ) {
              flag = true;
              Mesh.publish("nfc-tag", "none");
          }
      }
  }
      
  delay(1000);
}