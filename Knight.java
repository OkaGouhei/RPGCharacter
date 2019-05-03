
class Knight extends Character implements Movable{

  public Knight(String name,int hp ,int mp,int attackPoint){
    super(name,hp,mp,attackPoint);
  }

  public void introduce(){
    if(hp>0){
      System.out.println("私は国王に使える"+name+"だ。私の体力は"+hp+"だ。私のアタックポイントは"+attackPoint+"だ");
    }else{
      System.out.println(name + "は死んでいる");
    }
  }

  public void SpecialAttack(Character c){
    System.out.println(name +"の猛攻撃!!");
    c.damage(attackPoint*2,name);
  }

  @Override
  public void Attack(Character c){
    SpecialAttack(c);
  }

  @Override
  public void move(Character Target){
    System.out.println("騎士"+ name + "は"+Target.name + "を攻撃した！");
    Target.damage(attackPoint,name);
  }
}
