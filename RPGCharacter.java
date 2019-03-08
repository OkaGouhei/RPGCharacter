public class RPGCharacter{
  public static void main(String[] args){
    Character a;
    a = new Character("magician",1000,400,100);
    a.introduce();

    Character b;
    b = new Character("Emperor",1000,400,100);
    b.introduce();
    b.setAttackPoint(200);
    System.out.println(b.getName()+ "の" + "アタックポイントは" + b.getAttackPoint() +"になった");
    b.introduce();

    b.Attack(a);
    a.introduce();
  }
}
