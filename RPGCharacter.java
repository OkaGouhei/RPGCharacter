public class RPGCharacter{
  public static void main(String[] args){
    Character a;
    a = new Character();
    a.setName ("magician");
    a.introduce();

    Character b;
    b = new Character();
    b.setName ("Emperor");
    b.introduce();
    b.setAttackPoint(100);
    System.out.println(b.getName()+ "の" + "アッタクポイントは" + b.getAttackPoint() +"になった");
    b.introduce();

    b.Attack(a);
    a.introduce();
  }
}
