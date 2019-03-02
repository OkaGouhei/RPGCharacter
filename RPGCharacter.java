public class RPGCharacter{
  public static void main(String[] args){
    Character a;
    a = new Character();
    a.hp = 40;
    a.mp = 50 ;
    a.name = "magician";
    a.introduce();
    Character b;
    b = new Character();
    b.hp = 20;
    b.mp = 30 ;
    b.name = "Emperor";
    b.introduce();
  }
}
