class Character{
  private int hp;
  private int mp;
  private int attackPoint;//攻撃力
  private String name;

//コンストラクタ
  public Character(){
    name = "名無し";
    // setHp(1000);
    hp = 1000;
    mp = 500;
    attackPoint = 10;
  }
  public void introduce(){
    System.out.println("私は"+name+"だ。私の体力は"+hp+"だ。私のマジックポイントは"+mp+"だ。私のアッタクポイントは"+attackPoint+"だ");
  }
  public void damage(int attackPoint,String name){
    System.out.println(this.name+"は"+name+"から" + attackPoint+"ポイントの攻撃を受けた");//this.name インスタンス変数 ,name 引数のname
    this.hp -= attackPoint;
  }

  public void Attack(Character c){
    System.out.println(name +"の攻撃");
    c.damage(attackPoint,name);
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getHp(){
    return hp;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public int getMp(){
    return mp;
  }

  public void setMp(int mp){
    this.mp = mp;
  }

  public int getAttackPoint(){
    return attackPoint;
  }

  public void setAttackPoint(int attackPoint){
    this.attackPoint = attackPoint;
  }
}
