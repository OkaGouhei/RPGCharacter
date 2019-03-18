package RPG;

public class RPGCharacter{
  public static void main(String[] args){
    Character a;
    a = new Character("名無し",1000,400,100);
    a.introduce();

    Character b;
    b = new Knight("hero",500,300,300);
    b.introduce();
    b.Attack(a);

    Character c;
    c = new Magician("magician",500,300,300);
    c.introduce();
    c.Attack(a);

  }
}
