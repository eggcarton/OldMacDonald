class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  public Chick(String type, String sound1, String sound2)
  {    
    myType = type;
    for (int i = 0; i < 10; i++) //change 10 to .length
      if (i%2 == 0)
        mySound = sound1;
      else 
        mySound = sound2;
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    return mySound;
  }
}