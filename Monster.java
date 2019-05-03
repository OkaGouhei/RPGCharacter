class Monster implements Movable{
  protected int hp;
  protected int mp;
  protected int attackPoint;
  protected String name;

  public Monster(String name,int hp ,int mp,int attackPoint){
    this.name = name; //インスタンス変数のnameに引数で受け取ったnameを代入
    this.hp = hp;
    this.mp = mp;
    this.attackPoint = attackPoint;
  }

  @Override
  public void move(Character Target){
    System.out.println("モンスター"+ name + "は"+Target + "を攻撃した！");
    Target.damage(attackPoint,name);
  }

}
