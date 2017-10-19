class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  private int i;
  public Chick(String type, String sound1, String sound2)
  {    
    myType = type;
    i = (int)(Math.random()*2);
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