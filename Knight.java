class Knight extends Character{
  public Knight(String name,int hp ,int attackPoint){
    this.name = name; //インスタンス変数のnameに引数で受け取ったnameを代入
    this.hp = hp;
    this.attackPoint = attackPoint;
  }
  public void introduce(){
    System.out.println("私は国王に使える"+name+"だ。私の体力は"+hp+"だ。私のアタックポイントは"+attackPoint+"だ");
  }

  public void SpecialAttack(Character c){
    System.out.println(name +"の猛攻撃!!");
    c.damage(attackPoint*2,name);
  }
  public void Attack(Character c){
    SpecialAttack(c);
  }

}
