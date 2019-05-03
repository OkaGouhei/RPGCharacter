
class Magician extends Character implements Movable{
//javaでは継承時にコンストラクタが引き継がれないので、サブクラスの方でもコンストラクタを記載する必要がある。
//この時にsuper(呼び出したい親のコンストラクタの引数)を書く必要がある。
  public Magician(String name,int hp ,int mp,int attackPoint){
    super(name,hp,mp,attackPoint);
  }

  public void introduce(){
    if(hp>0){
    System.out.println("私は魔法が使える"+name+"だ。私の体力は"+hp+"だ。私のマジックポイントは"+mp+"だ");
    }else{
      System.out.println(name + "は死んでいる");
    }
  }

  public void Magic(Character c){
    System.out.println(name +"の魔法攻撃!!");
    c.damage(mp*2,name);
  }

  @Override
  public void Attack(Character c){
    Magic(c);
  }

  @Override
  public void move(Character Target){
    System.out.println("マジシャン"+ name + "は"+Target.name + "を攻撃した！");
    Target.damage(mp,name);
  }

}
