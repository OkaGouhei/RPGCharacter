
class Magician extends Character{
//javaでは継承時にコンストラクタが引き継がれないので、サブクラスの方でもコンストラクタを記載する必要があります。
//この時にsuper(呼び出したい親のコンストラクタの引数)を書く必要があります。
  public Magician(String name,int hp ,int mp,int attackPoint){
    super(name,hp,mp,attackPoint);
  }

  public void introduce(){
    System.out.println("私は魔法が使える"+name+"だ。私の体力は"+hp+"だ。私のマジックポイントは"+mp+"だ");
  }

  public void Magic(Character c){
    System.out.println(name +"の魔法攻撃!!");
    c.damage(mp*2,name);
  }
  public void Attack(Character c){
    Magic(c);
  }


}
